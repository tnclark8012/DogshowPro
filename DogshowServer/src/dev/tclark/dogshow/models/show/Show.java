package dev.tclark.dogshow.models.show;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@PersistenceCapable
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
	@Id
	@XmlElement
	private Long id;
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	@XmlElement
	private String showName;

	@XmlElement
	@Persistent
	private Date startDate;

	@XmlElement
	@Persistent
	private Date endDate;

	@XmlElement(name="Days")
	@Persistent
	List<ShowDay> showDays;

	public Show()
	{
		startDate = new Date();
		endDate = new Date();
		showName = "Taylor's Dog Show";
	}
	public Show(String showName, Date startDate, Date endDate,
			List<ShowDay> showDays) {
		this.showName = showName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.showDays = showDays;
	}

	public String getShowName() {
		return showName;
	}

	public List<ShowDay> getShowDays() {
		return showDays;
	}

	public Show(String showName, Date startDate, Date endDate, JSONObject json)
	{
//		JSONArray ringArray = json.getJSONArray("Rings");
//		ShowDay day = new ShowDay(startDate);
//		for( int i = 0; i < ringArray.length(); i++)
//		{
//			ringArray.get(i);
//		}
		//this(showName, startDate, endDate, );
	}
}
