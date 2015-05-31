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
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.File;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.ui.GoogleDocsPdfViewerFragment;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigatableActivity;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class MyScheduleActivity extends NavigatableActivity {

	private static final String TAG = makeLogTag(MyScheduleActivity.class);
	private static final int REQUEST_SHOW_SETUP = 10;
	private GoogleDocsPdfViewerFragment pdfViewer;

	@Override
	protected Fragment onCreatePane() {
		Show show = Prefs.getCurrentShow(this);
		if(show == null || show.hasEnded())
		{
			startActivity(new Intent(this, ShowSetupActivity.class));
		}
		else if(!show.hasSchedule)
		{
			if(this.pdfViewer == null) {
				this.pdfViewer = GoogleDocsPdfViewerFragment.newInstance(show.judgingProgramUrl);
			}
			else
			{
				this.pdfViewer.setPdfUrl(show.judgingProgramUrl);
			}
			return this.pdfViewer;
		}
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
		inflater.inflate(R.menu.schedule, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_find_show:
			startActivityForResult(new Intent(this, ShowSetupActivity.class), REQUEST_SHOW_SETUP);
			return true;
		case R.id.menu_sign_out:
			AccountUtils.signOut(this);
			finish();
			return true;
		case R.id.menu_judging_program:
			Show show = Prefs.getCurrentShow(this);
			if(show != null && show.judgingProgramUrl != null) {
                if(show.programPath != null)
                {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setDataAndType(Uri.fromFile(new File(show.programPath)), "application/pdf");
                    if(Utils.canIntentBeHandled(this, i)) startActivity(i);
                    return true;
                }
                else
                {

                    Intent i = new Intent(this, GoogleDocsPdfViewer.class);
				    i.putExtra(GoogleDocsPdfViewer.EXTRA_URL, show.judgingProgramUrl);
                    startActivity(i);
                    return true;
                }

			}
            Toast.makeText(this, "Judging program unavailable", Toast.LENGTH_SHORT).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == REQUEST_SHOW_SETUP && resultCode == RESULT_OK)
		{
			Show show = Prefs.getCurrentShow(this);
			if(!show.hasSchedule)
			{
				if(this.pdfViewer == null) {
					this.pdfViewer = GoogleDocsPdfViewerFragment.newInstance(show.judgingProgramUrl);
				}
				else
				{
					this.pdfViewer.setPdfUrl(show.judgingProgramUrl);
				}
				this.changeRootFragment(this.pdfViewer);
			}
		}
	}
}
