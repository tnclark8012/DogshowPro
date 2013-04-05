package dev.tnclark8012.dogshow.apps.android.util;

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
}
