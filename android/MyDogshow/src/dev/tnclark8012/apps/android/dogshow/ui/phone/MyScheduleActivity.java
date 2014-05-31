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
import android.os.Bundle;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigatableActivity;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment;

public class MyScheduleActivity extends NavigatableActivity {

	private static final String TAG = MyScheduleActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

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
}
