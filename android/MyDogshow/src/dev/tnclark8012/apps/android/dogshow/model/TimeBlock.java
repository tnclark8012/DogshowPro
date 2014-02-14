package dev.tnclark8012.apps.android.dogshow.model;

import java.util.Date;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class TimeBlock {
	@DatabaseField
	Date startTime;
	
	@ForeignCollectionField(eager = false)
	ForeignCollection<BreedRing> breedRings;
	

}
