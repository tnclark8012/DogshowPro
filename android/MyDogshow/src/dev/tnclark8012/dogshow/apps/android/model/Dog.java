package dev.tnclark8012.dogshow.apps.android.model;

import com.j256.ormlite.field.DatabaseField;

public class Dog {
	private String mCallName;

	
	int mPoints;
	
	
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
