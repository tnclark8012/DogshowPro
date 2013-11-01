package dev.tnclark8012.dogshow.util.datedetection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dev.tnclark8012.dogshow.exceptions.NotImplementedException;
import dev.tnclark8012.dogshow.persistence.datastore.ShowRing;
/**
 * Is TSTST => TS TS T
 * SSTT => ? 3 or 4 day show
 * This class determines the date differentiation of a list of show rings. Assumptions:
 * * Monotonically increasing ring numbers are in the same section
 * * There's a maximum of 1 "Traditional" show section per day
 * * "Traditional" and "Specialty" show sections can be on the same date, but may not be
 * * Consecutive "Specialty" sections are on different days
 * * "Specialty" sections always start on the first day of the show
 * * "Specialty" sections never occur on the last day of the show
 * @author Taylor
 * 
 * 2 day shows:
 * T T
 * ST T
 * 
 * 
 * 3 day shows:
 * S T T
 * S ST T
 * T T T
 * 4 day shows:
 * T T T T
 * S T T T
 * S S T T
 * S ST ST T
 * S ST T T
 * S S ST T
 */
public class DateDetector {
	/*
	 * The process for creating ShowDays is as follows:
	 * 1. Use ring numbers to divide them into sections (Traditional or Specialty)
	 * 2. Build a section bitmask (1=Specialty, 0=Traditional) of the section order (left->right, first->last)
	 * 3. Use the section bitmask to index into a "new day" bitmask based on the number of days on which the show takes place
	 * 4. The "new day" bitmask is read from "right-to-left". For each show section, read the LSBit. If 1, that section starts a new day. If 0, It belongs on the same day as the previous section
	 * 5. Partition the sections into days!
	 */
	static Map<Integer,Integer> newDayMapTwoDays;
	{
		newDayMapTwoDays = new HashMap<Integer, Integer>();
		newDayMapTwoDays.put(0x11, 0x11);//SS
		newDayMapTwoDays.put(0x100, 0x101);//STT
		newDayMapTwoDays.put(0x010, 0x101);//TST
		newDayMapTwoDays.put(0x00, 0x11);//TT
		
	}
	static Map<Integer,Integer> newDayMapThreeDays;
	{
		newDayMapThreeDays = new HashMap<Integer, Integer>();
		newDayMapThreeDays.put(0x000, 0x111);//TTT
		newDayMapThreeDays.put(0x100, 0x101);//STT
		newDayMapThreeDays.put(0x1100, 0x1011);//SSTT -> S ST T
		newDayMapThreeDays.put(0x0100, 0x1011);//TSTT -> TS S
		newDayMapThreeDays.put(0x1000, 0x1011);//STTT -> ST T T
		//TSTST -> TS TS T OR T ST ST ??? It's TS TS T. No Specials on last day of show
	}
	static Map<Integer,Integer> fourDays;
	{
		fourDays = new HashMap<Integer, Integer>();
		fourDays.put(0x1100, 0x1111);//SSTT
		fourDays.put(0x11100, 0x10111);//SSSTT
		fourDays.put(0x110100, 0x101011);//SSTSTT
		fourDays.put(0x11000, 0x11011);//SSTTT
		fourDays.put(0x1000, 0x1111);//STTT
		fourDays.put(0x1111, 0x1111);//SSSS
		fourDays.put(0x0000, 0x1111);//TTTT
		fourDays.put(0x001100, 0x1111);//TTSSTT
//		fourDays.put(0x, 0x1111);//TSTSTT -> TS TS T T OR T ST ST T   THIS IS A PROBLEM TODO
	}
	private enum SectionType
	{
		TRADITIONAL,
		SPECIALTY
	};

	public DateDetector(List<ShowSection> sections)
	{
		List<SectionHelper> sectionHelpers = new ArrayList<SectionHelper>(sections.size());
	}
	
	class SectionHelper{
		ShowSection section;
		SectionType type;
		/** Assumptions for determining SectionTypes
		 * * "Traditional" show sections start with ring 1 
		 * * "Traditional" show sections end with group rings/best of breed
		 * * "Specialty" show sections have disparate ring numbers (Ex: 1,4,9,9,10)
		 * * "Specialty" show sections have few breeds
		 */
		SectionHelper(ShowSection section)
		{
			if(section.startRingNumber() == 1 && section.ringsAreConsecutive())
			{
				type = SectionType.TRADITIONAL;
			}
			else
			{
				type = SectionType.SPECIALTY;
			}
			this.section = section;
		}
		
	}
	
	/**
	 * The algorithm follows the DateDetection assumptions and does the following:
	 * * divide rings into sections based on ring numbers
	 * * 
	 * @param rings
	 */
	public ShowDay[] run(int numberOfDays, List<ShowRing> rings)
	{
		List<ShowSection> sections = buildSections(rings);
		List<SectionHelper> helpers = new ArrayList<SectionHelper>(sections.size());
		for(ShowSection s : sections)
		{
			SectionHelper helper = new SectionHelper(s);
			helpers.add(helper);
		}
		int sectionMask = buildSectionMask(helpers);
		int newDayMask = getNewDayMaskMap(numberOfDays).get(sectionMask);
		return buildShowDays(numberOfDays, newDayMask, helpers);
	}
	
	private ShowDay[] buildShowDays(int numberOfDays, int newDayBitmask, List<SectionHelper> sections)
	{
		ShowDay[] days = new ShowDay[numberOfDays];
		for(int currentDayIndex = -1; !sections.isEmpty(); newDayBitmask=newDayBitmask>>1)
		{
			if((newDayBitmask&0x1) == 0x1)
			{
				currentDayIndex++;
				days[currentDayIndex] = new ShowDay();
			}
			days[currentDayIndex].addSection(sections.remove(0).section);
		}
		return days;
	}
	
	private int buildSectionMask(List<SectionHelper> sections)
	{
		int mask = 0x0;
		int specialMask = 0x1;
		for(SectionHelper s : sections)
		{
			if(s.type == SectionType.SPECIALTY)
			{
				mask = mask | specialMask;
			}
			mask = mask << 1;
		}
		return mask;
	}
	
	
	private List<ShowSection> buildSections(List<ShowRing> rings)
	{
		
		int prevRingNumber = Integer.MIN_VALUE;
		List<ShowSection> sections = new LinkedList<ShowSection>();
		ShowSection currentSection = new ShowSection();
		for(ShowRing ring : rings)
		{
			if( ring.getRingNumber() < prevRingNumber )
			{
				sections.add(currentSection);
				currentSection = new ShowSection();
			}
			currentSection.pushRing(ring);
			prevRingNumber = ring.getRingNumber();
		}
		sections.add(currentSection);
		return sections;
	}

	public List<ShowDay> getShowDays(long [] dates){
		throw new NotImplementedException();
	}
	
	private Map<Integer, Integer> getNewDayMaskMap(int numberOfDays)
	{
		switch(numberOfDays)
		{
		case 2:
			return newDayMapTwoDays;
		case 3:
			return newDayMapThreeDays;
		case 4:
			return fourDays;
		default:
			return null;
		}
	}
}
