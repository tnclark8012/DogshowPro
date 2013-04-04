package dev.tclark.dogshow.persistence.datastore;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@XmlRootElement
public class Show implements Storable, CustomKeyName{
	
	@XmlElement
	private String showName;

	@XmlElement
	private long startDateMillis;

	@XmlElement
	private String name;
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
		name = (String)entity.getProperty("name");
		startDateMillis = (Long)entity.getProperty("startDate");
		city = (String) entity.getProperty("city");
		state = (String)entity.getProperty("state");
		showId = (String)entity.getProperty("showId");
	}
	
	public Show(String name, long startDate, String city, String state, String showId)
	{
		this.name = name;
		this.startDateMillis = startDate;
		this.city = city;
		this.state = state;
		this.showId = showId;
	}
	@Override
	public Entity toDatastoreEntity() {
		Entity e = new Entity(Show.class.getSimpleName(), getKeyName());
		e.setProperty("name", showName);
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
