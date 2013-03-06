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

package dev.tclark.dogshow.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.actionbarsherlock.app.ActionBar;

import dev.tclark.dogshow.android.ui.BaseActivity;
import dev.tclark.dogshow.android.ui.ExploreFragment;
import dev.tclark.dogshow.android.ui.MyScheduleFragment;

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
        super.onCreate(savedInstanceState);
        
        startActivity(new Intent(this, HandlerActivity.class));
    }
}

