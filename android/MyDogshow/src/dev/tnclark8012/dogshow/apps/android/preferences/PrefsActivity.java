package dev.tnclark8012.dogshow.apps.android.preferences;


import android.os.Bundle;
import android.preference.PreferenceActivity;
import dev.tnclark8012.dogshow.apps.android.R;

public class PrefsActivity extends PreferenceActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);
	}
}
