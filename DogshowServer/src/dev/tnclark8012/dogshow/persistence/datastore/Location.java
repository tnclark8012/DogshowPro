package dev.tnclark8012.dogshow.persistence.datastore;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@XmlRootElement
public class Location {
	@XmlElement
	public String city;
	@XmlElement
	public String state;
	@XmlElement
	public long lattitude;
	@XmlElement
	public long longitude;

	public Location(String city, String state, long lattitude, long longitude) {
		this.city = city;
		this.state = state;
		this.lattitude = lattitude;
		this.longitude = longitude;
	}

	private Location()
	{
		
	}
	
	public JSONObject toJson() {
		try {
			JSONObject json = new JSONObject();
			json.put("city", city);
			json.put("state", state);
			json.put("lattitude", lattitude);
			json.put("longitude", longitude);
			return json;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String[] arrayToString(Location[] array)
	{
		String[] a = new String[array.length];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = array[i].toJson().toString();
		}
		return a;
	}
	
	public static Location[] fromStringArray(String[] array)
	{
		Location[] a = new Location[array.length];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = Location.fromJson(array[i]);
		}
		return a;
	}
	
	public static Location fromJson(String str)
	{
		try {
			return Location.fromJson(new JSONObject(str));
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Location fromJson(JSONObject json) {
		try
		{
			Location l = new Location();
			l.city = json.getString("city");
			l.state = json.getString("state");
			if(json.has("lattitude"))
			{
				l.lattitude = json.getLong("lattitude");
			}
			if(json.has("longitude"))
			{
				l.longitude = json.getLong("longitude");
			}
			return l;
		}catch(JSONException e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
