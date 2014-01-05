package dev.tnclark8012.dogshow.persistence.datastore;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@XmlRootElement
public class NonConformationRing extends ShowRing {

	@XmlElement
	int count;
	@XmlElement
	String className;
	@XmlElement
	String entrants;
	@XmlElement
	int countAhead;


	private NonConformationRing() {
	}

	public static NonConformationRing fromJson(JSONObject json) {
		NonConformationRing ring = new NonConformationRing();
		try {
			ring.count = json.getInt("Count");
			ring.className = json.getString("Class");
			ring.entrants = getMaybe(json, "Entrants", null);
			ring.countAhead = json.getInt("CountAhead");

		} catch (JSONException e) {
			e.printStackTrace();
		}
		return ring;
	}

	public String getKeyName()
	{
		return KeyNameHelper.generateKeyName(showId, className, blockStartMillis);
	}
	@Override
	protected Entity toEntity() {
		Entity e = new Entity(NonConformationRing.class.getSimpleName(), getKeyName());
		e.setProperty("count", count);
		
		e.setProperty("className",className);
		e.setProperty("entrants", entrants);
		return e;
	}


	public NonConformationRing(Entity entity) {
		super(entity);
		count = ((Long) entity.getProperty("count")).intValue();
		className = (String)entity.getProperty("className");
		entrants = (String) entity.getProperty("entrants");
	}
	
	@Override
	public String getTypeString() {
		return className.toString();
	}
}
