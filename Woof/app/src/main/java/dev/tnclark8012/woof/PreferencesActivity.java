package dev.tnclark8012.woof;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.widget.Button;

import java.util.List;

import dev.tnclark8012.woof.util.LogUtils;

import static dev.tnclark8012.woof.util.LogUtils.LOGI;
public class PreferencesActivity extends PreferenceActivity {

    public static final String LOG_TAG = LogUtils.makeLogTag(PreferencesActivity.class);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        if(fragmentName.equals("dev.tnclark8012.woof.PreferencesActivity$DeveloperPreferences"))
        {
            return true;
        }

        return false;
    }

    /**
     * Populate the activity with the top-level headers.
     */
    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preference_headers, target);
    }

    public static class DeveloperPreferences extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            PreferenceManager.setDefaultValues(getActivity(),
                    R.xml.developer_preferences, false);

            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.developer_preferences);
        }
    }
}
