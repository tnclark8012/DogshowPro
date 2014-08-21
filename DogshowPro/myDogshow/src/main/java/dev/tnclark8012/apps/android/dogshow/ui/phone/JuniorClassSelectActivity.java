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

import dev.tnclark8012.apps.android.dogshow.ui.JuniorClassSelectFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;

public class JuniorClassSelectActivity extends SimpleSinglePaneActivity implements JuniorClassSelectFragment.Callback{
    private static final String TAG = JuniorClassSelectActivity.class.getSimpleName();
    public final static String EXTRA_JUNIOR_CLASS = "dev.tnclark8012.apps.android.dogshow.intent.extra.EXTRA_JUNIOR_CLASS";
    public final static int REQUEST_CODE_CLASS_SELECT = 0x1;


	@Override
	public void onJuniorClassSelected(JuniorClass juniorClass) {
		Intent finishIntent = new Intent();
        finishIntent.putExtra(EXTRA_JUNIOR_CLASS, juniorClass);
        setResult(REQUEST_CODE_CLASS_SELECT, finishIntent);
        finish();
	}

	@Override
	protected Fragment onCreatePane() {
		JuniorClassSelectFragment fragment = new JuniorClassSelectFragment();
		fragment.setCallbackListener(this);
		return fragment;
	}
}
