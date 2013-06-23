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
                    mToy.setOnBreedSelectListener(BreedSelectActivity.this);
                    mToy.setArguments(b);
                    return mToy;
                case 7:
                    b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.WORKING);
                    mWorking = new BreedSelectFragment();
                    mWorking.setOnBreedSelectListener(BreedSelectActivity.this);
                    mWorking.setArguments(b);
                    return mWorking;
                case 8:
                    b.putSerializable(EXTRA_BREED_GROUP, BreedGroup.FSS);
                    mFss = new BreedSelectFragment();
                    mFss.setOnBreedSelectListener(BreedSelectActivity.this);
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
