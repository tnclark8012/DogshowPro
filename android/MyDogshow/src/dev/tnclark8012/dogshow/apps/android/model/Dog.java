package dev.tnclark8012.dogshow.apps.android.model;

import com.j256.ormlite.field.DatabaseField;

public class Dog extends AbstractModel {

	@DatabaseField
	private String mCallName;

	@DatabaseField
	int mPoints;
	
	@DatabaseField
	int mMajors;

	public Dog() {

	}
	
	public int getPoints()
	{
		return mPoints;
	}
	
	public int getMajors()
	{
		return mMajors;
	}
}
