package dev.tnclark8012.apps.android.dogshow.util;

import android.util.Log;

public class DebugUtils {
	public static <T> void logArray(String tag, T... objects) {
		for (Object o : objects) {
			Log.d(tag, "" + o);
		}
	}
}
