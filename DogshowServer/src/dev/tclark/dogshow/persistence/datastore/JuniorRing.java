package dev.tclark.dogshow.persistence.datastore;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.sun.jersey.json.impl.reader.JsonFormatException;

import dev.tclark.dogshow.util.Utils;

public class JuniorRing extends ShowRing {
	long mBlockStartMillis;
	String mClassName;
	int mCountAhead;
	int mRingNumber;
	int mCount;
	String mJudgeName;

	private JuniorRing() {
	}

	public static JuniorRing fromJson(JSONObject json) {
		try {
			JuniorRing ring = new JuniorRing();
			long dateMillis = json.getLong("DateMillis");
			String timeString = json.getString("BlockStart");
			Calendar cal = new GregorianCalendar(Locale.US);
			cal.setTimeInMillis(dateMillis);
			long blockStartMillis = Utils.millisFromTimeString(cal, timeString);
			ring.mBlockStartMillis = blockStartMillis;
			ring.mClassName = json.getString("ClassName");
			ring.mCountAhead = json.getInt("CountAhead");
			ring.mRingNumber = json.getInt("Number");
			ring.mCount = json.getInt("Count");
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
