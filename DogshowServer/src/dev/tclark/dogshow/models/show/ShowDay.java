package dev.tclark.dogshow.models.show;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.labs.repackaged.org.json.JSONArray;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
@XmlRootElement(name="ShowDay")
public class ShowDay {

	@Id
	private Long id;
	@XmlElement
	private String showName;
	@XmlElement
	private Date date;
	@XmlElement(name="Rings")
	private List<ShowRing> rings;
	public ShowDay()
	{
		date = new Date();
		showName = "Taylor's Kennel Club Dog Show";
		rings = new ArrayList<ShowRing>();
	}
	
	public ShowDay(Date date){
		this.date = date;
		
	}
	
	public ShowDay(Date date, JSONObject json) throws JSONException{
		this.date = date;
		JSONArray rings = json.getJSONArray("Rings");
		for(int i = 0; i < rings.length(); i++ )
		{
			
		}
		
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public void addShowRing(ShowRing ring)
	{
		rings.add(ring);
		ring.setShowDay(this);
//		Objectify service = getService();
//		service.put(ring);
	}
	
	private static Objectify getService()
	{
		return ObjectifyService.begin();
	}
	
}
