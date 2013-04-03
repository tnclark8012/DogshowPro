package dev.tclark.dogshow.persistence.datastore;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tclark.dogshow.util.Utils;

@XmlRootElement
public class JuniorRing extends ShowRing {
	@XmlElement
	long blockStartMillis;
	@XmlElement
	String className;
	@XmlElement
	int countAhead;
	@XmlElement
	int ringNumber;
	@XmlElement
	int count;
	@XmlElement
	String judge;

	private JuniorRing() {
	}

	public static JuniorRing fromJson(JSONObject json) {
		try {
			JuniorRing ring = new JuniorRing();
			long dateMillis = json.getLong("DateMillis");
			String timeString = json.getString("BlockStart");
			Calendar cal = new GregorianCalendar(Locale.US);
			cal.setTimeInMillis(dateMillis);
			long blockStartMillis = Utils.millisFromTimeString(cal, timeString);
			ring.blockStartMillis = blockStartMillis;
			ring.className = json.getString("ClassName");
			ring.countAhead = json.getInt("CountAhead");
			ring.ringNumber = json.getInt("Number");
			ring.count = json.getInt("Count");
			ring.judge = json.getString("Judge");
			return ring;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected Entity toEntity() {
		Entity e = new Entity(JuniorRing.class.getSimpleName());
		e.setProperty("blockStart", blockStartMillis);
		e.setProperty("judge", judge);
		e.setProperty("ringNumber", ringNumber);
		e.setProperty("count", count);
		e.setProperty("className", className);
		e.setProperty("countAhead", countAhead);
		return e;
	}

	public JuniorRing(Entity entity) {
		super(entity);
		blockStartMillis = (Long) entity.getProperty("blockStart");
		judge = (String) entity.getProperty("judge");
		ringNumber = ((Long) entity.getProperty("ringNumber")).intValue();
		count = ((Long) entity.getProperty("count")).intValue();
		className = (String) entity.getProperty("className");
		countAhead = ((Long) entity.getProperty("countAhead")).intValue();
	}
}
