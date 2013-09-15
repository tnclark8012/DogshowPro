package dev.tclark.dogshow.util.datedetection;

import java.util.LinkedList;
import java.util.List;

import dev.tclark.dogshow.persistence.datastore.ShowRing;

public class ShowDay {
	private List<ShowSection> mShowSections;
	public ShowDay(){
		mShowSections = new LinkedList<ShowSection>();
	}
	public void addSection(ShowSection section)
	{
		mShowSections.add(section);
	}
	public List<ShowRing> getRings(){
		List<ShowRing> rings = new LinkedList<ShowRing>();
		for(ShowSection s : mShowSections)
		{
			rings.addAll(s.ringStack);
		}
		return rings;
	}
}
