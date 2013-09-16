package dev.tnclark8012.dogshow.persistence.datastore;

import java.text.ParseException;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;
import dev.tnclark8012.dogshow.util.Utils;

@XmlRootElement
public class JuniorRing extends ShowRing {
	@XmlElement
	JuniorClass className;
	@XmlElement
	int countAhead;
	@XmlElement
	int ringNumber;
	@XmlElement
	int count;

	private JuniorRing() {
	}

	public static JuniorRing fromJson(JSONObject json) {
		try {
			JuniorRing ring = new JuniorRing();
			ring.className = JuniorClass.parse(json.getString("ClassName"));
			ring.countAhead = json.getInt("CountAhead");
			ring.ringNumber = json.getInt("Number");
			ring.count = json.getInt("Count");
			ring.judge = json.getString("Judge");
			return ring;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected Entity toEntity() {
		Entity e = new Entity(JuniorRing.class.getSimpleName(), getKeyName());
		e.setProperty("count", count);
		e.setProperty("className", className.toString());
		e.setProperty("countAhead", countAhead);
		return e;
	}

	public JuniorRing(Entity entity) {
		super(entity);
		count = ((Long) entity.getProperty("count")).intValue();
		className = JuniorClass.parse((String) entity.getProperty("className"));
		countAhead = ((Long) entity.getProperty("countAhead")).intValue();
	}

	@Override
	public String getKeyName() {
		return KeyNameHelper.generateKeyName(showId, className, blockStartMillis);
	}
	
	@Override
	public String getTypeString() {
		return className.toString();
	}
}
