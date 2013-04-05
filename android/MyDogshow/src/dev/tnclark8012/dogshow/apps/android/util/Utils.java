package dev.tnclark8012.dogshow.apps.android.util;

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
}
