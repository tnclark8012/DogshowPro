package dev.tclark.dogshow.persistence.datastore.managers;

import java.util.List;

import dev.tclark.dogshow.persistence.datastore.BreedRing;
import dev.tclark.dogshow.persistence.datastore.accessors.BreedRingAccessor;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class BreedRingManager {
	public static void createBreedRing(BreedRing ring) {
		BreedRingAccessor.createBreedRing(ring);
	}

	public static List<BreedRing> getBreedRingsByShowId(String showId) {
		return BreedRingAccessor.getBreedRingsByShowId(showId);
	}

	public static List<BreedRing> getBreedRingsByShowId(String showId,
			Breeds breed) {
		return BreedRingAccessor.getBreedRingsByShowId(showId, breed);
	}

	public static void deleteAllBreedRings(boolean sure, boolean reallySure,
			boolean positive, boolean knowConsequences, boolean stupid) {
		BreedRingAccessor.deleteAllBreedRings(sure, reallySure, positive,
				knowConsequences, stupid);
	}

	public static void deleteAllBreedRingsForShow(String showId) {
		BreedRingAccessor.deleteAllBreedRingsForShow(showId);
	}

	public static List<BreedRing> getAllBreedRings() {
		return BreedRingAccessor.getAllBreedRings();
	}
}
