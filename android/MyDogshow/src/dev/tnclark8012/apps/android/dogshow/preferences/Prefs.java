package dev.tnclark8012.apps.android.dogshow.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;

import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
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
	public static final String KEY_GROUP_DEFAULT_TIME = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.GROUP_DEFAULT_TIME";
	public static final String KEY_SETUP_COMPLETE = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.SETUP_COMPLETE";
	public static final String KEY_INSTALL_ID = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.INSTALL_ID";
	public static final String KEY_USER_ID = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.USER_ID";
	public static final String KEY_LAST_SYNC = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.LAST_SYNC";
	public static final String KEY_ENABLE_SYNC = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.SYNC";
	public static final String KEY_CURRENT_TEAM_ID = "dev.tclark8012.dogshow.android.dogshow.prefs.key.CURRENT_TEAM_ID";
	public static final String KEY_LOCAL_SERVER = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.LOCAL_SERVER";
	public static final String KEY_SHOW_GROUPS = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.SHOW_GROUPS";
	public static final String KEY_CURRENT_SHOW_ID = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.CURRENT_SHOW_ID";
	public static final String KEY_CURRENT_SHOW = "dev.tnclark8012.dogshow.android.dogshow.prefs.key.CURRENT_SHOW";

	public static SharedPreferences get(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context);
	}

	public static boolean isSyncEnabled(Context context) {
		return get(context).getBoolean(KEY_ENABLE_SYNC, false);
	}

	public static boolean useLocalServer(Context context) {
		return get(context).getBoolean(KEY_LOCAL_SERVER, false);
	}

	public static boolean showGroupRings(Context context) {
		return get(context).getBoolean(KEY_SHOW_GROUPS, true);
	}

	/**
	 * Estimated judging time per dog
	 * 
	 * @param context
	 * @return milliseconds per dog
	 */
	public static long getEstimatedDogJudgingTime(Context context) {
		String number = PreferenceManager.getDefaultSharedPreferences(context)
				.getString(KEY_JUDGE_TIME, "2.5");
		return (long) (Utils.parseSafely(number, 2.5f) * 60000);// 2.5 minutes
	}

	/**
	 * Estimated judging time per group ring
	 * 
	 * @param context
	 * @return milliseconds per ring
	 */
	public static long getEstimatedGroupJudgingTime(Context context) {
		String number = PreferenceManager.getDefaultSharedPreferences(context)
				.getString(KEY_GROUP_DEFAULT_TIME, "10");
		return (long) (Utils.parseSafely(number, 10f) * 60000);// 10 minutes
	}

	/**
	 * Set the current team identifier.
	 * 
	 * @param context
	 * @param currentTeam
	 * @return true if the team changed
	 */
	public static boolean setCurrentTeamIdentifier(Context context,
			String currentTeam) {
		if (currentTeam != getCurrentTeamIdentifier(context)) {
			get(context).edit().putString(KEY_CURRENT_TEAM_ID, currentTeam)
					.commit();
		}
		return false;
	}

	public static String getCurrentTeamIdentifier(Context context) {
		return get(context).getString(KEY_CURRENT_TEAM_ID,
				AccountUtils.getUserIdentifier(context));
	}

	public static String getCurrentShowId(Context context) {
		Show show = getCurrentShow(context);
		return (show != null) ? show.showId : null; 
	}

	public static Show getCurrentShow(Context context) {
		String json = get(context).getString(KEY_CURRENT_SHOW, null);
		return (json != null) ? new Gson().fromJson(json, Show.class) : null; 
	}
	
	public static void setCurrentShow(Context context, Show show) {
		get(context).edit().putString(KEY_CURRENT_SHOW, new Gson().toJson(show)).commit();
	}
}
