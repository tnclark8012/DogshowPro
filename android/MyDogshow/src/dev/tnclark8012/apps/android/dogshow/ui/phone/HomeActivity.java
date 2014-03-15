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
import android.app.LoaderManager.LoaderCallbacks;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
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
import dev.tnclark8012.apps.android.dogshow.adapters.NavigationDrawerCursorAdapter;
import dev.tnclark8012.apps.android.dogshow.adapters.NavigationDrawerSimpleListAdapter;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.ShowTeamsQuery;
import dev.tnclark8012.apps.android.dogshow.ui.DashboardFragment;
import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseActivity;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

/**
 * The landing screen for the app, once the user has logged in.
 */
public class HomeActivity extends BaseActivity implements LoaderCallbacks<Cursor> {
	private static final String TAG = HomeActivity.class.getSimpleName();
	private DrawerLayout mDrawerLayout;
	private LinearLayout mDrawerConents;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private RelativeLayout mJoinButton;
	private NavigationDrawerCursorAdapter mAdapter;
	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			Loader<Cursor> loader = getLoaderManager().getLoader(Query.ShowTeamsQuery._TOKEN);
			if (loader != null) {
				loader.forceLoad();
			}
		}
	};

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
					fragmentManager.beginTransaction().replace(R.id.content_frame, fragment, "join").addToBackStack("base").commit();
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
		String currentTeam = Prefs.currentTeamName(this);
		// Set the adapter for the list view
		mAdapter = new NavigationDrawerCursorAdapter(this, null, false, R.layout.list_item_simple, R.id.text1, Query.ShowTeamsQuery.TEAM_NAME, currentTeam);
		mDrawerList.setAdapter(mAdapter);
		// Set the list's click listener
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		Fragment fragment = new DashboardFragment();
		// // Insert the fragment by replacing any existing fragment
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
		getLoaderManager().initLoader(ShowTeamsQuery._TOKEN, null, this);
		if (currentTeam != null) {
			setTitle(currentTeam);
		}
	}

	@Override
	protected void onPause() {
		super.onPause();
		getContentResolver().unregisterContentObserver(mObserver);
	}

	@Override
	protected void onResume() {
		super.onResume();
		getContentResolver().registerContentObserver(ShowTeams.CONTENT_URI, true, mObserver);
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
			((NavigationDrawerCursorAdapter) parent.getAdapter()).selectItem(position);
			selectItem(position);

		}
	}

	/** Swaps fragments in the main content view */
	private void selectItem(int position) {

		// Highlight the selected item, update the title, and close the drawer
		String selectedTeam = mAdapter.getCursor().getString(ShowTeamsQuery.TEAM_NAME);
		Prefs.setCurrentTeam(HomeActivity.this, selectedTeam);
		mDrawerList.setItemChecked(position, true);
		setTitle(selectedTeam);
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
			startActivity(new Intent(this, ShowSetupActivity.class));
			return true;
		case R.id.menu_sign_out:
			AccountUtils.signOut(this);
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		if (id == ShowTeamsQuery._TOKEN) {
			return new CursorLoader(this, ShowTeams.CONTENT_URI, ShowTeamsQuery.PROJECTION, null, null, ShowTeams.DEFAULT_SORT);
		} else {
			Log.w(TAG, "Couldn't create loader");
			return null;
		}
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
		int token = loader.getId();
		if (token == ShowTeamsQuery._TOKEN) {
			mAdapter.changeCursor(cursor);
		} else {
			Log.d(TAG, "Query complete, Not Actionable: " + token);
			cursor.close();
		}
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
		// TODO Auto-generated method stub

	}
}
