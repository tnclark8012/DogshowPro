package dev.tnclark8012.dogshow.persistence.datastore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tnclark8012.dogshow.util.Utils;

@XmlRootElement
public abstract class ShowRing extends AbstractJsonModel implements Storable, CustomKeyName {
	@XmlElement
	protected String showId;
	@XmlElement
	protected long dateMillis;
	@XmlElement
	protected String judge;
	@XmlElement
	protected int ringNumber;
	@XmlElement
	long blockStartMillis;
	@XmlElement
	String dateStr;

	
	// TODO doesn't work not b/c of fromJson methods
	// private boolean mEntityConstructorCalled = false;

	protected ShowRing() {
		this.showId = UUID.randomUUID().toString();
		dateMillis = 0;
	}

	protected abstract Entity toEntity();

	public static final ShowRing fromJson(String showId, JSONObject ring) {
		ShowRing showRing = null;
		String type = getMaybe(ring, "RingType", null);
		if (type.equals("Conformation")) {
			showRing = BreedRing.fromJson(ring);
		} else if (type.equals("Junior")) {
			showRing = JuniorRing.fromJson(ring);
		} else if (type.equals("Non-conformation")) {
			showRing = NonConformationRing.fromJson(ring);
		} else if (type.equals("Rally")) {
			showRing = RallyRing.fromJson(ring);
		} else if (type.equals("Group")) {
			showRing = GroupRing.fromJson(ring);
		} else {
			return null;
		}
		long dateMillis;
		String timeString;
		try {
			dateMillis = ring.getLong("DateMillis");
			timeString = ring.getString("BlockStart");
			Calendar cal = Utils.getCalendar();
			cal.setTimeInMillis(dateMillis);
			long blockStartMillis = Utils.millisFromTimeString(cal, timeString);
			showRing.blockStartMillis = blockStartMillis;
			showRing.judge = ring.getString("Judge");
			showRing.ringNumber = getMaybe(ring, "Number", -1);
			showRing.showId = showId;
			showRing.dateMillis = ring.getLong("DateMillis");
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return showRing;
	}

	@Override
	public final Entity toDatastoreEntity() {
		// if(!mEntityConstructorCalled)
		// {
		// throw new RuntimeException("ShowRing subclass must call through super(Entity) constructor to use datastore!");
		// }
		Entity e = toEntity();
		e.setProperty("showId", showId);
		e.setProperty("dateMillis", dateMillis);
		e.setProperty("blockStart", blockStartMillis);
		e.setProperty("judge", judge);
		e.setProperty("ringNumber", ringNumber);
		return e;
	}

	public ShowRing(Entity entity) {
		// mEntityConstructorCalled = true
		showId = (String) entity.getProperty("showId");
		dateMillis = (Long) entity.getProperty("dateMillis");
		blockStartMillis = (Long) entity.getProperty("blockStart");
		dateStr = timeStringFromMillis(blockStartMillis, true);
		judge = (String) entity.getProperty("judge");
		// TODO .intValue is used to combat widening of GAE. Is it really an issue? should I just use longs?
		ringNumber = ((Long) entity.getProperty("ringNumber")).intValue();
	}

	private static final SimpleDateFormat standardTimeFormatAmPm = new SimpleDateFormat("h:mm a", Locale.US);
	private static final SimpleDateFormat standardTimeFormat = new SimpleDateFormat("h:mm", Locale.US);
	static {
		standardTimeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		standardTimeFormatAmPm.setTimeZone(TimeZone.getTimeZone("GMT"));
	}

	public static String timeStringFromMillis(long millis, boolean withAmPm) {
		Calendar cal = GregorianCalendar.getInstance();
		cal.setTimeInMillis(millis);
		if (withAmPm) {
			return standardTimeFormatAmPm.format(cal.getTime());
		} else {
			return standardTimeFormat.format(cal.getTime());
		}
	}

	void setDate(long dateMillis) {
		this.dateMillis = dateMillis;
	}

	public long getDate() {
		return dateMillis;
	}

	void setShowId(String showId) {
		this.showId = showId;
	}

	public String getShowId() {
		return showId;
	}

	public int getRingNumber() {
		return ringNumber;
	}

	public abstract String getTypeString();
}
