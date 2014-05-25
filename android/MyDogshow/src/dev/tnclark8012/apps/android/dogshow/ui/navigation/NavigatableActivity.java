package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.ui.DogListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.IncompleteFragment;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment.NavigationDrawerCallbacks;

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
		setContentView(R.layout.activity_home);
		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));
	}

	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
		// Bundle extras = getIntent().getExtras();
		// if (extras != null) {
		// sCurrentNavigation = extras.getInt(EXTRA_SELECTED_NAVIGATION,
		// sCurrentNavigation);
		// }
		// changeRootFragment(sCurrentNavigation);
	}

	public void changeRootFragment(int navigationPosition) {
		// // Insert the fragment by replacing any existing
		// fragment
		Fragment newRoot = getFragment(navigationPosition);
		if (newRoot != null) {
			FragmentManager fragmentManager = getFragmentManager();
			fragmentManager.beginTransaction()
			// .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
			// .setTransition(FragmentTransaction.TRANSIT_NONE)
					.replace(R.id.root_container, newRoot).commit();
		}
	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		changeRootFragment(position);
	}

	@Override
	protected Fragment onCreatePane() {
		return IncompleteFragment.newInstance("nav activity");
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

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
}
