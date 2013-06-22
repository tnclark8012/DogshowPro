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

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockListFragment;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.model.Show;
import dev.tnclark8012.dogshow.apps.android.sync.SyncHelper;

/**
 * Schedule Similar to {@link MyScheduleFragment} but does not remove past rings
 * 
 * @author Taylor
 * 
 */
public class FindShowFragment extends SherlockListFragment {
	private static final String TAG = FindShowFragment.class.getSimpleName();
	private ShowListAdapter mAdapter;
	private View mRootView;
	private String mSelectedShowId = "[not set]";

	public interface Callbacks {
		void onShowSelected(String showId);

		void onShowSynced();
	}

	private AsyncTask<Void, Void, Show[]> getShowsTask = new AsyncTask<Void, Void, Show[]>() {
		protected void onPostExecute(Show[] result) {
			if (result != null) {
                Toast.makeText(getActivity(), "Populating list...", Toast.LENGTH_LONG).show();
				mAdapter = new ShowListAdapter(getActivity(), result);
				setListAdapter(mAdapter);
				mAdapter.notifyDataSetChanged();
			} else {
                Toast.makeText(getActivity(), "No Shows Found.", Toast.LENGTH_LONG).show();
            }
		}

		@Override
		protected Show[] doInBackground(Void... params) {
			return new SyncHelper(getActivity()).getShows();
		};
	};

	private static Callbacks sDummyCallbacks = new Callbacks() {
		@Override
		public void onShowSelected(String showId) {
		}

		@Override
		public void onShowSynced() {
		}
	};
	private Callbacks mCallbacks = sDummyCallbacks;

	@Override
	public void onPause() {
		super.onPause();
		getShowsTask.cancel(true);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException("Activity must implement fragment's callbacks.");
		}
		mCallbacks = (Callbacks) activity;
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.fragment_find_show, container, false);
		getShowsTask.execute();
		return mRootView;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Show show = mAdapter.getItem(position);
		mSelectedShowId = show.showId;
		mCallbacks.onShowSelected(mSelectedShowId);
	}

	private class ShowListAdapter extends ArrayAdapter<Show> {
		int mResource;
		int mTextViewResourceId;
		Show[] mArray;

		public ShowListAdapter(Context context, Show[] result) {
			super(context, android.R.layout.simple_list_item_2, android.R.id.text1);
			mArray = result;
		}

		@Override
		public Show getItem(int position) {
				return mArray[position];
		}

		@Override
		public int getCount() {
			if (mArray != null) {
				return mArray.length;
			}
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			convertView = super.getView(position, convertView, parent);
			Show obj = getItem(position);
			// Checking if it has a name first prevents try catch from failing
			// (expensively)
			if (obj != null) {
				((TextView) convertView.findViewById(android.R.id.text1)).setText(obj.showName);
				((TextView) convertView.findViewById(android.R.id.text2)).setText(obj.city + ", " + obj.state);
			}
			return convertView;
		}
	}

}
