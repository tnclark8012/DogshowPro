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

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.ui.ExploreFragment;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;

/**
 * The landing screen for the app, once the user has logged in.
 * 
 * <p>
 * This activity uses different layouts to present its various fragments, depending on the device configuration. {@link MyScheduleFragment}, {@link ExploreFragment}, and {@link SocialStreamFragment} are always available to the user. {@link WhatsOnFragment} is always available on tablets and phones in portrait, but is hidden on phones held in landscape.
 * 
 * <p>
 * On phone-size screens, the three fragments are represented by {@link ActionBar} tabs, and can are held inside a {@link ViewPager} to allow horizontal swiping.
 * 
 * <p>
 * On tablets, the three fragments are always visible and are presented as either three panes (landscape) or a grid (portrait).
 */
public class MyScheduleActivity extends SimpleSinglePaneActivity {

	private static final String TAG = MyScheduleActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFinishing()) {
			return;
		}
		setContentView(R.layout.activity_singlepane_empty);
		getActionBar().setHomeButtonEnabled(true);
	}

	@Override
	protected Fragment onCreatePane() {
		return new MyScheduleFragment();
	}
}
