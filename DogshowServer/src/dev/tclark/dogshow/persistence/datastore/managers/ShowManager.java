package dev.tclark.dogshow.persistence.datastore.managers;

import java.util.List;

import dev.tclark.dogshow.persistence.datastore.Show;
import dev.tclark.dogshow.persistence.datastore.accessors.ShowAccessor;


public class ShowManager {
	public static void createShow(Show show) {
		ShowAccessor.createShow(show);
	}
	
	/**
	 * Gets a single show by showId. If multiple exist in the Datastore, it
	 * returns the first found. Generally should be used for attribute referencing only, not server responses
	 * 
	 * @param showId
	 * @return
	 */
	public static Show getSingleShowById(String showId) {
		return ShowAccessor.getSingleShowById(showId);
	}

	public static List<Show> getShowsByState(String stateCode) {
		return ShowAccessor.getShowsByState(stateCode);
	}

	public static void deleteAllShows(boolean sure, boolean reallySure,
			boolean positive, boolean knowConsequences, boolean stupid) {
		ShowAccessor.deleteAllShows(sure, reallySure, positive, knowConsequences, stupid);
	}

	public static List<Show> getAllShows() {
		return ShowAccessor.getAllShows();
	}
}
