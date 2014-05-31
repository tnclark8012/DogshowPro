package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.ui.DogListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.IncompleteFragment;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment.NavigationDrawerCallbacks;
import dev.tnclark8012.apps.android.dogshow.ui.phone.DogListActivity;
import dev.tnclark8012.apps.android.dogshow.ui.phone.HandlerListActivity;
import dev.tnclark8012.apps.android.dogshow.ui.phone.MyScheduleActivity;

/**
 * The landing screen for the app, once the user has logged in.
 */
public abstract class NavigatableActivity extends SimpleSinglePaneActivity
		implements NavigationDrawerCallbacks {
	private static final String TAG = NavigatableActivity.class.getSimpleName();
	public static final String EXTRA_SELECTED_NAVIGATION = "selected_navigation";
	private NavigationDrawerFragment mNavigationDrawerFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigation);
		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);
		// mNavigationDrawerFragment.setArguments(getIntent().getExtras());
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));
	}

	public void changeRootFragment(Fragment fragment) {
		if (fragment != null) {
			getFragmentManager().beginTransaction()
					.replace(R.id.root_container, fragment).commit();
		}
	}

	public void addFragment(Fragment fragment, String tag) {
		if (fragment != null) {
			getFragmentManager().beginTransaction()
					.add(R.id.root_container, fragment, tag).commit();
		}
	}

	public void changeRootFragment(int navigationPosition) {
		// // Insert the fragment by replacing any existing
		// fragment
		Fragment newRoot = getFragment(navigationPosition);
		if (newRoot != null) {
			FragmentManager fragmentManager = getFragmentManager();
			fragmentManager.beginTransaction()
					.replace(R.id.root_container, newRoot).commit();
		}
	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		startActivity(getIntent(position));
		finish();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		//If shown as "up", simulate a back button press. Otherwise, allow the drawer to open
		if (item.getItemId() == android.R.id.home
				&& !mNavigationDrawerFragment.isDrawerIndicatorEnabled()) {
			onBackPressed();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected Fragment onCreatePane() {
		return IncompleteFragment.newInstance("nav activity");
	}

	private Intent getIntent(int navigationPostion) {
		Intent i = null;
		switch (navigationPostion) {
		case NavigationDrawerFragment.NAVIGATION_SHOW:
			i = new Intent(this, MyScheduleActivity.class);
			break;
		case NavigationDrawerFragment.NAVIGATION_DOGS:
			i = new Intent(this, DogListActivity.class);
			break;
		case NavigationDrawerFragment.NAVIGATION_HANDLERS:
			i = new Intent(this, HandlerListActivity.class);// TODO use actions?
			break;
		}
		if (i != null)
			i.putExtra(EXTRA_SELECTED_NAVIGATION, navigationPostion);
		return i;
	}

	private Fragment getFragment(int navigationPostion) {
		switch (navigationPostion) {
		case NavigationDrawerFragment.NAVIGATION_SHOW:
			return new MyScheduleFragment();
		case NavigationDrawerFragment.NAVIGATION_DOGS:
			return new DogListFragment();
		case NavigationDrawerFragment.NAVIGATION_HANDLERS:
			return new HandlerListFragment();
		}
		return null;
	}

	public void setDrawerIndicatorEnabled(boolean enabled) {
		mNavigationDrawerFragment.setDrawerIndicatorEnabled(enabled);
	}
}
