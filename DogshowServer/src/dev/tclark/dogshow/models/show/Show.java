package dev.tclark.dogshow.models.show;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Show {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String showName;
	
	@Persistent
	private Date startDate;
	
	@Persistent
	private Date endDate;
	
	@Persistent
	List<ShowDay> showDays;
	
	public Show(String showName, Date startDate, Date endDate, List<ShowDay> showDays)
	{
		this.showName = showName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.showDays = showDays;
	}
	
	public String getShowName(){
		return showName;
	}
	
	public List<ShowDay> getShowDays(){
		return showDays;
	}
}
