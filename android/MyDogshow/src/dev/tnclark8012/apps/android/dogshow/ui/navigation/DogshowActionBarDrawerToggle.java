package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.app.Activity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import dev.tnclark8012.apps.android.dogshow.R;

public class DogshowActionBarDrawerToggle extends ActionBarDrawerToggle {
	private Activity mActivity;

	public DogshowActionBarDrawerToggle(Activity activity,
			DrawerLayout drawerLayout) {
		super(activity, drawerLayout, R.drawable.ic_drawer_white,
				R.string.app_name, R.string.action_settings);
		mActivity = activity;
	}

	/** Called when a drawer has settled in a completely closed state. */
	public void onDrawerClosed(View view) {
		super.onDrawerClosed(view);
		mActivity.invalidateOptionsMenu();// creates call to
		// onPrepareOptionsMenu()
	}

	/** Called when a drawer has settled in a completely open state. */
	public void onDrawerOpened(View drawerView) {
		super.onDrawerOpened(drawerView);
		mActivity.invalidateOptionsMenu(); // creates call to
		// onPrepareOptionsMenu()
	}
}
