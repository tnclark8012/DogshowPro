package dev.tnclark8012.dogshow.util.datedetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import dev.tnclark8012.dogshow.exceptions.NotImplementedException;
import dev.tnclark8012.dogshow.persistence.datastore.ShowRing;
/**
 * Is TSTST => TS TS T
 * SSTT => ?
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
		}
	}
	
	/**
	 * The algorithm follows the DateDetection assumptions and does the following:
	 * * divide rings into sections based on ring numbers
	 * * 
	 * @param rings
	 */
	public void run(List<ShowRing> rings)
	{
		throw new NotImplementedException();
		
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
		}
		//return sections
		throw new NotImplementedException();
	}

	public List<ShowDay> getShowDays(){
		throw new NotImplementedException();
	}
	
}
