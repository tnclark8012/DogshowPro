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

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.actionbarsherlock.app.ActionBar;

import dev.tnclark8012.dogshow.apps.android.R;

/**
 * The landing screen for the app, once the user has logged in.
 *
 * <p>This activity uses different layouts to present its various fragments, depending on the
 * device configuration. {@link MyScheduleFragment}, {@link ExploreFragment}, and
 * {@link SocialStreamFragment} are always available to the user. {@link WhatsOnFragment} is
 * always available on tablets and phones in portrait, but is hidden on phones held in landscape.
 *
 * <p>On phone-size screens, the three fragments are represented by {@link ActionBar} tabs, and
 * can are held inside a {@link ViewPager} to allow horizontal swiping.
 *
 * <p>On tablets, the three fragments are always visible and are presented as either three panes
 * (landscape) or a grid (portrait).
 */
public class HomeActivity extends BaseActivity  {
    private static final String TAG = HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        setContentView(R.layout.activity_home);
    }
}

