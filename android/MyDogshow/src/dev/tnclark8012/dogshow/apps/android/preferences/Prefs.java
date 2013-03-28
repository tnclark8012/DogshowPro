package dev.tnclark8012.dogshow.apps.android.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class Prefs {
	// *****************
	// Preference Keys 
	// *****************
	public static final String		KEY_C2DM_REG_ID			= "dev.tnclark8012.dogshow.android.dogshow.prefs.key.C2DM_REG_ID";
	public static final String		KEY_OPEN_ID				= "dev.tnclark8012.dogshow.android.dogshow.prefs.key.OPEN_ID";
	public static final String		KEY_AUTH_TOKEN			= "dev.tnclark8012.dogshow.android.dogshow.prefs.key.AUTH_TOKEN";
	public static final String		KEY_DEVICE_ID			= "dev.tnclark8012.dogshow.android.dogshow.prefs.key.DEVICE_ID";
    public static SharedPreferences get(Context context) {
        return PreferenceManager.getDefaultSharedPreferences( context );
    }
}
