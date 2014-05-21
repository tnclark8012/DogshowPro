package dev.tnclark8012.apps.android.dogshow.util;

import android.content.Context;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;

public class DebugUtils {
	public static String log = "";

	public static void appendLog(Context context, String str) {
		String log = Prefs.get(context).getString("log", "");
		Prefs.get(context).edit().putString("log", log + "\n" + str).apply();
	}
	
	public static String getLog(Context context)
	{
		return Prefs.get(context).getString("log", "<empty>");
	}

	public static <T> void logArray(String tag, T... objects) {
		for (Object o : objects) {
			Log.d(tag, "" + o);
		}
	}
}
