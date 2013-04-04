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
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

@XmlRootElement
public class BreedRing extends ShowRing {
	@XmlElement
	String judge;
	@XmlElement
	int ringNumber;
	@XmlElement
	long blockStartMillis;
	@XmlElement
	int count;
	@XmlElement
	Breeds breed;
	@XmlElement
	int dogCount;
	@XmlElement
	int bitchCount;
	@XmlElement
	int specialDogCount;
	@XmlElement
	int specialBitchCount;
	@XmlElement
	int countAhead;

	private Calendar mCalendarInstance = new GregorianCalendar(Locale.US);

	private BreedRing() {
	}

	public static BreedRing fromJson(JSONObject json) {
		BreedRing ring = new BreedRing();
		long dateMillis;
		String timeString;
		try {
			dateMillis = json.getLong("DateMillis");
			timeString = json.getString("BlockStart");
			Calendar cal = new GregorianCalendar(Locale.US);
			cal.setTimeInMillis(dateMillis);
			long blockStartMillis = Utils.millisFromTimeString(cal, timeString);
			ring.blockStartMillis = blockStartMillis;
			ring.judge = json.getString("Judge");
			ring.ringNumber = json.getInt("Number");
			ring.count = json.getInt("Count");
			ring.breed = Breeds.parse(json.getString("BreedName"));
			if (ring.breed == null) {
				System.err.println("Couldn't parse "
						+ json.getString("BreedName"));
			}
			if (json.has("DogCount")) {
				ring.dogCount = json.getInt("DogCount");
			}
			if (json.has("DogCount")) {
				ring.bitchCount = json.getInt("BitchCount");
			}
			if (json.has("DogCount")) {
				ring.specialDogCount = json.getInt("SpecialDogCount");
			}
			if (json.has("DogCount")) {
				ring.specialBitchCount = json.getInt("SpecialBitchCount");
			}
			ring.countAhead = json.getInt("CountAhead");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ring;
	}

	public String getKeyName()
	{
		return KeyNameHelper.generateKeyName(showId, breed, blockStartMillis);
	}
	@Override
	protected Entity toEntity() {
		Entity e = new Entity(BreedRing.class.getSimpleName(), getKeyName());
		e.setProperty("blockStart", blockStartMillis);
		e.setProperty("judge", judge);
		e.setProperty("ringNumber", ringNumber);
		e.setProperty("count", count);
		
		e.setProperty("breed", (breed !=null)?breed.toString(): null);
		e.setProperty("dogCount", dogCount);
		e.setProperty("bitchCount", bitchCount);
		e.setProperty("specialDogCount", specialDogCount);
		e.setProperty("specialBitchCount", specialBitchCount);
		e.setProperty("countAhead", countAhead);
		return e;
	}

	public BreedRing(Entity entity) {
		super(entity);
		//TODO .intValue is used to combat widening of GAE. Is it really an issue? should I just use longs? 
		blockStartMillis = (Long) entity.getProperty("blockStart");
		judge = (String) entity.getProperty("judge");
		ringNumber = ((Long) entity.getProperty("ringNumber")).intValue();
		count = ((Long) entity.getProperty("count")).intValue();
		breed = Breeds.parse((String) entity.getProperty("breed"));
		dogCount = ((Long) entity.getProperty("dogCount")).intValue();
		bitchCount = ((Long)entity.getProperty("bitchCount")).intValue();
		specialDogCount = ((Long) entity.getProperty("specialDogCount")).intValue();
		specialBitchCount = ((Long) entity.getProperty("specialBitchCount")).intValue();
		countAhead =((Long) entity.getProperty("countAhead")).intValue();
	}
}
