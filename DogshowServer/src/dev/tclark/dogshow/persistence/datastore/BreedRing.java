package dev.tclark.dogshow.persistence.datastore;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import dev.tclark.dogshow.util.Utils;
import dev.tnclark8012.dogshow.shared.Breeds;

public class BreedRing extends ShowRing{
	String mJudge;
	int mNumber;
	long mBlockStartMillis;
	int mRingNumber;
	int mCount;
	Breeds mBreed;
	int mDogCount;
	int mBitchCount;
	int mSpecialDogCount;
	int mSpecialBitchCount;
	int mCountAhead;
	private Calendar mCalendarInstance = new GregorianCalendar(Locale.US);
	private BreedRing()
	{
	}
	
	public static BreedRing fromJson(JSONObject json)
	{
		BreedRing ring = new BreedRing();
		long dateMillis;
		String timeString;
		try {
			dateMillis = json.getLong("DateMillis");
			timeString = json.getString("BlockStart");
			Calendar cal = new GregorianCalendar(Locale.US);
			cal.setTimeInMillis(dateMillis);
			long blockStartMillis = Utils.millisFromTimeString(cal, timeString);
			ring.mBlockStartMillis = blockStartMillis;
			ring.mJudge = json.getString("Judge");
			ring.mNumber = json.getInt("Number");
			ring.mCount = json.getInt("Count");
			ring.mBreed = Breeds.parse(json.getString("BreedName"));
			ring.mDogCount = json.getInt("DogCount");
			ring.mBitchCount = json.getInt("BitchCount");
			ring.mSpecialDogCount = json.getInt("SpecialDogCount");
			ring.mSpecialBitchCount = json.getInt("SpecialBitchCount");
			ring.mCountAhead = json.getInt("CountAhead");
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ring;
	}
}
