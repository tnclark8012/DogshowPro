/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.tnclark8012.dogshow.apps.android.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.preferences.PrefsActivity;
import dev.tnclark8012.dogshow.apps.android.util.AccountUtils;

/**
 * A base activity that handles common functionality in the app.
 */
public abstract class BaseActivity extends SherlockFragmentActivity {
	private static final String TAG = BaseActivity.class.getSimpleName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// If we're not on Google TV and we're not authenticated, finish this
		// activity
		// and show the authentication screen.
			if (!AccountUtils.isAuthenticated(this)) {
//				new Intent(this, DogActivity.class)
				Log.e(TAG, "Not authenticated");
				AccountUtils.startAuthenticationFlow(this, getIntent());
				finish();
			}
			else
			{
				Log.i(TAG, "Is authenticated");
			}

		getSupportActionBar().setHomeButtonEnabled(true);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getSupportMenuInflater();
	    inflater.inflate(R.menu.base, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			if (this instanceof HomeActivity) {
				return false;
			}

			NavUtils.navigateUpFromSameTask(this);
			return true;
		case R.id.menu_preferences:
			startActivity(new Intent(this, PrefsActivity.class));
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	/**
	 * Converts an intent into a {@link Bundle} suitable for use as fragment
	 * arguments.
	 */
	public static Bundle intentToFragmentArguments(Intent intent) {
		Bundle arguments = new Bundle();
		if (intent == null) {
			return arguments;
		}

		final Uri data = intent.getData();
		if (data != null) {
			arguments.putParcelable("_uri", data);
		}

		final Bundle extras = intent.getExtras();
		if (extras != null) {
			arguments.putAll(intent.getExtras());
		}

		return arguments;
	}

	/**
	 * Converts a fragment arguments bundle into an intent.
	 */
	public static Intent fragmentArgumentsToIntent(Bundle arguments) {
		Intent intent = new Intent();
		if (arguments == null) {
			return intent;
		}

		final Uri data = arguments.getParcelable("_uri");
		if (data != null) {
			intent.setData(data);
		}

		intent.putExtras(arguments);
		intent.removeExtra("_uri");
		return intent;
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}
}
