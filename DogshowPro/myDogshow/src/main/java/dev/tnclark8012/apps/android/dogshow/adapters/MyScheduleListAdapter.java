package dev.tnclark8012.apps.android.dogshow.adapters;

/*
 * Copyright 2014 Google Inc. All rights reserved.
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

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.Date;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.model.BreedRing;
import dev.tnclark8012.apps.android.dogshow.util.LPreviewUtilsBase;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;

/**
 * Adapter that produces views to render (one day of) the "My Schedule" screen.
 */
public class MyScheduleListAdapter implements ListAdapter {
    private static final String TAG = makeLogTag("MyScheduleAdapter");
    private static final int VIEW_TYPE_NORMAL = 0;


    private final Context mContext;
    private final LPreviewUtilsBase mLPreviewUtils;

    // additional top padding to add to first item of list
    int mContentTopClearance = 0;

    // list of items served by this adapter
    ArrayList<BreedRing> mItems = new ArrayList<BreedRing>();

    // observers to notify about changes in the data
    ArrayList<DataSetObserver> mObservers = new ArrayList<DataSetObserver>();

//    ImageLoader mImageLoader;
//
    int mDefaultSessionColor;
    int mDefaultStartTimeColor;
    int mDefaultEndTimeColor;

    // increased every time the data is updated; used when deciding whether to
    // recycle views so we can tell that a view is from a previous generation of
    // the data and thus shouldn't be used
    int mDataGeneration = 0;

    public MyScheduleListAdapter(Context context, LPreviewUtilsBase lPreviewUtils) {
        mContext = context;
        mLPreviewUtils = lPreviewUtils;

        mDefaultSessionColor = mContext.getResources().getColor(R.color.dark_blue);
        mDefaultStartTimeColor = mContext.getResources().getColor(R.color.body_text_2);
        mDefaultEndTimeColor = mContext.getResources().getColor(R.color.body_text_3);
        mItems.add(new BreedRing());
        mItems.add(new BreedRing());
        mItems.add(new BreedRing());
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {
        if (!mObservers.contains(observer)) {
            mObservers.add(observer);
        }
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
        }
    }

    public void setContentTopClearance(int padding) {
        mContentTopClearance = padding;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return position >= 0 && position < mItems.size() ? mItems.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    private static final String MY_VIEW_TAG = "MyScheduleAdapter_MY_VIEW_TAG";

    @Override
    public View getView(int position, View view, ViewGroup parent) {
//        if (mImageLoader == null) {
//            mImageLoader = new ImageLoader();
//        }

        Resources res = mContext.getResources();

        TextView startTimeView = null;
        TextView endTimeView = null;

        int itemViewType = getItemViewType(position);
        boolean isNowPlaying = false;
        boolean isPastDuringConference = false;
        int layoutResId = R.layout.list_item_my_schedule
;
        if (view == null || !MY_VIEW_TAG.equals(view.getTag())
              ) {
            view = ((LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                    .inflate(layoutResId, parent, false);
        }

        if (position < 0 || position >= mItems.size()) {
            LOGE(TAG, "Invalid view position passed to MyScheduleAdapter: " + position);
            return view;
        }
        final BreedRing item = mItems.get(position);

        view.setTag(MY_VIEW_TAG);
        startTimeView = (TextView) view.findViewById(R.id.start_time);
        endTimeView = (TextView) view.findViewById(R.id.end_time);
        ImageView bgImageView = (ImageView) view.findViewById(R.id.background_image);
        final ImageView sessionImageView = (ImageView) view.findViewById(R.id.session_image);
        FrameLayout boxView = (FrameLayout) view.findViewById(R.id.box);
        TextView slotTitleView = (TextView) view.findViewById(R.id.slot_title);
        TextView slotSubtitleView = (TextView) view.findViewById(R.id.slot_subtitle);
//        ImageButton giveFeedbackButton = (ImageButton) view.findViewById(R.id.give_feedback_button);
//        int heightNormal = 180;//res.getDimensionPixelSize(R.dimen.my_schedule_item_height);

        long now = Utils.currentTimeUtc();//.getCurrentTime(view.getContext());
        boolean showEndTime = false;
        boolean isBlockNow = false;


        View conflictWarning =  view.findViewById(R.id.conflict_warning);

//            view.getLayoutParams().height =  heightNormal;
            boxView.setBackgroundResource(R.drawable.schedule_item_session);
//            boxView.setForeground(res.getDrawable(R.drawable.schedule_item_touchoverlay));
            bgImageView.setVisibility(View.VISIBLE);
            sessionImageView.setVisibility(View.VISIBLE);
            int colorToUse = mDefaultSessionColor;
        switch (position)
        {
            case 0: colorToUse = mContext.getResources().getColor(R.color.dark_green); break;
            case 1: colorToUse = mContext.getResources().getColor(R.color.dark_red); break;
            case 2: colorToUse = mContext.getResources().getColor(R.color.white); break;

        }
                       int color = UIUtils.scaleSessionColorToDefaultBG(
                colorToUse );

            final ColorDrawable colorDrawable = new ColorDrawable(color);
            bgImageView.setImageDrawable(colorDrawable);
            bgImageView.setColorFilter(UIUtils.setColorAlpha(color,
                    UIUtils.SESSION_PHOTO_SCRIM_ALPHA));

                sessionImageView.setColorFilter(UIUtils.setColorAlpha(color,
                        UIUtils.SESSION_PHOTO_SCRIM_ALPHA));
                sessionImageView.setImageResource(R.drawable.dog);


//            slotTitleView.setText(item.title);
            slotTitleView.setTextColor(Color.WHITE);
        slotSubtitleView.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
//                    : res.getColor(R.color.body_text_1_inverse));
//            mLPreviewUtils.setMediumTypeface(slotTitleView);
            if (slotSubtitleView != null) {

                slotSubtitleView.setTextColor(res.getColor(R.color.body_text_2_inverse));
            }



        return view;
    }

    @Override
    public int getItemViewType(int i) {
        return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return mItems.isEmpty();
    }

}
