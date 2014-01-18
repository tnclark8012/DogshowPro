package dev.tnclark8012.dogshow.apps.android.util;

import android.database.Cursor;
import android.text.format.Time;

public class Utils {
	private static final String TAG = Utils.class.getSimpleName();

	/**
	 * Is API 16 or greater?
	 * 
	 * @return
	 */
	// TODO LOW: Should this be a public static final boolean?
	public static boolean isJellybean() {
		return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN;
	}

	public static int parseSafely(String str, int defaultValue) {
		if (str.isEmpty() || !Character.isDigit(str.charAt(0))) {
			// catch easiest cases that cause NumberFormatException to avoid costly handling
			return defaultValue;
		} else {
			try {
				return Integer.parseInt(str);
			} catch (NumberFormatException nfe) {
				return defaultValue;
			}
		}
	}

	public static float parseSafely(String str, float defaultValue) {
		if (str.isEmpty() || !Character.isDigit(str.charAt(0))) {
			// catch easiest cases that cause NumberFormatException to avoid costly handling
			return defaultValue;
		} else {
			try {
				return Float.parseFloat(str);
			} catch (NumberFormatException nfe) {
				return defaultValue;
			}
		}
	}

	public static boolean isSameDay(long one, long two) {
		Time time = new Time();
		time.set(one);
		int oneYear = time.year;
		int oneMonth = time.month;
		int oneMonthDay = time.monthDay;
		time.set(two);
		return (oneYear == time.year) && (oneMonth == time.month) && (oneMonthDay == time.monthDay);
	}

	public static boolean isNullOrEmpty(String str) {
		return str == null || str.isEmpty();
	}

	public static long getMaybeNull(Cursor cursor, int columnIndex, long defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor.getLong(columnIndex);
	}

	public static int getMaybeNull(Cursor cursor, int columnIndex, int defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor.getInt(columnIndex);
	}

	public static String getMaybeNull(Cursor cursor, int columnIndex, String defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor.getString(columnIndex);
	}

	public static float getMaybeNull(Cursor cursor, int columnIndex, float defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor.getFloat(columnIndex);
	}
	
	public static boolean getMaybeNull(Cursor cursor, int columnIndex, boolean defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : (cursor.getInt(columnIndex)!=0);
	}
	
	

	public static long minutesToMillis(float minutes) {
		return (long) (minutes * 60 * 1000);
	}

	// TODO create DogshowUtils for "dogshow specific" things like these?
	public static long estimateBlockStart(int dogCountAhead, long timeBlockStart, long estimatedMillisPerDog) {
		return timeBlockStart + dogCountAhead * estimatedMillisPerDog;// Simple, but used several places
	}

	public static long estimateBlockStart(int dogCountAhead, long timeBlockStart, float estimatedMinutesPerDog) {
		return estimateBlockStart(dogCountAhead, timeBlockStart, ((long) (estimatedMinutesPerDog * 1000 * 60)));// Simple, but used several places
	}
	private static final long EPOCH_IN_MILLISECONDS = 62135596800000l;
	public static long millisSinceEpoch(long millisSinceAD )
	{
		return millisSinceAD - EPOCH_IN_MILLISECONDS;
	}

}