package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.ArrayList;
import java.util.List;

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
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.NavigationDrawerCursorAdapter;
import dev.tnclark8012.apps.android.dogshow.preferences.PrefsActivity;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.ShowTeamsQuery;
import dev.tnclark8012.apps.android.dogshow.ui.DogListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

/**
 * The landing screen for the app, once the user has logged in.
 */
public abstract class NavigatableActivity extends SimpleSinglePaneActivity
		implements LoaderCallbacks<Cursor> {
	private static final String TAG = NavigatableActivity.class.getSimpleName();
	private DrawerLayout mDrawerLayout;
	private LinearLayout mDrawerConents;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private RelativeLayout mJoinButton;
	private NavigationDrawerCursorAdapter mAdapter;
	private Spinner showTeamSpinner;
	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			Loader<Cursor> loader = getLoaderManager().getLoader(
					ShowTeamsQuery._TOKEN);
			if (loader != null) {
				loader.forceLoad();
			}
		}
	};

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		if (id == ShowTeamsQuery._TOKEN) {
			return new CursorLoader(this, ShowTeams.CONTENT_URI,
					ShowTeamsQuery.PROJECTION, null, null,
					ShowTeams.DEFAULT_SORT);
		} else {
			Log.w(TAG, "Couldn't create loader");
			return null;
		}
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
		int token = loader.getId();
		if (token == ShowTeamsQuery._TOKEN) {

		} else {
			Log.d(TAG, "Query complete, Not Actionable: " + token);
			cursor.close();
		}
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
		Log.v(TAG, "onLoaderReset");
	}

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
		mDrawerToggle = new DogshowActionBarDrawerToggle(this, mDrawerLayout);
		// Set the drawer toggle as the DrawerListener
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		if (Utils.isJellybean()) {
			getActionBar().setHomeButtonEnabled(true);
		}
		mDrawerList = (ListView) findViewById(R.id.left_drawer);
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
		ArrayList<DrawerItem> dataList = new ArrayList<DrawerItem>();
		// Add Drawer Item to dataList
		List<SpinnerItem> userList = new ArrayList<SpinnerItem>();

		userList.add(new SpinnerItem(-1, "Ahamed Ishak", "ishak@gmail.com"));
		userList.add(new SpinnerItem(-1, "Brain Jekob", "brain.j@gmail.com"));

		dataList.add(new DrawerItemSpinner(userList)); // adding a
														// spinner to
														// the list

		// dataList.add(new DrawerItem("My Favorites")); // adding a header to
		// the list
		dataList.add(new DrawerItemNavigation("Show Day",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						changeRootFragment(new MyScheduleFragment());
					}
				}));
		dataList.add(new DrawerItemNavigation("Dogs", new OnClickListener() {
			@Override
			public void onClick(View v) {
				changeRootFragment(new DogListFragment());
			}
		}));
		dataList.add(new DrawerItemNavigation("Handlers",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						changeRootFragment(new HandlerListFragment());
					}
				}));
		dataList.add(new DrawerItemNavigation("History"));
		dataList.add(new DrawerItemOption("Settings", new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(NavigatableActivity.this,
						PrefsActivity.class));
				mDrawerLayout.closeDrawer(mDrawerConents);
			}
		}));
		dataList.add(new DrawerItemOption("Manage Teams",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						changeRootFragment(new ShowTeamListFragment());
					}
				}));

		CustomDrawerAdapter adapter = new CustomDrawerAdapter(this,
				R.layout.custom_drawer_item, dataList);
		mDrawerList.setAdapter(adapter);
		// mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		// mDrawerList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
		// Fragment fragment = getFragment();
		// // // Insert the fragment by replacing any existing fragment
		// FragmentManager fragmentManager = getFragmentManager();
		// fragmentManager.beginTransaction()
		// .replace(R.id.content_frame, fragment).commit();
		// getLoaderManager().initLoader(ShowTeamsQuery._TOKEN, null, this);
	}

	@Override
	protected void onPause() {
		super.onPause();
		getContentResolver().unregisterContentObserver(mObserver);
	}

	@Override
	protected void onResume() {
		super.onResume();
		getContentResolver().registerContentObserver(ShowTeams.CONTENT_URI,
				true, mObserver);
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

	// private class DrawerItemClickListener implements
	// ListView.OnItemClickListener {
	// @Override
	// public void onItemClick(AdapterView<?> parent, View view, int position,
	// long id) {
	// ((NavigationDrawerCursorAdapter) parent.getAdapter())
	// .selectItem(position);
	// selectItem(position);
	//
	// }
	// }
	//
	// /** Swaps fragments in the main content view */
	// private void selectItem(int position) {
	// // Highlight the selected item, update the title, and close the drawer
	// String selectedTeamIdentifier = mAdapter.getCursor().getString(
	// ShowTeamsQuery.IDENTIFIER);
	// String selectedTeamName = mAdapter.getCursor().getString(
	// ShowTeamsQuery.TEAM_NAME);
	// setTitle(selectedTeamName);
	// Prefs.setCurrentTeamIdentifier(NavigatableActivity.this,
	// selectedTeamIdentifier);
	// mDrawerList.setItemChecked(position, true);
	// SyncHelper.requestManualSync(this, AccountUtils.getChosenAccount(this),
	// SyncHelper.FLAG_SYNC_REMOTE);
	// mDrawerLayout.closeDrawer(mDrawerConents);
	// }

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// super.onCreateOptionsMenu(menu);
	// MenuInflater inflater = getMenuInflater();
	// inflater.inflate(R.menu.home, menu);
	// return true;
	// }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		// switch (item.getItemId()) {
		// case R.id.menu_preferences:
		// startActivity(new Intent(this, PrefsActivity.class));
		// return true;
		// }
		return super.onOptionsItemSelected(item);
	}

	public void changeRootFragment(Fragment fragment) {

		// // Insert the fragment by replacing any existing
		// fragment
		mDrawerLayout.closeDrawer(mDrawerConents);
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction()
				.setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
				.replace(R.id.root_container, fragment).commit();
	}

}
