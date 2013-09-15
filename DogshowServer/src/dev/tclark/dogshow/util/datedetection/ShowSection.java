package dev.tclark.dogshow.util.datedetection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import dev.tclark.dogshow.persistence.datastore.ShowRing;
/**
 * Container for a collection of <b>in order</b> show rings. ShowSections are implemented as a queue. That is, rings cannot be removed from a section, only added.
 * @author Taylor
 *
 */
public class ShowSection {
//	private List<ShowRing> rings;
	LinkedList<ShowRing> ringStack;
	private boolean ringsAreConsecutive = true;
	Set<String> typeSet;//Set of unique breeds/junior classes
	public ShowSection()
	{
		ringStack = new LinkedList<ShowRing>();
		typeSet = new HashSet<String>();
	}
	public ShowSection(ShowRing... showRings)
	{
		ringStack = new LinkedList<ShowRing>();
		typeSet= new HashSet<String>();
//		rings = new ArrayList<ShowRing>(Arrays.asList(showRings));
		for(ShowRing ring : showRings)
		{
			pushAndUpdate(ring);
		}
	}
	
	/**
	 * Gets the number of the first ring in the section. 
	 * @return the ring number. If the section is empty, returns -1
	 */
	public int startRingNumber()
	{
		return (ringStack.isEmpty())? -1 : ringStack.peek().getRingNumber();
	}
	
	public boolean isEmpty()
	{
		return ringStack.isEmpty();
	}
	
	/**
	 * Gets the number of the last ring in the section. 
	 * @return the ring number. If the section is empty, returns -1
	 */
	public int endRingNumber()
	{
		return (ringStack.isEmpty()) ? -1 : ringStack.getLast().getRingNumber();
	}
	
	public int getTypeCount(){
		return typeSet.size();
	}
	
	public boolean ringsAreConsecutive()
	{
		return ringsAreConsecutive;
	}
	
	private void pushAndUpdate(ShowRing ring)
	{
		if( !ringStack.isEmpty() && ring.getRingNumber() != ringStack.getLast().getRingNumber() + 1)
		{
			ringsAreConsecutive = false;
		}
		ringStack.add(ring);
		typeSet.add(ring.getTypeString());
	}
	public void pushRing(ShowRing ring)
	{
		pushAndUpdate(ring);
	}
}
