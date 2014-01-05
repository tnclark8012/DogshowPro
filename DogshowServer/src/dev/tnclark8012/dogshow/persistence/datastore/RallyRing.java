package dev.tnclark8012.dogshow.persistence.datastore;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@XmlRootElement
public class RallyRing extends ShowRing {

	@XmlElement
	int count;
	@XmlElement
	String className;
	@XmlElement
	boolean isWalkthrough;
	@XmlElement
	int countAhead;


	private RallyRing() {
	}

	public static RallyRing fromJson(JSONObject json) {
		RallyRing ring = new RallyRing();
		try {
			ring.count = json.getInt("Count");
			ring.className = json.getString("RallyName");
			ring.isWalkthrough = getMaybe(json, "IsWalkthrough", false);
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
		Entity e = new Entity(RallyRing.class.getSimpleName(), getKeyName());
		e.setProperty("count", count);
		
		e.setProperty("className",className);
		e.setProperty("isWalkthrough", isWalkthrough);
		return e;
	}


	public RallyRing(Entity entity) {
		super(entity);
		count = ((Long) entity.getProperty("count")).intValue();
		className = (String)entity.getProperty("className");
		isWalkthrough = (Boolean) entity.getProperty("isWalkthrough");
	}
	
	@Override
	public String getTypeString() {
		return className.toString();
	}
}
