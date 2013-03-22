package dev.tnclark8012.dogshow.apps.android.model;

import com.j256.ormlite.field.DatabaseField;

public class BreedRing extends AbstractModel{
	@DatabaseField
	int mDogsCount;
	
	@DatabaseField
	int mBitchesCount;
	
	@DatabaseField
	int mSpecialDogsCount;
	
	@DatabaseField
	int mSpecialBitchesCount;
	
	@DatabaseField
	int mTotal;
	
	public BreedRing(int total, int dogCount, int bitchCount, int specialDogCount, int specialBitchCount)
	{
		mTotal = total;
		mDogsCount = dogCount;
		mBitchesCount = bitchCount;
		mSpecialDogsCount = specialDogCount;
		mSpecialBitchesCount = specialBitchCount;
	}
}
