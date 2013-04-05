package dev.tclark.dogshow.persistence.datastore;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

@XmlRootElement
public abstract class ShowRing implements Storable, CustomKeyName {
	@XmlElement
	protected String showId;
	@XmlElement
	protected long dateMillis;
	
	//TODO doesn't work not b/c of fromJson methods
//	private boolean mEntityConstructorCalled = false;


	protected ShowRing() {
		this.showId = UUID.randomUUID().toString();
		dateMillis = 0;
	}

	protected abstract Entity toEntity();

	public static final ShowRing fromJson(String showId, JSONObject ring) {
		ShowRing showRing = null;
		
		if (ring.has("BreedName")) {
			showRing = BreedRing.fromJson(ring);
		} else if (ring.has("ClassName")) {
			showRing = JuniorRing.fromJson(ring);
		} else if (ring.has("Group")) {
			showRing = GroupRing.fromJson(ring);
		} else {
			return null;
		}
		showRing.showId = showId;
		try {
			showRing.dateMillis = ring.getLong("DateMillis");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return showRing;
	}

	@Override
	public final Entity toDatastoreEntity() {
//		if(!mEntityConstructorCalled)
//		{
//			throw new RuntimeException("ShowRing subclass must call through super(Entity) constructor to use datastore!");
//		}
		Entity e = toEntity();
		e.setProperty("showId", showId);
		e.setProperty("dateMillis", dateMillis);
		return e;
	}

	public ShowRing(Entity entity) {
//		mEntityConstructorCalled = true;
		showId = (String) entity.getProperty("showId");
		System.out.println("ShowRing entity had property " + showId);
		dateMillis = (Long) entity.getProperty("dateMillis");
	}
	
	void setDate(long dateMillis)
	{
		this.dateMillis = dateMillis;
	}
	public long getDate()
	{
		return dateMillis;
	}
	void setShowId(String showId)
	{
		this.showId = showId;
	}
	public String getShowId()
	{
		return showId;
	}
}
