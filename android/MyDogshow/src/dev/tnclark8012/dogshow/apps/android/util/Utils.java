package dev.tnclark8012.dogshow.apps.android.util;

import android.database.Cursor;
import android.text.format.Time;

public class Utils {
	public static int parseIntSafely(String str, int defaultValue) {
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

	public static boolean isSameDay(long one, long two) {
		Time time = new Time();
		time.set(one);
		int oneYear = time.year;
		int oneMonth = time.month;
		int oneMonthDay = time.monthDay;
		time.set(two);
		return (oneYear == time.year) && (oneMonth == time.month) && (oneMonthDay == time.monthDay);
	}

	public static long getMaybeNull(Cursor cursor, int columnIndex, long defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor.getLong(columnIndex);
	}

	public static String getMaybeNull(Cursor cursor, int columnIndex, String defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor.getString(columnIndex);
	}

	public static float getMaybeNull(Cursor cursor, int columnIndex, float defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor.getFloat(columnIndex);
	}
	public static long minutesToMillis(float minutes) {
		return (long) (minutes * 60 * 1000);
	}
	
	
	//TODO create DogshowUtils for "dogshow specific" things like these?
	public static long estimateBlockStart(int dogCountAhead, long timeBlockStart, long estimatedMillisPerDog)
	{
		return timeBlockStart + dogCountAhead * estimatedMillisPerDog;//Simple, but used several places
	}
	public static long estimateBlockStart(int dogCountAhead, long timeBlockStart, float estimatedMinutesPerDog)
	{
		return estimateBlockStart(dogCountAhead, timeBlockStart, ((long)(estimatedMinutesPerDog*1000*60)));//Simple, but used several places
	}
	
}
