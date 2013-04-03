package dev.tclark.dogshow.persistence.datastore.managers;

import java.util.List;

import dev.tclark.dogshow.persistence.datastore.GroupRing;
import dev.tclark.dogshow.persistence.datastore.accessors.GroupRingAccessor;

public class GroupRingManager {
	public static void createGroupRing(GroupRing ring) {
		GroupRingAccessor.createGroupRing(ring);
	}

	public static List<GroupRing> getGroupRingsByShowId(String showId) {
		return GroupRingAccessor.getGroupRingsByShowId(showId);
	}

	public static void deleteAllGroupRings(boolean sure, boolean reallySure,
			boolean positive, boolean knowConsequences, boolean stupid) {
		GroupRingAccessor.deleteAllGroupRings(sure, reallySure, positive, knowConsequences, stupid);
	}
	
	public static void deleteAllGroupRingsForShow(String showId)
	{
		GroupRingAccessor.deleteAllGroupRingsForShow(showId);
	}

	public static List<GroupRing> getAllGroupRings() {
		return GroupRingAccessor.getAllGroupRings();
	}
}
