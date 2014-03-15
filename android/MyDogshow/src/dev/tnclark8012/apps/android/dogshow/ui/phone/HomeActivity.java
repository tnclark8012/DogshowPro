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

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.NavigationDrawerListAdapter;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.ui.DashboardFragment;
import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseActivity;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

/**
 * The landing screen for the app, once the user has logged in.
 */
public class HomeActivity extends BaseActivity {
	private static final String TAG = HomeActivity.class.getSimpleName();
	private DrawerLayout mDrawerLayout;
	private LinearLayout mDrawerConents;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private RelativeLayout mJoinButton;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		// getActionBar().setHomeButtonEnabled(false);
		// getActionBar().setDisplayHomeAsUpEnabled(false);
		setContentView(R.layout.activity_home);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerConents = (LinearLayout) findViewById(R.id.drawer_contents);
		mJoinButton = (RelativeLayout) findViewById(R.id.button_join_team);
		mJoinButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (Prefs.isSyncEnabled(HomeActivity.this)) {
					// Create a new fragment and specify the planet to show based on position
					Fragment fragment = new ShowTeamListFragment();
					// // Insert the fragment by replacing any existing fragment
					FragmentManager fragmentManager = getFragmentManager();
					fragmentManager.beginTransaction().replace(R.id.content_frame,fragment, "join").addToBackStack("base").commit();
					mDrawerLayout.closeDrawer(mDrawerConents);
				}
			}
		});
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.ic_drawer_white, R.string.app_name, R.string.action_settings) {

			/** Called when a drawer has settled in a completely closed state. */
			public void onDrawerClosed(View view) {
				super.onDrawerClosed(view);
				invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
			}

			/** Called when a drawer has settled in a completely open state. */
			public void onDrawerOpened(View drawerView) {
				super.onDrawerOpened(drawerView);
				invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
			}
		};

		// Set the drawer toggle as the DrawerListener
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		if (Utils.isJellybean()) {
			getActionBar().setHomeButtonEnabled(true);
		}
		mDrawerList = (ListView) findViewById(R.id.left_drawer);
		// Set the adapter for the list view
		mDrawerList.setAdapter(new NavigationDrawerListAdapter(this, R.layout.list_item_simple, R.id.text1, new String[] { "Just Me", "Stellar" }));
		// Set the list's click listener
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		Fragment fragment = new DashboardFragment();
		// // Insert the fragment by replacing any existing fragment
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	private class DrawerItemClickListener implements ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			((NavigationDrawerListAdapter) parent.getAdapter()).selectItem(position);
			selectItem(position);
		}
	}

	/** Swaps fragments in the main content view */
	private void selectItem(int position) {

		// Highlight the selected item, update the title, and close the drawer
		mDrawerList.setItemChecked(position, true);
		setTitle(mDrawerList.getItemAtPosition(position).toString());
		mDrawerLayout.closeDrawer(mDrawerConents);
	}

	/* Called whenever we call invalidateOptionsMenu() */
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// If the nav drawer is open, hide action items related to the content view
		boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerConents);
		return super.onPrepareOptionsMenu(menu);
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
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		switch (item.getItemId()) {
		case R.id.menu_find_show:
			// new AsyncTask<Void, Void, Void>() {
			// @Override
			// protected Void doInBackground(Void... params) {
			// ShowTeamResponse response = ApiAccessor.getInstance().createShowTeam(AccountUtils.getUserId(HomeActivity.this), "Taylor's Team", "password");
			// if (response != null) {
			// PersistHelper helper = new PersistHelper(HomeActivity.this);
			// Map<String, Object> values = new HashMap<String, Object>();
			// values.put(ShowTeams.SHOW_TEAM_NAME, response.teamName);
			// values.put(ShowTeams.SHOW_TEAM_ID, response.identifier);
			// helper.createEntity(ShowTeams.CONTENT_URI, values);
			// }
			// return null;
			// }
			// }.execute();
			startActivity(new Intent(this, ShowSetupActivity.class));
			return true;
		case R.id.menu_sign_out:
			AccountUtils.signOut(this);
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
