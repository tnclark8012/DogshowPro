package dev.tnclark8012.dogshow.persistence.datastore.accessors;

import java.util.List;

import dev.tnclark8012.dogshow.persistence.datastore.BreedRing;
import dev.tnclark8012.dogshow.persistence.datastore.GroupRing;
import dev.tnclark8012.dogshow.persistence.datastore.JuniorRing;
import dev.tnclark8012.dogshow.persistence.datastore.ShowRing;

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
				if( ring == null )
				{
					System.err.println("null ring");
				}
				else
				{
					throw new RuntimeException("Couldn't match ring to type! " + ring);
				}
			}
		}
	}
}
