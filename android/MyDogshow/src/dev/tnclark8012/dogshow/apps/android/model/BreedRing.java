package dev.tnclark8012.dogshow.apps.android.model;

public class BreedRing {
	public String showId;
	public long dateMillis;
	public String judge;
	public int ringNumber;
	public long blockStartMillis;
	public int count;
	public String breedName;
	public int dogCount;
	public int bitchCount;
	public int specialDogCount;
	public int specialBitchCount;
	public int countAhead;

	@Override
	public String toString() {
		return breedName + "; Ring " + ringNumber + "; block "
				+ blockStartMillis;
	}
}
