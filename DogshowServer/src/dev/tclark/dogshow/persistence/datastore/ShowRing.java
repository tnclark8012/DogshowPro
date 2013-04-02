package dev.tclark.dogshow.persistence.datastore;

import com.google.appengine.labs.repackaged.org.json.JSONObject;

public class ShowRing {
	protected ShowRing()
	{}
	public static ShowRing fromJson(JSONObject ring)
	{
		if(ring.has("BreedName"))
		{
			return BreedRing.fromJson(ring);
		}
		else if(ring.has("ClassName"))
		{
			return JuniorRing.fromJson(ring);
		}
		else if(ring.has("Group"))
		{
			return GroupRing.fromJson(ring);
		}
		return null;
	}
	
}
