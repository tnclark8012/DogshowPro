package dev.tnclark8012.dogshow.persistence.datastore.managers;

import java.util.List;

import dev.tnclark8012.dogshow.persistence.datastore.BreedRing;
import dev.tnclark8012.dogshow.persistence.datastore.accessors.BreedRingAccessor;
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
		return getBreedRingsByShowId(showId, breed);
	}
	public static List<BreedRing> getBreedRingsByShowId(String showId,
			Breeds breed, boolean sweepstakes) {
		return getBreedRingsByShowId(showId, breed, sweepstakes, false);
	}
	public static List<BreedRing> getBreedRingsByShowId(String showId,
			Breeds breed, Boolean sweepstakes, Boolean veteran) {
		return BreedRingAccessor.getBreedRingsByShowId(showId, breed, sweepstakes, veteran);
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