package dev.tnclark8012.dogshow.persistence.datastore.managers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	 * @return true if creation was successful, else false
	 */
	public static boolean createShowRingsForShow(String showId, JSONObject json) {
		// TODO pre-processing JSON stinks...
		System.out.println("Creating rings for " + showId);
		Calendar cal = Utils.getCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy");
		String ringDateString = "";

		JSONArray ringsArray = null;
		List<ShowRing> showRings = new LinkedList<ShowRing>();

		try {
			ringsArray = json.getJSONArray("Rings");
			int ringCount = ringsArray.length();
			for (int i = 0; i < ringCount; i++) {
				JSONObject ring = ringsArray.getJSONObject(i);
				if (!ring.getString("Date").equals(ringDateString)) {
					ringDateString = ring.getString("Date");
					try {
						cal.setTime(sdf.parse(ringDateString));
					} catch (ParseException e) {
						System.err.println("Couldn't parse date: " + ringDateString + " for show " + showId);
						e.printStackTrace();
						return false;
					}
				}
				ring.put("ShowId", showId);
				ring.put("DateMillis", cal.getTimeInMillis());
				showRings.add(ShowRing.fromJson(showId, ring));
			}
			ShowRingAccessor.createShowRings(showRings);
		} catch (JSONException e) {
			e.printStackTrace();
			return false;
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
