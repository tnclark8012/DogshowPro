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
import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;
@XmlRootElement
public class GroupRing extends ShowRing {
	@XmlElement
	long mBlockStartMillis;
	@XmlElement
	BreedGroup group;
	@XmlElement
	String mJudgeName;

	private GroupRing() {
	}
	public static GroupRing fromJson(JSONObject json) {
		try {
			GroupRing ring = new GroupRing();
			long dateMillis = json.getLong("DateMillis");
			String timeString = json.getString("Time");
			Calendar cal = new GregorianCalendar(Locale.US);
			cal.setTimeInMillis(dateMillis);
			long blockStartMillis = Utils.millisFromTimeString(cal, timeString);
			ring.mBlockStartMillis = blockStartMillis;
			ring.group = BreedGroup.parse(json.getString("Group"));
			if(ring.group == null )
			{
				System.err.println("Couldn't parse group: " + json.getString("Group"));
			}
			ring.mJudgeName = json.getString("Judge");
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
	protected Entity toEntity()
	{
		Entity e = new Entity(GroupRing.class.getSimpleName());
		e.setProperty("blockStart", mBlockStartMillis);
		e.setProperty("judge", mJudgeName);
		
		e.setProperty("group", (group !=null)?group.toString(): null);
		return e;
	}
	
	public GroupRing(Entity entity)
	{
		super(entity);
		mBlockStartMillis = (Long)entity.getProperty("blockStart");
		mJudgeName = (String)entity.getProperty("judge");
		group = BreedGroup.parse((String) entity.getProperty("group"));
	}
}
