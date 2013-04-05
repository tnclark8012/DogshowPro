package dev.tclark.dogshow.persistence.datastore.managers;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import com.google.appengine.labs.repackaged.org.json.JSONArray;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tclark.dogshow.persistence.datastore.Show;
import dev.tclark.dogshow.persistence.datastore.ShowRing;
import dev.tclark.dogshow.persistence.datastore.accessors.ShowRingAccessor;

public class ShowRingManager {
	public static void createShowRings(List<ShowRing> rings) {
		ShowRingAccessor.createShowRings(rings);
	}

	public static boolean createShowRingsForShow(String showId, JSONObject json) {
		Show match = ShowManager.getSingleShowById(showId);
		if (match != null) {
			//TODO preprocessing JSON stinks...
			System.out.println("Creating rings for " + "(" + showId
					+ ") starting on " + new Date(match.getStartDate()));
			Calendar cal = new GregorianCalendar(Locale.US);
			cal.setTimeInMillis(match.getStartDate());
			cal.add(Calendar.DAY_OF_MONTH, -1);
			JSONArray ringsArray = null;
			List<ShowRing> showRings = new LinkedList<ShowRing>();
			try {
				ringsArray = json.getJSONArray("Rings");
				int ringCount = ringsArray.length();
				int lastRing = Integer.MAX_VALUE;

				for (int i = 0; i < ringCount; i++) {
					JSONObject ring = ringsArray.getJSONObject(i);
					if (ring.has("Number")) {
						int num = ring.getInt("Number");
						if (num < lastRing && num != -1 || num > lastRing
								&& lastRing == -1) {
							cal.add(Calendar.DAY_OF_MONTH, 1);
						}
						lastRing = num;
					}
					ring.put("DateMillis", cal.getTimeInMillis());
					ring.put("ShowId", showId);
					showRings.add(ShowRing.fromJson(showId, ring));
				}
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
