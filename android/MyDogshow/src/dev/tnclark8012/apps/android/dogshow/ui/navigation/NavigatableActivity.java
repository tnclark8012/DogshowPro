package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.LoaderManager;
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
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.NavigationDrawerCursorAdapter;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.preferences.PrefsActivity;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.ShowTeamsQuery;
import dev.tnclark8012.apps.android.dogshow.ui.DogListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.IncompleteFragment;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.apps.android.dogshow.ui.phone.HomeActivity;
import dev.tnclark8012.apps.android.dogshow.ui.phone.ShowTeamListActivity;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

/**
 * The landing screen for the app, once the user has logged in.
 */
public abstract class NavigatableActivity extends SimpleSinglePaneActivity
		implements LoaderCallbacks<Cursor> {
	private static final String TAG = NavigatableActivity.class.getSimpleName();
	public static final String EXTRA_SELECTED_NAVIGATION = "selected_navigation";
	public static final int NAVIGATION_SHOW = 1;
	public static final int NAVIGATION_DOGS = 2;
	public static final int NAVIGATION_HANDLERS = 3;
	public static final int NAVIGATION_HISTORY = 4;
	public static final int NAVIGATION_SETTINGS = 5;
	public static final int NAVIGATION_SHOW_TEAM = 6;
	static int sCurrentNavigation = NAVIGATION_SHOW;
	private DrawerLayout mDrawerLayout;
	private LinearLayout mDrawerConents;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private RelativeLayout mJoinButton;
	private NavigationDrawerCursorAdapter mAdapter;
	private ShowTeamSpinner showTeamSpinner;
	ArrayList<DrawerItem> mDrawerItems;
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
					ShowTeamsQuery.PROJECTION, ShowTeams.SHOW_TEAM_ID + "=?",
					new String[] { Prefs.currentTeamIdentifier(this) },
					ShowTeams.DEFAULT_SORT + " limit 1");
		} else {
			Log.w(TAG, "Couldn't create loader");
			return null;
		}
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
		int token = loader.getId();
		if (token == ShowTeamsQuery._TOKEN) {
			showTeamSpinner.changeCursor(cursor);
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
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		if (this instanceof HomeActivity) {
			setDrawerIndicatorEnabled(true);
		} else {
			setDrawerIndicatorEnabled(false);
		}

		if (Utils.isJellybean()) {
			getActionBar().setHomeButtonEnabled(true);
		}
		mDrawerList = (ListView) findViewById(R.id.left_drawer);
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
		mDrawerItems = new ArrayList<DrawerItem>();
		// Add Drawer Item to dataList
		showTeamSpinner = new ShowTeamSpinner(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(NavigatableActivity.this, "Clicked a team",
						Toast.LENGTH_SHORT).show();
			}
		});
		mDrawerItems.add(showTeamSpinner); // adding a
											// spinner to
											// the list

		// dataList.add(new DrawerItem("My Favorites")); // adding a header to
		// the list
		mDrawerItems.add(new DrawerItemNavigation("Show Day",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						changeRootFragment(NAVIGATION_SHOW);
					}
				}));
		mDrawerItems.add(new DrawerItemNavigation("Dogs",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						changeRootFragment(NAVIGATION_DOGS);
					}
				}));
		mDrawerItems.add(new DrawerItemNavigation("Handlers",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						changeRootFragment(NAVIGATION_HANDLERS);
					}
				}));
		mDrawerItems.add(new DrawerItemNavigation("History"));
		mDrawerItems.add(new DrawerItemOption("Settings",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(NavigatableActivity.this,
								PrefsActivity.class));
						mDrawerLayout.closeDrawer(mDrawerConents);
					}
				}));
		mDrawerItems.add(new DrawerItemOption("Manage Teams",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(NavigatableActivity.this,
								ShowTeamListActivity.class));
						mDrawerLayout.closeDrawer(mDrawerConents);
					}
				}));

		mDrawerItems.get(sCurrentNavigation).setChecked(true);
		CustomDrawerAdapter adapter = new CustomDrawerAdapter(this,
				R.layout.custom_drawer_item, mDrawerItems);
		mDrawerList.setAdapter(adapter);

		// mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		// mDrawerList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);

		LoaderManager manager = getLoaderManager();
		manager.restartLoader(ShowTeamsQuery._TOKEN, null, this);
		// dataList.get(selectedNavigation).onClick();
		// Fragment fragment = getFragment();
		// // // Insert the fragment by replacing any existing fragment
		// FragmentManager fragmentManager = getFragmentManager();
		// fragmentManager.beginTransaction()
		// .replace(R.id.content_frame, fragment).commit();
		// getLoaderManager().initLoader(ShowTeamsQuery._TOKEN, null, this);
	}

	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			sCurrentNavigation = extras.getInt(EXTRA_SELECTED_NAVIGATION,
					sCurrentNavigation);
		}
		changeRootFragment(sCurrentNavigation);
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

	protected void setDrawerIndicatorEnabled(boolean enabled) {
		mDrawerToggle.setDrawerIndicatorEnabled(enabled);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void changeRootFragment(int navigationPosition) {
		// // Insert the fragment by replacing any existing
		// fragment
		sCurrentNavigation = navigationPosition;
		if (!(this instanceof HomeActivity)) {
			Intent intent = new Intent(this, HomeActivity.class);
			intent.putExtra(EXTRA_SELECTED_NAVIGATION, sCurrentNavigation);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
			finish();
			return;
		}
		mDrawerLayout.closeDrawer(mDrawerConents);
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction()
				.setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
				.replace(R.id.root_container, getFragment(sCurrentNavigation))
				.commit();
	}

	@Override
	protected Fragment onCreatePane() {
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			sCurrentNavigation = extras.getInt(EXTRA_SELECTED_NAVIGATION,
					sCurrentNavigation);
		}
		return getFragment(sCurrentNavigation);
	}

	private Fragment getFragment(int navigationPostion) {
		switch (navigationPostion) {
		case NAVIGATION_SHOW:
			return new MyScheduleFragment();
		case NAVIGATION_DOGS:
			return new DogListFragment();
		case NAVIGATION_HANDLERS:
			return new HandlerListFragment();
		}
		return new IncompleteFragment();
	}

}
