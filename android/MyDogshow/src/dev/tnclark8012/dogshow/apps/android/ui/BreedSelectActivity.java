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

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

import com.actionbarsherlock.app.ActionBar;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.ui.BreedSelectFragment.BreedSelectListener;
import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

/**
 * The landing screen for the app, once the user has logged in.
 * 
 * <p>
 * This activity uses different layouts to present its various fragments,
 * depending on the device configuration. {@link MyScheduleFragment},
 * {@link ExploreFragment}, and {@link SocialStreamFragment} are always
 * available to the user. {@link WhatsOnFragment} is always available on tablets
 * and phones in portrait, but is hidden on phones held in landscape.
 * 
 * <p>
 * On phone-size screens, the three fragments are represented by
 * {@link ActionBar} tabs, and can are held inside a {@link ViewPager} to allow
 * horizontal swiping.
 * 
 * <p>
 * On tablets, the three fragments are always visible and are presented as
 * either three panes (landscape) or a grid (portrait).
 */
public class BreedSelectActivity extends BaseActivity implements
		ActionBar.TabListener, ViewPager.OnPageChangeListener,
		BreedSelectListener {

	private static final String TAG = BreedSelectActivity.class.getSimpleName();
	public final static String EXTRA_BREED_GROUP = "dev.tnclark8012.dogshow.apps.android.extra.BreedSelectActivity.EXTRA_BREED_GROUP";
	public final static int REQUEST_CODE_BREED_SELECT = 0x1;
	private ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFinishing()) {
			return;
		}
		setContentView(R.layout.activity_breed_select);
		FragmentManager fm = getSupportFragmentManager();

		mViewPager = (ViewPager) findViewById(R.id.pager);
		if (mViewPager != null) {
			// Phone setup
			mViewPager.setAdapter(new BreedSelectPagerAdapter(
					getSupportFragmentManager()));
			mViewPager.setOnPageChangeListener(this);
			mViewPager.setPageMarginDrawable(R.drawable.grey_border_inset_lr);
			mViewPager.setPageMargin(getResources().getDimensionPixelSize(
					R.dimen.page_margin_width));

			final ActionBar actionBar = getSupportActionBar();
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			actionBar
					.addTab(actionBar.newTab()
							.setText(BreedGroup.HERDING.getName())
							.setTabListener(this));
			actionBar.addTab(actionBar.newTab()
					.setText(BreedGroup.HOUND.getName()).setTabListener(this));
			actionBar.addTab(actionBar.newTab()
					.setText(BreedGroup.MISCELLANEOUS.getName())
					.setTabListener(this));
			actionBar.addTab(actionBar.newTab()
					.setText(BreedGroup.NON_SPORTING.getName())
					.setTabListener(this));
			actionBar.addTab(actionBar.newTab()
					.setText(BreedGroup.SPORTING.getName())
					.setTabListener(this));
			actionBar
					.addTab(actionBar.newTab()
							.setText(BreedGroup.TERRIER.getName())
							.setTabListener(this));
			actionBar.addTab(actionBar.newTab()
					.setText(BreedGroup.TOY.getName()).setTabListener(this));
			actionBar
					.addTab(actionBar.newTab()
							.setText(BreedGroup.WORKING.getName())
							.setTabListener(this));
			actionBar.addTab(actionBar.newTab()
					.setText(BreedGroup.FSS.getName()).setTabListener(this));

		}
		getSupportActionBar().setHomeButtonEnabled(true);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
		 mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onPageScrolled(int i, float v, int i1) {
	}

	@Override
	public void onPageSelected(int position) {
		getSupportActionBar().setSelectedNavigationItem(position);
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

	private class BreedSelectPagerAdapter extends FragmentPagerAdapter {
		BreedSelectFragment mHerding;
		BreedSelectFragment mHound;
		BreedSelectFragment mMiscellaneous;
		BreedSelectFragment mNonSporting;
		BreedSelectFragment mSporting;
		BreedSelectFragment mTerrier;
		BreedSelectFragment mToy;
		BreedSelectFragment mWorking;
		BreedSelectFragment mFss;

		public BreedSelectPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			Bundle b = new Bundle();
			switch (position) {
			case 0:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.HERDING);
				mHerding = new BreedSelectFragment();
				mHerding.setOnBreedSelectListener(BreedSelectActivity.this);
				mHerding.setArguments(b);
				return mHerding;
			case 1:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.HOUND);
				mHound = new BreedSelectFragment();
				mHound.setOnBreedSelectListener(BreedSelectActivity.this);
				mHound.setArguments(b);
				return mHound;
			case 2:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.MISCELLANEOUS);
				mMiscellaneous = new BreedSelectFragment();
				mMiscellaneous.setOnBreedSelectListener(BreedSelectActivity.this);
				mMiscellaneous.setArguments(b);
				return mMiscellaneous;
			case 3:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.NON_SPORTING);
				mNonSporting = new BreedSelectFragment();
				mNonSporting.setOnBreedSelectListener(BreedSelectActivity.this);
				mNonSporting.setArguments(b);
				return mNonSporting;
			case 4:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.SPORTING);
				mSporting = new BreedSelectFragment();
				mSporting.setOnBreedSelectListener(BreedSelectActivity.this);
				mSporting.setArguments(b);
				return mSporting;
			case 5:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.TERRIER);
				mTerrier = new BreedSelectFragment();
				mTerrier.setOnBreedSelectListener(BreedSelectActivity.this);
				mTerrier.setArguments(b);
				return mTerrier;
			case 6:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.TOY);
				mToy = new BreedSelectFragment();
				mToy.setArguments(b);
				return mToy;
			case 7:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.WORKING);
				mWorking = new BreedSelectFragment();
				mWorking.setArguments(b);
				return mWorking;
			case 8:
				b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.FSS);
				mFss = new BreedSelectFragment();
				mFss.setArguments(b);
				return mFss;
			}
			return null;
		}

		@Override
		public int getCount() {
			return 9;
		}
	}

	@Override
	public void onBreedSelected(Breeds breed) {
		Intent finishIntent = new Intent();
		finishIntent.putExtra(BreedSelectActivity.EXTRA_BREED_GROUP, breed);
		setResult(REQUEST_CODE_BREED_SELECT, finishIntent);
		finish();
	}
}
