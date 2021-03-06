package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import dev.tnclark8012.apps.android.dogshow.ui.phone.BreedSelectActivity;
import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class BreedSelectFragment extends ListFragment {
	private static final String TAG =  makeLogTag(BreedSelectFragment.class);

	public interface BreedSelectListener {
		public void onBreedSelected(Breeds breed);
	}

	private BreedGroup mGroup;
	private BreedSelectListener mListener;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mGroup = (BreedGroup) getArguments().getSerializable(
				BreedSelectActivity.EXTRA_BREED_GROUP);
	}

    @Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		String[] breeds = mGroup.getBreedNames();
		LOGD(TAG, "Group: " + mGroup);
		setListAdapter(new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, android.R.id.text1, breeds));
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		LOGV(TAG,"clicked position " + position);
        if (mListener != null) {
			mListener.onBreedSelected(mGroup.getBreeds()[position]);
		}
        else
        {
            LOGW(TAG, "No listener!");
        }
	}

	public void setOnBreedSelectListener(BreedSelectListener selectListener) {
		mListener = selectListener;
	}
}
