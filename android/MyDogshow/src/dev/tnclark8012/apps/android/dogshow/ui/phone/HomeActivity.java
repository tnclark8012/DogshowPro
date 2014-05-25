package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.ui.DogListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.IncompleteFragment;
import dev.tnclark8012.apps.android.dogshow.ui.MyScheduleFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseActivity;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment.NavigationDrawerCallbacks;

/**
 * The landing screen for the app, once the user has logged in.
 */
public class HomeActivity extends BaseActivity implements
		NavigationDrawerCallbacks {
	private static final String TAG = HomeActivity.class.getSimpleName();

	public static final String EXTRA_SELECTED_NAVIGATION = "selected_navigation";
	private NavigationDrawerFragment mNavigationDrawerFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
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
	}

	public void changeRootFragment(int navigationPosition) {
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager
				.beginTransaction()
				.replace(R.id.root_container, getNavigationRootFragment(navigationPosition))
				.commit();

	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		changeRootFragment(position);
	}

	private Fragment getNavigationRootFragment(int navigationPostion) {
		switch (navigationPostion) {
		case NavigationDrawerFragment.NAVIGATION_SHOW:
			return new MyScheduleFragment();
		case NavigationDrawerFragment.NAVIGATION_DOGS:
			return new DogListFragment();
		case NavigationDrawerFragment.NAVIGATION_HANDLERS:
			return new HandlerListFragment();
		}
		return IncompleteFragment.newInstance("home activity: " + navigationPostion);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
}
