package dev.tnclark8012.dogshow.persistence.datastore;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

@XmlRootElement
public class BreedRing extends ShowRing {

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
	@XmlElement
	boolean isVeteran;
	@XmlElement
	boolean isSweepstakes;


	private BreedRing() {
	}

	public static BreedRing fromJson(JSONObject json) {
		BreedRing ring = new BreedRing();
		try {
			ring.count = json.getInt("Count");
			ring.breed = Breeds.parse(json.getString("BreedName"));

			if(ring.breed == Breeds.PAPILLON)
			{
				int j=1;
			}
			if (ring.breed == null) {
				System.err.println("Couldn't parse "
						+ json.getString("BreedName"));
			}
			//Not all rings have the count "broken down"
			ring.dogCount = getMaybe(json, "DogCount", 0);
			ring.bitchCount = getMaybe(json, "BitchCount", 0);
			ring.specialDogCount = getMaybe(json,"SpecialDogCount", 0);
			ring.specialBitchCount = getMaybe(json,"SpecialBitchCount", 0);
			//Not all rings are veteran or sweepstakes
			ring.isVeteran = getMaybe(json, "IsVeteran", false);
			ring.isSweepstakes = getMaybe(json, "IsSweepstakes", false);
			ring.countAhead = json.getInt("CountAhead");

		} catch (JSONException e) {
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
		e.setProperty("count", count);
		
		e.setProperty("breed", (breed !=null)?breed.toString(): null);
		e.setProperty("dogCount", dogCount);
		e.setProperty("bitchCount", bitchCount);
		e.setProperty("specialDogCount", specialDogCount);
		e.setProperty("specialBitchCount", specialBitchCount);
		e.setProperty("countAhead", countAhead);
		e.setProperty("isSweepstakes", isSweepstakes);
		e.setProperty("isVeteran", isVeteran);
		return e;
	}


	public BreedRing(Entity entity) {
		super(entity);
		count = ((Long) entity.getProperty("count")).intValue();
		breed = Breeds.parse((String) entity.getProperty("breed"));
		dogCount = ((Long) entity.getProperty("dogCount")).intValue();
		bitchCount = ((Long)entity.getProperty("bitchCount")).intValue();
		specialDogCount = ((Long) entity.getProperty("specialDogCount")).intValue();
		specialBitchCount = ((Long) entity.getProperty("specialBitchCount")).intValue();
		countAhead =((Long) entity.getProperty("countAhead")).intValue();
		if(!entity.hasProperty("isSweepstakes"))
		{
			int i=1;
		}
		isSweepstakes = (Boolean) entity.getProperty("isSweepstakes");
		isVeteran = (Boolean) entity.getProperty("isVeteran");
	}
	
	@Override
	public String getTypeString() {
		return breed.toString();
	}
}
