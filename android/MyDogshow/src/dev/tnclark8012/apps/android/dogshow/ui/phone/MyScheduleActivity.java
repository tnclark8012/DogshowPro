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

package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigatableActivity;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class MyScheduleActivity extends NavigatableActivity {

	private static final String TAG = MyScheduleActivity.class.getSimpleName();

	@Override
	protected Fragment onCreatePane() {
		return new MyScheduleFragment();
	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		if (position != NavigationDrawerFragment.NAVIGATION_SHOW) {
			super.onNavigationDrawerItemSelected(position);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_find_show:
			startActivity(new Intent(this, ShowSetupActivity.class));
			return true;
		case R.id.menu_sync:
			new AsyncTask<Void, Void, Void>() {
				@Override
				protected Void doInBackground(Void... params) {
					new SyncHelper(MyScheduleActivity.this)
							.getRingOverviews(Prefs
									.getCurrentShowId(MyScheduleActivity.this));
					return null;
				}
			}.execute();
			return true;
		case R.id.menu_sign_out:
			AccountUtils.signOut(this);
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
