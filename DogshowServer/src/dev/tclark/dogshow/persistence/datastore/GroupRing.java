package dev.tclark.dogshow.persistence.datastore;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tclark.dogshow.util.Utils;

public class GroupRing extends ShowRing {
	long mBlockStartMillis;
	String mGroupName;
	String mJudgeName;

	private GroupRing() {
	}

	public static GroupRing fromJson(JSONObject json) {
		try {
			GroupRing ring = new GroupRing();
			long dateMillis = json.getLong("DateMillis");
			String timeString = json.getString("BlockStart");
			Calendar cal = new GregorianCalendar(Locale.US);
			cal.setTimeInMillis(dateMillis);
			long blockStartMillis = Utils.millisFromTimeString(cal, timeString);
			ring.mBlockStartMillis = blockStartMillis;
			ring.mGroupName = json.getString("Group");
			ring.mJudgeName = json.getString("Judge");
			return ring;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}