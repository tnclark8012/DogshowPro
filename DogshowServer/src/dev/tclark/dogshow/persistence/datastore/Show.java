package dev.tclark.dogshow.persistence.datastore;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@XmlRootElement
public class Show {
	public static Show createDummyInstance(long id, String name)
	{
		return new Show(id, name);
	}
	
	private Show(long id, String name)
	{
		this.id = id;
		this.showName = name;
	}
	
	@XmlElement
	private Long id;
	
//	@PrimaryKey
//	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
//	private Key key;

	@XmlElement
	private String showName;

	@XmlElement
	private Date startDate;

//	@XmlElement
	private Date endDate;
	@XmlElement
	private String name;
	@XmlElement
	private String city;
	@XmlElement
	private String state;
	@XmlElement
	private String programCode;

	public Show()
	{
		startDate = new Date();
		endDate = new Date();
		showName = "Taylor's Dog Show";
	}
	public Show(String showName, Date startDate) {
		this.showName = showName;
		this.startDate = startDate;
	}

	public String getShowName() {
		return showName;
	}

	public Show(String showName, Date startDate, Date endDate, JSONObject json)
	{
		
	}
	
	public Entity toEntity()
	{
		Entity e = new Entity(Show.class.getSimpleName());
		e.setProperty("name", showName);
		e.setProperty("startDate", startDate.getTime());
		e.setProperty("city", city);
		e.setProperty("state", state);
		e.setProperty("programCode", programCode);
		return e;
	}
	
	
	public static Show fromEntity(Entity entity)
	{
		String name = (String)entity.getProperty("name");
		long start = (Long)entity.getProperty("startDate");
		String city = (String) entity.getProperty("city");
		String state = (String)entity.getProperty("state");
		String programCode = (String)entity.getProperty("programCode");
		return new Show(name, start, city, state, programCode);
	}
	
	public Show(String name, long start, String city, String state, String programCode)
	{
		this.name = name;
		this.startDate = new Date(start);
		this.city = city;
		this.state = state;
		this.programCode = programCode;
	}
}
