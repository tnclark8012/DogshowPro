package dev.tnclark8012.woof.util;

import android.content.Context;
import android.preference.PreferenceManager;

import dev.tnclark8012.woof.R;

/**
 * Created by taylorc on 10/26/2015.
 */
public class Settings {
    public static boolean UseMockApi(Context context) {
        PreferenceManager.setDefaultValues(context,
                R.xml.developer_preferences, false);
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("use_mock_api", false);
    }
}
