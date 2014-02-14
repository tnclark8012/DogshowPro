package dev.tnclark8012.apps.android.dogshow.preferences;


import android.os.Bundle;
import android.preference.PreferenceActivity;
import dev.tnclark8012.apps.android.dogshow.R;

public class PrefsActivity extends PreferenceActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);
	}
}
