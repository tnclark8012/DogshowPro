package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseActivity;
import dev.tnclark8012.apps.android.dogshow.ui.widget.CheckableFrameLayout;

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
        mRootView = inflater.inflate(R.layout.next_show_entry, container,
                false);
        mAddScheduleButton = (CheckableFrameLayout)
                mRootView.findViewById(R.id.add_schedule_button);
        mAddScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean starred = !mStarred;
                showStarred(starred, true);
            }
        });

        return mRootView;
    }

    private void showStarred(boolean starred, boolean allowAnimate) {
        mStarred = starred;

        mAddScheduleButton.setChecked(mStarred, allowAnimate);

        ImageView iconView = (ImageView) mAddScheduleButton.findViewById(R.id.add_schedule_icon);
        ((BaseActivity) getActivity()).getLPreviewUtils().setOrAnimatePlusCheckIcon(
                iconView, starred, allowAnimate);
    }
}
