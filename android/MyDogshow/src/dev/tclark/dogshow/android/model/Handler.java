package dev.tclark.dogshow.android.model;

import java.util.List;
import java.util.Map;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.field.DatabaseField;

public class Handler extends AbstractModel{
		
		@DatabaseField(index = true)
		private String mName;
//		@ForeignCollectionField(eager = true)
//	    ForeignCollection<Dog> preferredDogs;

		public Handler(){}
	    public Handler(String name, List<Dog> preferredDogs)
	    {
	    	mName = name;
	    }
	    

	    public String getName()
	    {
	    	return mName;
	    }
}
