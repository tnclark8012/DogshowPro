package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.MyScheduleListAdapter;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseActivity;
import dev.tnclark8012.apps.android.dogshow.ui.phone.FindShowMapActivity;
import dev.tnclark8012.apps.android.dogshow.ui.widget.CheckableFrameLayout;
import dev.tnclark8012.apps.android.dogshow.util.LPreviewUtilsBase;

/**
 * Simple fragment used for debugging purposes only
 * Created by taylorc on 8/7/2014.
 */
public class DebugFragment extends Fragment {
    private View mRootView;
    private CheckableFrameLayout mAddScheduleButton;
    boolean mStarred;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return nextSchedule(inflater, container, savedInstanceState);
    }

    private View nextEntryView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        mRootView = inflater.inflate(R.layout.next_show_entry, container,
                false);
        mAddScheduleButton = (CheckableFrameLayout)
                mRootView.findViewById(R.id.add_schedule_button);
        mAddScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), FindShowMapActivity.class));
                boolean starred = !mStarred;
                showStarred(starred, true);
            }
        });

        return mRootView;
    }
    private View nextSchedule(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        mRootView = inflater.inflate(R.layout.fragment_my_schedule, container,
                false);
        ListView lv = (ListView) mRootView.findViewById(android.R.id.list);
        lv.setAdapter(new MyScheduleListAdapter(getActivity(), null));
        return mRootView;
    }
    private void showStarred(boolean starred, boolean allowAnimate) {
//        mStarred = starred;
//
//        mAddScheduleButton.setChecked(mStarred, allowAnimate);
//
//        ImageView iconView = (ImageView) mAddScheduleButton.findViewById(R.id.add_schedule_icon);
//        ((BaseActivity) getActivity()).getLPreviewUtils().setOrAnimatePlusCheckIcon(
//                iconView, starred, allowAnimate);
    }
}
