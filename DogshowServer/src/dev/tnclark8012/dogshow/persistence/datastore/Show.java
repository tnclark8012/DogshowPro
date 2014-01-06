package dev.tnclark8012.dogshow.persistence.datastore;

import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.com.google.common.base.Joiner;
import com.google.appengine.labs.repackaged.com.google.common.primitives.Longs;
import com.google.appengine.labs.repackaged.org.json.JSONException;

import dev.tnclark8012.dogshow.util.Utils;

@XmlRootElement
public class Show implements Storable, CustomKeyName {

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

	/*
	 * New members
	 */
	@XmlElement
	private String[] clubNames;

	@XmlElement
	private long[] dates;

	@XmlElement
	private Location[] locations;

	public Show() {
		startDateMillis = new Date().getTime();
		showId = "Dummy";
		city = "Anytown";
		state = "Your state";
		showName = "Taylor's Dog Show";
	}

	public String getShowName() {
		return showName;
	}

	public long getStartDate() {
		return startDateMillis;
	}

	public Show(Entity entity) {
		showName = (String) entity.getProperty("showName");
		startDateMillis = (Long) entity.getProperty("startDate");
		city = (String) entity.getProperty("city");
		state = (String) entity.getProperty("state");
		showId = (String) entity.getProperty("showId");
		clubNames = ((String)entity.getProperty("clubs")).split("\\|");
		String s = (String)entity.getProperty("dates");
		dates = Utils.stringArrayToLongArray(((String)entity.getProperty("dates")).split("\\|"));
		locations = Location.fromStringArray(((String)entity.getProperty("locations")).split("\\|"));
	}

	public Show( String showId, String name, long startDate, String city, String state) throws JSONException {
		this(showId, new String[]{name}, new long[]{startDate}, new Location[]{new Location(city,state, 0,0)} );
	}

	public Show(String showId, String[] clubs, long[] dates, Location[] locations) throws JSONException {
		this.showName = clubs[0];
		this.startDateMillis = dates[0];
		this.city = locations[0].city;
		this.state = locations[0].state;
		this.showId = showId;
		this.clubNames = clubs;
		this.dates = dates;
		this.locations = locations;
	}

	@Override
	public Entity toDatastoreEntity() {
		Entity e = new Entity(Show.class.getSimpleName(), getKeyName());
		e.setProperty("showName", showName);
		e.setProperty("startDate", startDateMillis);
		e.setProperty("city", city);
		e.setProperty("state", state);
		e.setProperty("showId", showId);
		e.setProperty("clubs", Joiner.on('|').join(Arrays.asList(clubNames)));
		String s = Joiner.on('|').join(Arrays.asList(dates));
		
		e.setProperty("dates", Joiner.on('|').join(Longs.asList(dates)));
		e.setProperty("locations", Joiner.on('|').join(Location.arrayToString(locations)));
		System.out.println("Setting entity showName to " + showName + " on " + new Date(startDateMillis));
		return e;
	}

	@Override
	public String getKeyName() {
		return KeyNameHelper.generateKeyName(showId);
	}
	
	public long[] getDates()
	{
		return dates;
	}
}