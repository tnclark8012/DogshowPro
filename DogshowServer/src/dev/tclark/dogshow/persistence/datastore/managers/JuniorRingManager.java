package dev.tclark.dogshow.persistence.datastore.managers;

import java.util.List;

import dev.tclark.dogshow.persistence.datastore.JuniorRing;
import dev.tclark.dogshow.persistence.datastore.accessors.JuniorRingAccessor;
import dev.tnclark8012.dogshow.shared.DogshowEnums;
import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;

public class JuniorRingManager {
	public static void createJuniorRing(JuniorRing ring) {
		JuniorRingAccessor.createJuniorRing(ring);
	}

	public static List<JuniorRing> getAllJuniorRingsByShowId(String showId) {
		return JuniorRingAccessor.getAllJuniorRingsByShowId(showId);
	}

	public static List<JuniorRing> getJuniorRingsByShowIdClassName(String showId, JuniorClass clazz) {
		return JuniorRingAccessor.getAllJuniorRingsByShowIdClassName(showId, clazz.getPrimaryName());
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
