package dev.tclark.dogshow.apps.android.model;

import com.j256.ormlite.field.DatabaseField;

public class Dog {
	@DatabaseField(generatedId = true)
	int id;
	@DatabaseField
	private String mCallName;
	
	public Dog()
	{}
}
