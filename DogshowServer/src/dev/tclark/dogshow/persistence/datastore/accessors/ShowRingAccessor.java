package dev.tclark.dogshow.persistence.datastore.accessors;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

import dev.tclark.dogshow.persistence.datastore.BreedRing;
import dev.tclark.dogshow.persistence.datastore.GroupRing;
import dev.tclark.dogshow.persistence.datastore.JuniorRing;
import dev.tclark.dogshow.persistence.datastore.Show;
import dev.tclark.dogshow.persistence.datastore.ShowRing;

public class ShowRingAccessor {
	public static void createShowRings(List<ShowRing> rings)
	{
		System.out.println("Creating " + rings.size() + " rings");
		for( ShowRing ring : rings )
		{
			if( ring instanceof BreedRing)
			{
				BreedRingAccessor.createBreedRing((BreedRing)ring);
			}
			else if( ring instanceof JuniorRing)
			{
				JuniorRingAccessor.createJuniorRing((JuniorRing)ring);
			}
			else if( ring instanceof GroupRing)
			{
				GroupRingAccessor.createGroupRing((GroupRing)ring);
			}
			else
			{
				throw new RuntimeException("Couldn't match ring to type!");
			}
		}
	}
}
