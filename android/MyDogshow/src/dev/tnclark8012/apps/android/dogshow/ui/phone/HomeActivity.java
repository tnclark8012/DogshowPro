package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.NavigationDrawerCursorAdapter;
import dev.tnclark8012.apps.android.dogshow.ui.DashboardFragment;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigatableActivity;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

/**
 * The landing screen for the app, once the user has logged in.
 */
public class HomeActivity extends NavigatableActivity implements
		LoaderCallbacks<Cursor> {
	private static final String TAG = HomeActivity.class.getSimpleName();
	private DrawerLayout mDrawerLayout;
	private LinearLayout mDrawerConents;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private RelativeLayout mJoinButton;
	private NavigationDrawerCursorAdapter mAdapter;
	private Spinner showTeamSpinner;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		// getActionBar().setHomeButtonEnabled(false);
		// getActionBar().setDisplayHomeAsUpEnabled(false);
		// setContentView(R.layout.activity_home);

		// mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		// mDrawerConents = (LinearLayout) findViewById(R.id.drawer_contents);
		// // mJoinButton = (RelativeLayout)
		// findViewById(R.id.button_join_team);
		// // mJoinButton.setOnClickListener(new OnClickListener() {
		// // @Override
		// // public void onClick(View v) {
		// // if (Prefs.isSyncEnabled(HomeActivity.this)) {
		// // // Create a new fragment and specify the planet to show based on
		// // position
		// // Fragment fragment = new ShowTeamListFragment();
		// // // // Insert the fragment by replacing any existing fragment
		// // FragmentManager fragmentManager = getFragmentManager();
		// // fragmentManager.beginTransaction().replace(R.id.content_frame,
		// // fragment, "join").addToBackStack("base").commit();
		// // mDrawerLayout.closeDrawer(mDrawerConents);
		// // }
		// // }
		// // });
		// mDrawerToggle = new DogshowActionBarDrawerToggle(this,
		// mDrawerLayout);
		// // Set the drawer toggle as the DrawerListener
		// mDrawerLayout.setDrawerListener(mDrawerToggle);
		// getActionBar().setDisplayHomeAsUpEnabled(true);
		// if (Utils.isJellybean()) {
		// getActionBar().setHomeButtonEnabled(true);
		// }
		// mDrawerList = (ListView) findViewById(R.id.left_drawer);
		//
		// mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
		// GravityCompat.START);
		// ArrayList<DrawerItem> dataList = new ArrayList<DrawerItem>();
		// // Add Drawer Item to dataList
		// List<SpinnerItem> userList = new ArrayList<SpinnerItem>();
		//
		// userList.add(new SpinnerItem(-1, "Ahamed Ishak", "ishak@gmail.com"));
		// userList.add(new SpinnerItem(-1, "Brain Jekob",
		// "brain.j@gmail.com"));
		//
		// dataList.add(new DrawerItemSpinner(userList)); // adding a
		// // spinner to
		// // the list
		//
		// // dataList.add(new DrawerItem("My Favorites")); // adding a header
		// to
		// // the list
		// dataList.add(new DrawerItemNavigation("Show Day",
		// new OnClickListener() {
		// @Override
		// public void onClick(View v) {
		// }
		// }));
		// dataList.add(new DrawerItemNavigation("Dogs"));
		// dataList.add(new DrawerItemNavigation("Handlers"));
		// dataList.add(new DrawerItemNavigation("History"));
		// dataList.add(new DrawerItemOption("Settings"));
		// dataList.add(new DrawerItemOption("Manage Teams"));
		//
		// CustomDrawerAdapter adapter = new CustomDrawerAdapter(this,
		// R.layout.custom_drawer_item, dataList);
		// mDrawerList.setAdapter(adapter);
		//
		// // String currentTeam = Prefs.currentTeamIdentifier(this);
		// // // Set the adapter for the list view
		// // mAdapter = new NavigationDrawerCursorAdapter(this, null, false,
		// // R.layout.list_item_simple, R.id.text1, ShowTeamsQuery.TEAM_NAME,
		// // currentTeam, ShowTeamsQuery.IDENTIFIER);
		// // mDrawerList.setAdapter(mAdapter);
		// // // Set the list's click listener
		// mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		// // mDrawerList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		// mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
		// GravityCompat.START);
		// Fragment fragment = new DashboardFragment();
		// // // Insert the fragment by replacing any existing fragment
		// FragmentManager fragmentManager = getFragmentManager();
		// fragmentManager.beginTransaction()
		// .replace(R.id.content_frame, fragment).commit();
		// getLoaderManager().initLoader(ShowTeamsQuery._TOKEN, null, this);
		// setTitle("Dog Show Pro");
	}

	// @Override
	// protected void onPause() {
	// super.onPause();
	// getContentResolver().unregisterContentObserver(mObserver);
	// }
	//
	// @Override
	// protected void onResume() {
	// super.onResume();
	// getContentResolver().registerContentObserver(ShowTeams.CONTENT_URI,
	// true, mObserver);
	// }
	//
	// @Override
	// protected void onPostCreate(Bundle savedInstanceState) {
	// super.onPostCreate(savedInstanceState);
	// // Sync the toggle state after onRestoreInstanceState has occurred.
	// mDrawerToggle.syncState();
	// }
	//
	// @Override
	// public void onConfigurationChanged(Configuration newConfig) {
	// super.onConfigurationChanged(newConfig);
	// mDrawerToggle.onConfigurationChanged(newConfig);
	// }

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
	// Prefs.setCurrentTeamIdentifier(HomeActivity.this,
	// selectedTeamIdentifier);
	// mDrawerList.setItemChecked(position, true);
	// SyncHelper.requestManualSync(this, AccountUtils.getChosenAccount(this),
	// SyncHelper.FLAG_SYNC_REMOTE);
	// mDrawerLayout.closeDrawer(mDrawerConents);
	// }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
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

//	@Override
//	protected Fragment onCreatePane() {
//		return new DashboardFragment();
//	}

}
