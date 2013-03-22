package dev.tnclark8012.dogshow.apps.android.sync;

public interface ApiAccessor {
	/**
	 * TODO
	 * Kennel Name: password. Have to OK by creator of Kennel?
	 * 	Gives back kennel ID
	 * 
	 * 
	 * 
	 */
	
	/**
	 * long showId
	 * long[] breed IDs
	 */
	public void getShowRingsForBreed();
	
	/**
	 * long showId
	 * Date day
	 * long[] breed IDs
	 */
	public void getRingsForDayByBreed();
}
