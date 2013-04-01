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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockListFragment;

import dev.tnclark8012.dogshow.apps.android.R;
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
	private long mSelectedShowId = -1;

	public interface Callbacks {
		void onShowSelected(long showId);

		void onShowSynced();
	}
	
	private AsyncTask<Void, Void, JSONArray> getShowsTask = new AsyncTask<Void, Void, JSONArray>()
			{
				protected void onPostExecute(JSONArray result) {
					mAdapter = new ShowListAdapter(getActivity(), result);
					setListAdapter(mAdapter);
					mAdapter.notifyDataSetChanged();
				}
				@Override
				protected JSONArray doInBackground(Void... params) {
					return new SyncHelper(getActivity()).getShows();
				};
			};

	private static Callbacks sDummyCallbacks = new Callbacks() {
		@Override
		public void onShowSelected(long showId) {
		}

		@Override
		public void onShowSynced() {
		}
	};
	private Callbacks mCallbacks = sDummyCallbacks;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		final Intent intent = BaseActivity
				.fragmentArgumentsToIntent(getArguments());
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException(
					"Activity must implement fragment's callbacks.");
		}
		mCallbacks = (Callbacks) activity;
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.fragment_find_show, container,
				false);
		getShowsTask.execute();
		return mRootView;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		JSONObject show = mAdapter.getItem(position);
		try {
			mSelectedShowId = show.getLong("id");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		mCallbacks.onShowSelected(mSelectedShowId);
	}

	private class ShowListAdapter extends ArrayAdapter<JSONObject> {
		int mResource;
		int mTextViewResourceId;
		JSONArray mArray;

		public ShowListAdapter(Context context, JSONArray array) {
			super(context, android.R.layout.simple_list_item_1,
					android.R.id.text1);
			mArray = array;
		}

		@Override
		public JSONObject getItem(int position) {
			try {
				return mArray.getJSONObject(position);
			} catch (JSONException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		@Override
		public int getCount() {
			return mArray.length();
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			convertView = super.getView(position, convertView, parent);
			JSONObject obj = getItem(position);
			//Checking if it has a name first prevents try catch from failing (expensively)
			if (obj != null && obj.has("showName")) {
				try {
					((TextView) convertView.findViewById(android.R.id.text1))
							.setText(obj.getString("showName"));
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
			return convertView;
		}
	}

}