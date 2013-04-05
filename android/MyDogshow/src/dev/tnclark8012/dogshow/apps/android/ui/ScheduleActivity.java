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

package dev.tnclark8012.dogshow.apps.android.ui;

import static dev.tnclark8012.dogshow.apps.android.util.LogUtils.LOGD;
import android.accounts.Account;
import android.content.ContentResolver;
import android.content.SyncStatusObserver;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.util.AccountUtils;

/**
 * The landing screen for the app, once the user has logged in.
 * 
 * <p>
 * This activity uses different layouts to present its various fragments, depending on the device configuration. {@link MyScheduleFragment}, {@link ExploreFragment}, and {@link SocialStreamFragment} are always available to the user. {@link WhatsOnFragment} is always available on tablets and phones in portrait, but is hidden on phones held in landscape.
 * 
 * <p>
 * On phone-size screens, the three fragments are represented by {@link ActionBar} tabs, and can are held inside a {@link ViewPager} to allow horizontal swiping.
 * 
 * <p>
 * On tablets, the three fragments are always visible and are presented as either three panes (landscape) or a grid (portrait).
 */
public class ScheduleActivity extends BaseActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {

	private static final String TAG = HomeActivity.class.getSimpleName();

	private Object mSyncObserverHandle;

	private ViewPager mViewPager;
	private Menu mOptionsMenu;
	private AsyncTask<Void, Void, Void> mGCMRegisterTask;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFinishing()) {
			return;
		}
		setContentView(R.layout.activity_schedule);
		FragmentManager fm = getSupportFragmentManager();

		mViewPager = (ViewPager) findViewById(R.id.pager);
		String homeScreenLabel;
		if (mViewPager != null) {
			// Phone setup
			mViewPager.setAdapter(new HomePagerAdapter(getSupportFragmentManager()));
			mViewPager.setOnPageChangeListener(this);
			mViewPager.setPageMarginDrawable(R.drawable.grey_border_inset_lr);
			mViewPager.setPageMargin(getResources().getDimensionPixelSize(R.dimen.page_margin_width));

			final ActionBar actionBar = getSupportActionBar();
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			actionBar.addTab(actionBar.newTab().setText(R.string.title_my_schedule).setTabListener(this));
			actionBar.addTab(actionBar.newTab().setText(R.string.title_team_schedule).setTabListener(this));
			actionBar.addTab(actionBar.newTab().setText(R.string.title_full_schedule).setTabListener(this));

			homeScreenLabel = getString(R.string.title_my_schedule);

		}
		getSupportActionBar().setHomeButtonEnabled(true);

		// Sync data on load
		if (savedInstanceState == null) {
			triggerRefresh();
		}
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		if (mGCMRegisterTask != null) {
			mGCMRegisterTask.cancel(true);
		}
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onPageScrolled(int i, float v, int i1) {
	}

	@Override
	public void onPageSelected(int position) {
		getSupportActionBar().setSelectedNavigationItem(position);

		int titleId = -1;
		switch (position) {
		case 0:
			titleId = R.string.title_my_schedule;
			break;
		case 1:
			titleId = R.string.title_team_schedule;
			break;
		case 2:
			titleId = R.string.title_full_schedule;
			break;
		}

		String title = getString(titleId);
		setTitle(titleId);
		LOGD("Tracker", title);

	}

	@Override
	public void onPageScrollStateChanged(int i) {
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		// Since the pager fragments don't have known tags or IDs, the only way
		// to persist the
		// reference is to use putFragment/getFragment. Remember, we're not
		// persisting the exact
		// Fragment instance. This mechanism simply gives us a way to persist
		// access to the
		// 'current' fragment instance for the given fragment (which changes
		// across orientation
		// changes).
		//
		// The outcome of all this is that the "Refresh" menu button refreshes
		// the stream across
		// orientation changes.
		// if (mSocialStreamFragment != null) {
		// getSupportFragmentManager().putFragment(outState, "stream_fragment",
		// mSocialStreamFragment);
		// }
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		// if (mSocialStreamFragment == null) {
		// mSocialStreamFragment = (SocialStreamFragment)
		// getSupportFragmentManager()
		// .getFragment(savedInstanceState, "stream_fragment");
		// }
	}

	private class HomePagerAdapter extends FragmentPagerAdapter {
		MyScheduleFragment mMyScheduleFragment;
		MyScheduleFragment mTeamFragment;

		public HomePagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			Fragment fragment = null;
			Bundle args = intentToFragmentArguments(getIntent());
			args.putParcelable("_uri", DogshowContract.BreedRings.buildEnteredRingsUri());
			switch (position) {
			case 0:
				fragment = (mMyScheduleFragment == null) ? mMyScheduleFragment = new MyScheduleFragment() : mMyScheduleFragment;
				break;
			case 1:
				fragment = (mTeamFragment == null) ? mTeamFragment = new MyScheduleFragment() : mTeamFragment;
				break;
			case 2:
				Log.d(TAG, "new FullShowFragment()");
				fragment = new FullShowFragment();
				break;
			}
			fragment.setArguments(args);
			return fragment;
		}

		@Override
		public int getCount() {
			return 3;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		mOptionsMenu = menu;
		getSupportMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_refresh:
			triggerRefresh();
			return true;

		case R.id.menu_about:
			return false;

		case R.id.menu_sign_out:
			AccountUtils.signOut(this);
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void triggerRefresh() {
		Bundle extras = new Bundle();
		// extras.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
		// if (!UIUtils.isGoogleTV(this)) {
		// ContentResolver.requestSync(
		// new Account(AccountUtils.getChosenAccountName(this),
		// GoogleAccountManager.ACCOUNT_TYPE),
		// ScheduleContract.CONTENT_AUTHORITY, extras);
		// }
	}

	@Override
	protected void onPause() {
		super.onPause();
		if (mSyncObserverHandle != null) {
			ContentResolver.removeStatusChangeListener(mSyncObserverHandle);
			mSyncObserverHandle = null;
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		mSyncStatusObserver.onStatusChanged(0);

		// Watch for sync state changes
		final int mask = ContentResolver.SYNC_OBSERVER_TYPE_PENDING | ContentResolver.SYNC_OBSERVER_TYPE_ACTIVE;
		mSyncObserverHandle = ContentResolver.addStatusChangeListener(mask, mSyncStatusObserver);
	}

	public void setRefreshActionButtonState(boolean refreshing) {
		if (mOptionsMenu == null) {
			return;
		}
	}

	private final SyncStatusObserver mSyncStatusObserver = new SyncStatusObserver() {
		@Override
		public void onStatusChanged(int which) {
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					String accountName = AccountUtils.getChosenAccountName(ScheduleActivity.this);
					if (TextUtils.isEmpty(accountName)) {
						setRefreshActionButtonState(false);
						return;
					}

					Account account = new Account(accountName, "com.google");
				}
			});
		}
	};
}
