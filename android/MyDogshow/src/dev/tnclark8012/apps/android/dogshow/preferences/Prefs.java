package dev.tnclark8012.apps.android.dogshow.preferences;

import java.util.UUID;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public final class Prefs {
	// *****************
	// Preference Keys
	// *****************
	public static final String KEY_C2DM_REG_ID = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.C2DM_REG_ID";
	public static final String KEY_OPEN_ID = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.OPEN_ID";
	public static final String KEY_AUTH_TOKEN = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.AUTH_TOKEN";
	public static final String KEY_DEVICE_ID = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.DEVICE_ID";
	public static final String KEY_JUDGE_TIME = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.JUDGE_TIME";
	public static final String KEY_SETUP_COMPLETE  = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.SETUP_COMPLETE";
	public static final String KEY_INSTALL_ID = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.INSTALL_ID";
	public static final String KEY_USER_ID = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.USER_ID";
	public static final String KEY_LAST_SYNC = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.LAST_SYNC";
	public static final String KEY_ENABLE_SYNC = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.SYNC";

	public static SharedPreferences get(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context);
	}
	
	public static boolean isSyncEnabled(Context context)
	{
		return get(context).getBoolean(KEY_ENABLE_SYNC, false);
	}

	/**
	 * Estimated judging time per dog
	 * 
	 * @param context
	 * @return milliseconds per dog
	 */
	public static float getEstimatedJudgingTime(Context context) {
		String number = PreferenceManager.getDefaultSharedPreferences(context).getString(KEY_JUDGE_TIME, "2.5");
		return Utils.parseSafely(number, 2.5f);
	}
}
