package dev.tnclark8012.apps.android.dogshow.model;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class ShowRing{
	@DatabaseField
	int mRingNumber;
	
	@DatabaseField
	String mJudgeName;
	
	@DatabaseField
	Date date;
}
