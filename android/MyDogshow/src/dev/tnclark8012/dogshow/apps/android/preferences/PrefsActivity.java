package dev.tnclark8012.dogshow.apps.android.preferences;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockPreferenceActivity;

import dev.tnclark8012.dogshow.apps.android.R;

public class PrefsActivity extends SherlockPreferenceActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);
	}
}
