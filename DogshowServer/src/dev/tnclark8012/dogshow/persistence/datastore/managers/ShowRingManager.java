package dev.tnclark8012.dogshow.persistence.datastore.managers;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.google.appengine.labs.repackaged.org.json.JSONArray;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tnclark8012.dogshow.persistence.datastore.Show;
import dev.tnclark8012.dogshow.persistence.datastore.ShowRing;
import dev.tnclark8012.dogshow.persistence.datastore.accessors.ShowRingAccessor;
import dev.tnclark8012.dogshow.util.Utils;
import dev.tnclark8012.dogshow.util.datedetection.DateDetector;
import dev.tnclark8012.dogshow.util.datedetection.ShowDay;
import dev.tnclark8012.dogshow.util.datedetection.ShowSection;

public class ShowRingManager {
	public static void createShowRings(List<ShowRing> rings) {
		ShowRingAccessor.createShowRings(rings);
	}

	/**
	 * Creates the show rings found in <code>json</code> and assigns them to the show with the matching <code>showId</code>.
	 * 
	 * @param showId
	 *            The show for which rings should be assigned
	 * @param json
	 *            show ring JSON
	 * @return true if creation was successful, false if no show with id <code>showId</code exists
	 */
	public static boolean createShowRingsForShow(String showId, JSONObject json) {
		Show match = ShowManager.getSingleShowById(showId);
		if (match != null) {
			// TODO pre-processing JSON stinks...
			System.out.println("Creating rings for " + "(" + showId + ") starting on " + new Date(match.getStartDate()));
			long [] dates = match.getDates();
			Calendar cal = Utils.getCalendar();
			cal.setTimeInMillis(match.getStartDate());
			cal.add(Calendar.DAY_OF_MONTH, -1);
			JSONArray ringsArray = null;
			List<ShowRing> showRings = new LinkedList<ShowRing>();
			ShowSection section = new ShowSection();
			List<ShowSection> showSections = new LinkedList<ShowSection>();
			try {
				ringsArray = json.getJSONArray("Rings");
				int ringCount = ringsArray.length();
				int lastRing = Integer.MAX_VALUE;

				for (int i = 0; i < ringCount; i++) {
					JSONObject ring = ringsArray.getJSONObject(i);
					ring.put("ShowId", showId);
					if (ring.has("Number")) {
						int num = ring.getInt("Number");
						if (num < lastRing && num != -1 || num > lastRing && lastRing == -1) {
							// Ring number has gone down, we're in a new section
							showSections.add(section);
							section = new ShowSection();
						}

						lastRing = num;
					}
					section.pushRing(ShowRing.fromJson(showId, ring));
					ring.put("DateMillis", cal.getTimeInMillis());
					showRings.add(ShowRing.fromJson(showId, ring));
				}
				if (!section.isEmpty()) {
					showSections.add(section);
				}
				DateDetector d = new DateDetector(showSections);
				ShowDay[] days = d.run(4, showRings);
				d.getShowDays(dates);

				ShowRingAccessor.createShowRings(showRings);
			} catch (JSONException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
		return false;
	}

	public static boolean deleteShowRingsForShow(String showId) {
		BreedRingManager.deleteAllBreedRingsForShow(showId);
		JuniorRingManager.deleteAllJuniorRingsForShow(showId);
		GroupRingManager.deleteAllGroupRingsForShow(showId);
		return false;
	}
}
