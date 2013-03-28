package dev.tnclark8012.dogshow.apps.android.sync;

public interface ApiAccessor {
	
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
