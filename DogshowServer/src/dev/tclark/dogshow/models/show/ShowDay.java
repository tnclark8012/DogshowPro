package dev.tclark.dogshow.models.show;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class ShowDay {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY )
	Key key;
	
	@Persistent
	Date date;
	
	public ShowDay(Date date){
		this.date = date;
	}
	
	public Date getDate()
	{
		return date;
	}
	
}
