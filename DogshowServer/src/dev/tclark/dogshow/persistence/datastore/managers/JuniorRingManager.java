package dev.tclark.dogshow.persistence.datastore.managers;

import java.util.List;

import dev.tclark.dogshow.persistence.datastore.JuniorRing;
import dev.tclark.dogshow.persistence.datastore.accessors.JuniorRingAccessor;

public class JuniorRingManager {
	public static void createJuniorRing(JuniorRing ring) {
		JuniorRingAccessor.createJuniorRing(ring);
	}

	public static List<JuniorRing> getJuniorRingsByShowId(String showId) {
		return JuniorRingAccessor.getJuniorRingsByShowId(showId);
	}

	public static void deleteAllJuniorRings(boolean sure, boolean reallySure,
			boolean positive, boolean knowConsequences, boolean stupid) {
		JuniorRingAccessor.deleteAllJuniorRings(sure, reallySure, positive, knowConsequences, stupid);
	}
	
	public static void deleteAllJuniorRingsForShow(String showId)
	{
		JuniorRingAccessor.deleteAllJuniorRingsForShow(showId);
	}

	public static List<JuniorRing> getAllJuniorRings() {
		return JuniorRingAccessor.getAllJuniorRings();
	}
}
