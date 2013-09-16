package dev.tnclark8012.dogshow.persistence.datastore;

import java.text.ParseException;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;
import dev.tnclark8012.dogshow.util.Utils;
@XmlRootElement
public class GroupRing extends ShowRing {
	@XmlElement
	BreedGroup group;

	private GroupRing() {
	}
	public static GroupRing fromJson(JSONObject json) {
		try {
			GroupRing ring = new GroupRing();
			ring.group = BreedGroup.parse(json.getString("Group"));
			if(ring.group == null )
			{
				System.err.println("Couldn't parse group: " + json.getString("Group"));
			}
			return ring;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected Entity toEntity()
	{
		Entity e = new Entity(GroupRing.class.getSimpleName(), getKeyName());
		e.setProperty("group", (group !=null)?group.toString(): null);
		return e;
	}
	
	public GroupRing(Entity entity)
	{
		super(entity);
		group = BreedGroup.parse((String) entity.getProperty("group"));
	}
	@Override
	public String getKeyName() {
		return KeyNameHelper.generateKeyName(showId, group, blockStartMillis);
	}
	@Override
	public String getTypeString() {
		return group.toString();
	}
}
