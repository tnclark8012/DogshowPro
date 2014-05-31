package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.PrefsActivity;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.ShowTeamsQuery;
import dev.tnclark8012.apps.android.dogshow.ui.phone.ShowTeamListActivity;

/**
 * Fragment used for managing interactions for and presentation of a navigation
 * drawer. See the <a href=
 * "https://developer.android.com/design/patterns/navigation-drawer.html#Interaction"
 * > design guidelines</a> for a complete explanation of the behaviors
 * implemented here.
 */
public class NavigationDrawerFragment extends Fragment implements
		LoaderCallbacks<Cursor> {

	public static final String TAG = NavigationDrawerFragment.class
			.getSimpleName();
	/**
	 * Remember the position of the selected item.
	 */
	public static final String STATE_SELECTED_POSITION = "selected_navigation_drawer_position";

	/**
	 * Per the design guidelines, you should show the drawer on launch until the
	 * user manually expands it. This shared preference tracks this.
	 */
	private static final String PREF_USER_LEARNED_DRAWER = "navigation_drawer_learned";

	/**
	 * A pointer to the current callbacks instance (the Activity).
	 */
	private NavigationDrawerCallbacks mCallbacks;

	/**
	 * Helper component that ties the action bar to the navigation drawer.
	 */
	private ActionBarDrawerToggle mDrawerToggle;

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerListView;
	private View mFragmentContainerView;

	private static int mCurrentSelectedPosition = 1;
	private boolean mFromSavedInstanceState;
	private boolean mUserLearnedDrawer;
	private List<DrawerItem> mDrawerItems;
	private ShowTeamSpinner showTeamSpinner;
	public static final int NAVIGATION_SHOW = 1;
	public static final int NAVIGATION_DOGS = 2;
	public static final int NAVIGATION_HANDLERS = 3;
	public static final int NAVIGATION_HISTORY = 4;
	public static final int NAVIGATION_SETTINGS = 5;
	public static final int NAVIGATION_SHOW_TEAM = 6;
	private CharSequence oldTitle;

	public NavigationDrawerFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Read in the flag indicating whether or not the user has demonstrated
		// awareness of the
		// drawer. See PREF_USER_LEARNED_DRAWER for details.
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(getActivity());
		mUserLearnedDrawer = sp.getBoolean(PREF_USER_LEARNED_DRAWER, false);

		if (savedInstanceState != null) {
			mCurrentSelectedPosition = savedInstanceState
					.getInt(STATE_SELECTED_POSITION);
			mFromSavedInstanceState = true;
		}

		// Select either the default item (0) or the last selected item.
		selectItem(mCurrentSelectedPosition);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_navigation, container);

		mDrawerListView = (ListView) view.findViewById(R.id.left_drawer);
		mDrawerItems = new ArrayList<DrawerItem>();
		// Add Drawer Item to dataList
		showTeamSpinner = new ShowTeamSpinner(getActivity(),
				new OnClickListener() {
					@Override
					public void onClick(View v) {// TODO not required in
													// constructor
					}
				});
		mDrawerItems.add(showTeamSpinner);

		mDrawerItems.add(new DrawerItemNavigation("Show Day",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						selectItem(NAVIGATION_SHOW);
					}
				}));
		mDrawerItems.add(new DrawerItemNavigation("Dogs",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						selectItem(NAVIGATION_DOGS);
					}
				}));
		mDrawerItems.add(new DrawerItemNavigation("Handlers",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						selectItem(NAVIGATION_HANDLERS);
					}
				}));
		mDrawerItems.add(new DrawerItemNavigation("History"));
		mDrawerItems.add(new DrawerItemOption("Settings",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(getActivity(),
								PrefsActivity.class));
						if (mDrawerLayout != null) {
							mDrawerLayout.closeDrawer(mFragmentContainerView);
						}
					}
				}));
		mDrawerItems.add(new DrawerItemOption("Manage Teams",
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(getActivity(),
								ShowTeamListActivity.class));
						if (mDrawerLayout != null) {
							mDrawerLayout.closeDrawer(mFragmentContainerView);
						}
					}
				}));
		mDrawerItems.get(mCurrentSelectedPosition).setChecked(true);
		NavigationDrawerAdapter adapter = new NavigationDrawerAdapter(
				getActivity(), R.layout.custom_drawer_item, mDrawerItems);
		mDrawerListView.setAdapter(adapter);
		// mDrawerListView.setItemChecked(mCurrentSelectedPosition, true);

		getActivity().getLoaderManager().restartLoader(
				Query.ShowTeamsQuery._TOKEN, null, this);
		return view;
	}

	public boolean isDrawerOpen() {
		return mDrawerLayout != null
				&& mDrawerLayout.isDrawerOpen(mFragmentContainerView);
	}

	/**
	 * Users of this fragment must call this method to set up the navigation
	 * drawer interactions.
	 * 
	 * @param fragmentId
	 *            The android:id of this fragment in its activity's layout.
	 * @param drawerLayout
	 *            The DrawerLayout containing this fragment's UI.
	 */
	public void setUp(int fragmentId, DrawerLayout drawerLayout) {
		mFragmentContainerView = getActivity().findViewById(fragmentId);
		mDrawerLayout = drawerLayout;

		// set a custom shadow that overlays the main content when the drawer
		// opens
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
		// set up the drawer's list view with items and click listener

		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);

		// ActionBarDrawerToggle ties together the the proper interactions
		// between the navigation drawer and the action bar app icon.
		mDrawerToggle = new DogshowActionBarDrawerToggle(getActivity(),
				mDrawerLayout) {
			@Override
			public void onDrawerClosed(View drawerView) {
				super.onDrawerClosed(drawerView);
				if (!isAdded()) {
					return;
				}
				getActionBar().setTitle(oldTitle);
				getActivity().invalidateOptionsMenu(); // calls //
														// onPrepareOptionsMenu()
			}

			@Override
			public void onDrawerOpened(View drawerView) {
				super.onDrawerOpened(drawerView);
				if (!isAdded()) {
					return;
				}

				if (!mUserLearnedDrawer) {
					// The user manually opened the drawer; store this flag to
					// prevent auto-showing
					// the navigation drawer automatically in the future.
					mUserLearnedDrawer = true;
					SharedPreferences sp = PreferenceManager
							.getDefaultSharedPreferences(getActivity());
					sp.edit().putBoolean(PREF_USER_LEARNED_DRAWER, true)
							.commit();
				}
				oldTitle = getActionBar().getTitle();
				getActivity().invalidateOptionsMenu(); // calls
														// onPrepareOptionsMenu()
			}
		};

		// If the user hasn't 'learned' about the drawer, open it to introduce
		// them to the drawer,
		// per the navigation drawer design guidelines.
		if (!mUserLearnedDrawer && !mFromSavedInstanceState) {
			mDrawerLayout.openDrawer(mFragmentContainerView);
		}

		// Defer code dependent on restoration of previous instance state.
		mDrawerLayout.post(new Runnable() {
			@Override
			public void run() {
				mDrawerToggle.syncState();
			}
		});

		mDrawerLayout.setDrawerListener(mDrawerToggle);
	}

	private void selectItem(int position) {
		mCurrentSelectedPosition = position;
		if (mDrawerListView != null) {
			mDrawerListView.setItemChecked(position, true);
		}
		if (mDrawerLayout != null) {
			mDrawerLayout.closeDrawer(mFragmentContainerView);
		}
		if (mCallbacks != null) {
			mCallbacks.onNavigationDrawerItemSelected(position);
		}
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mCallbacks = (NavigationDrawerCallbacks) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(
					"Activity must implement NavigationDrawerCallbacks.");
		}
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = null;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(STATE_SELECTED_POSITION, mCurrentSelectedPosition);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Forward the new configuration the drawer toggle component.
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// If the drawer is open, show the global app actions in the action bar.
		// See also
		// showGlobalContextActionBar, which controls the top-left area of the
		// action bar.
		if (mDrawerLayout != null && isDrawerOpen()) {
			inflater.inflate(R.menu.global, menu);
			showGlobalContextActionBar();
		}
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * Per the navigation drawer design guidelines, updates the action bar to
	 * show the global app 'context', rather than just what's in the current
	 * screen.
	 */
	private void showGlobalContextActionBar() {
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setTitle(R.string.app_name);
	}

	
	private ActionBar getActionBar() {
		return getActivity().getActionBar();
	}

	/**
	 * Callbacks interface that all activities using this fragment must
	 * implement.
	 */
	public static interface NavigationDrawerCallbacks {
		/**
		 * Called when an item in the navigation drawer is selected.
		 */
		void onNavigationDrawerItemSelected(int position);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		// Indicate that this fragment would like to influence the set of
		// actions in the action bar.
		setHasOptionsMenu(true);
	}

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
			return new CursorLoader(getActivity(), ShowTeams.CONTENT_URI,
					ShowTeamsQuery.PROJECTION, null, null,
					ShowTeams.ACTIVE_FIRST_SORT);
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

	@Override
	public void onPause() {
		super.onPause();
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	@Override
	public void onResume() {
		super.onResume();
		getActivity().getLoaderManager().restartLoader(
				Query.ShowTeamsQuery._TOKEN, null, this);
		getActivity().getContentResolver().registerContentObserver(
				ShowTeams.CONTENT_URI, true, mObserver);
	}

	public void setDrawerIndicatorEnabled(boolean enabled) {
		mDrawerToggle.setDrawerIndicatorEnabled(enabled);
	}
	
	public boolean isDrawerIndicatorEnabled()
	{
		return mDrawerToggle.isDrawerIndicatorEnabled();
	}
}
