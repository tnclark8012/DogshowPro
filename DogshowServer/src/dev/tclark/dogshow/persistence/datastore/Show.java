package dev.tclark.dogshow.persistence.datastore;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;

@XmlRootElement
public class Show implements Storable, CustomKeyName{
	
	@XmlElement
	private String showName;

	@XmlElement
	private long startDateMillis;
	
	@XmlElement
	private String city;
	@XmlElement
	private String state;
	@XmlElement
	private String showId;

	public Show()
	{
		startDateMillis = new Date().getTime();
		showId = "Dummy";
		city = "Anytown";
		state = "Your state";
		showName = "Taylor's Dog Show";
	}
	
	public String getShowName() {
		return showName;
	}
	
	public long getStartDate()
	{
		return startDateMillis;
	}
	
	
	public Show(Entity entity)
	{
		showName = (String)entity.getProperty("showName");
		System.out.println("Setting entity showName to " + showName);
		startDateMillis = (Long)entity.getProperty("startDate");
		city = (String) entity.getProperty("city");
		state = (String)entity.getProperty("state");
		showId = (String)entity.getProperty("showId");
	}
	
	public Show(String name, long startDate, String city, String state, String showId)
	{
		this.showName = name;
		this.startDateMillis = startDate;
		this.city = city;
		this.state = state;
		this.showId = showId;
	}
	@Override
	public Entity toDatastoreEntity() {
		Entity e = new Entity(Show.class.getSimpleName(), getKeyName());
		e.setProperty("showName", showName);
		e.setProperty("startDate", startDateMillis);
		e.setProperty("city", city);
		e.setProperty("state", state);
		e.setProperty("showId", showId);
		return e;
	}

	@Override
	public String getKeyName() {
		return KeyNameHelper.generateKeyName(showName);
	}
}
