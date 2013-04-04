package dev.tnclark8012.dogshow.apps.android.model;

import com.j256.ormlite.field.DatabaseField;

public class BreedRing extends AbstractModel{
	public String showId;
	public long dateMillis;
	public String judge;
	public int ringNumber;
	public long blockStartMillis;
	public int count;
	public String breed;
	public int dogCount;
	public int bitchCount;
	public int specialDogCount;
	public int specialBitchCount;
	public int countAhead;
}
