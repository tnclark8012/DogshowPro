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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import android.app.Activity;
import android.app.Fragment;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Loader;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import dev.tnclark8012.dogshow.apps.android.BuildConfig;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.adapters.RingListAdapter;
import dev.tnclark8012.dogshow.apps.android.preferences.Prefs;
import dev.tnclark8012.dogshow.apps.android.provider.PersistHelper;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.dogshow.apps.android.sql.query.Query.RingsQuery;
import dev.tnclark8012.dogshow.apps.android.sql.query.Query.UpcomingRingQuery;
import dev.tnclark8012.dogshow.apps.android.ui.dialog.EditJudgeTimeDialog;
import dev.tnclark8012.dogshow.apps.android.util.Lists;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;

public class MyScheduleFragment extends Fragment implements LoaderManager.LoaderCallbacks<Cursor>, ActionMode.Callback, OnSharedPreferenceChangeListener, OnItemLongClickListener, EditJudgeTimeDialog.Callback {
	private long upcomingBreedRingStart = 0;
	private static final String TAG = MyScheduleFragment.class.getSimpleName();
	private RingListAdapter mAdapter;
	private View mRootView;
	private TextView mViewTitle;
	private TextView mViewTime;
	private TextView mViewRing;
	private RelativeLayout mBreedImage;
	private RelativeLayout mViewUpcomingHeader;
	private RelativeLayout mViewNoUpcomingHeader;
	private TextView mViewNoUpcomingHeaderText;
	private SparseBooleanArray newDayPositions;
	private StickyListHeadersListView stickyList;

	private Handler handler = new Handler();

	private Runnable updateUpcomingRunnable = new Runnable() {
		@Override
		public void run() {
			LoaderManager manager = getLoaderManager();
			manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(), MyScheduleFragment.this);
			manager.restartLoader(RingsQuery._TOKEN, getArguments(), MyScheduleFragment.this);
		}
	};
	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			Toast.makeText(getActivity(), "onChange", Toast.LENGTH_SHORT).show();
			if (getActivity() == null) {
				return;
			}
			Loader<Cursor> loader = getLoaderManager().getLoader(RingsQuery._TOKEN);
			if (loader != null) {
				loader.forceLoad();
			}
			loader = getLoaderManager().getLoader(UpcomingRingQuery._TOKEN);
			if (loader != null) {
				loader.forceLoad();
			}
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mAdapter = new RingListAdapter(getActivity());
		LoaderManager manager = getLoaderManager();
		manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(), this);// TODO use argument ring query token to choose ring types to show
		manager.restartLoader(RingsQuery._TOKEN, getArguments(), this);
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Use URI from arguments
		super.onAttach(activity);
		activity.getContentResolver().registerContentObserver(BreedRings.CONTENT_URI, true, mObserver);
		activity.getContentResolver().registerContentObserver(JuniorsRings.CONTENT_URI, true, mObserver);

	}

	@Override
	public void onDetach() {
		super.onDetach();
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
		handler.removeCallbacks(updateUpcomingRunnable);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.fragment_schedule_list, container, false);
		mViewTitle = (TextView) mRootView.findViewById(R.id.schedule_breed);
		mViewRing = (TextView) mRootView.findViewById(R.id.schedule_ring);
		mViewTime = (TextView) mRootView.findViewById(R.id.schedule_ring_time);
		mBreedImage = (RelativeLayout) mRootView.findViewById(R.id.schedule_breed_image);
		mViewUpcomingHeader = (RelativeLayout) mRootView.findViewById(R.id.schedule_upcoming_header);
		mViewNoUpcomingHeader = (RelativeLayout) mRootView.findViewById(R.id.schedule_no_upcoming_header);
		mViewNoUpcomingHeaderText = (TextView) mRootView.findViewById(R.id.schedule_no_upcoming_header_text);
		stickyList = (StickyListHeadersListView) mRootView.findViewById(R.id.ring_list);
		stickyList.setAdapter(mAdapter);
		return mRootView;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		CursorLoader loader = null;
		String selection = EnteredRings.UPCOMING_SELECTION;
		long now = (BuildConfig.DEBUG) ? 0 : System.currentTimeMillis();
		String[] allSelectionArgs = EnteredRings.buildUpcomingSelectionArgs(now);
		String[] selectionArgs = EnteredRings.buildUpcomingSelectionArgs(System.currentTimeMillis());
		switch (id) {
		case UpcomingRingQuery._TOKEN:
			loader = new CursorLoader(getActivity(), EnteredRings.CONTENT_URI, UpcomingRingQuery.PROJECTION, selection, selectionArgs, BreedRings.DEFAULT_SORT);
			break;
		case RingsQuery._TOKEN:
			loader = new CursorLoader(getActivity(), EnteredRings.CONTENT_URI, RingsQuery.PROJECTION, null, null, EnteredRings.DEFAULT_SORT);
		}
		return loader;
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
		if (getActivity() == null) {
			return;
		}
		int token = loader.getId();
		Log.v(TAG, "loader id " + token + " finished");
		if (token == UpcomingRingQuery._TOKEN) {
			onUpcomingRingQueryComplete(cursor);
		} else if (token == RingsQuery._TOKEN) {
			onRingsQueryComplete(cursor);
		} else {
			Log.d(TAG, "Query complete, Not Actionable: " + token);
			cursor.close();
		}
	}

	public void onRingsQueryComplete(Cursor cursor) {
		int cursorSize = cursor.getCount();
		ArrayList<Integer> newPositions = new ArrayList<Integer>();
		ArrayList<Integer> sectionIndices = new ArrayList<Integer>();
		ArrayList<String> sectionHeaders = new ArrayList<String>();
		ArrayList<Integer> sectionIds = new ArrayList<Integer>();
		int sectionIndex = 0;
		if (cursorSize > 0) {
			cursor.moveToFirst();
			int position = 0;
			newDayPositions = new SparseBooleanArray(cursorSize);
			newDayPositions.put(position, true);
			sectionIndices.add(position);
			newPositions.add(position);
			long prevBlockMillis = cursor.getLong(RingsQuery.BLOCK_START);
			String dateStr = DateUtils.formatDateTime(getActivity(), prevBlockMillis, DateUtils.FORMAT_SHOW_WEEKDAY | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NO_YEAR);
			sectionHeaders.add(dateStr);
			sectionIds.add(sectionIndex);

			long currentBlockMillis = 0;
			if (cursorSize > 1) {
				while (cursor.moveToNext()) {
					position++;
					currentBlockMillis = cursor.getLong(RingsQuery.BLOCK_START);
					if (!Utils.isSameDay(prevBlockMillis, currentBlockMillis)) {
						newDayPositions.put(position, true);
						newPositions.add(position);
						sectionIndices.add(position);
						dateStr = DateUtils.formatDateTime(getActivity(), currentBlockMillis, DateUtils.FORMAT_SHOW_WEEKDAY | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NO_YEAR);
						sectionHeaders.add(dateStr);
						sectionIndex++;
					}
					sectionIds.add(sectionIndex);
					prevBlockMillis = currentBlockMillis;
				}
			}
			cursor.moveToPosition(-1);
			// TODO use Guava
			mAdapter.setSections(Lists.toArray(sectionIndices, -1), sectionHeaders.toArray(new String[sectionHeaders.size()]), Lists.toArray(sectionIds, -1));
			mAdapter.changeCursor(cursor);
		}
	}

	public void onUpcomingRingQueryComplete(Cursor cursor) {
		if (cursor.moveToFirst()) {
			mViewNoUpcomingHeader.setVisibility(View.GONE);
			mViewUpcomingHeader.setVisibility(View.VISIBLE);
			String title = cursor.getString(UpcomingRingQuery.RING_TITLE);
			mViewTitle.setText(title);
			mViewRing.setText(getString(R.string.template_ring_number, cursor.getInt(UpcomingRingQuery.RING_NUMBER)));
			upcomingBreedRingStart = cursor.getLong(UpcomingRingQuery.RING_BLOCK_START);
			int countAhead = cursor.getInt(UpcomingRingQuery.BREED_COUNT_AHEAD);
			float judgeMinutesPerDog = Utils.getMaybeNull(cursor, UpcomingRingQuery.RING_JUDGE_TIME, Prefs.getEstimatedJudgingTime(getActivity()));
			long estimatedStart = Utils.estimateBlockStart(countAhead, upcomingBreedRingStart, judgeMinutesPerDog);

			mViewTime.setText(UIUtils.timeStringFromMillis(estimatedStart, true));
			String imagePath = cursor.getString(UpcomingRingQuery.DOG_IMAGE_PATH);
			if (imagePath != null) {
				Resources res = getResources();
				int height = res.getDimensionPixelSize(R.dimen.header_icon_height);
				int width = res.getDimensionPixelSize(R.dimen.header_icon_width);

				BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(imagePath, width, height));
				mBreedImage.setBackgroundDrawable(image);
			} else {
				Log.w(TAG, "Image path was null");
				mBreedImage.setBackgroundResource(R.drawable.dog);
			}
			long currentStart = estimatedStart;
			// Setup the refresh to update upcoming
			while (cursor.moveToNext()) {
				countAhead = cursor.getInt(UpcomingRingQuery.BREED_COUNT_AHEAD);
				judgeMinutesPerDog = Utils.getMaybeNull(cursor, UpcomingRingQuery.RING_JUDGE_TIME, Prefs.getEstimatedJudgingTime(getActivity()));
				upcomingBreedRingStart = cursor.getLong(UpcomingRingQuery.RING_BLOCK_START);
				estimatedStart = Utils.estimateBlockStart(countAhead, upcomingBreedRingStart, judgeMinutesPerDog);
				if (estimatedStart > currentStart) {
					long delay = estimatedStart - System.currentTimeMillis();
					Log.i(TAG, "Closest ring is " + cursor.getString(UpcomingRingQuery.RING_TITLE) + " at " + new Date(estimatedStart).toGMTString());
					delay = (delay > 0) ? delay : 0;
					handler.postDelayed(updateUpcomingRunnable, delay);
					Log.i(TAG, "Updating in " + (delay / 1000) + " seconds.");
					break;
				}
			}
		} else {
			Log.v(TAG, "No upcoming breed rings found");
			mViewUpcomingHeader.setVisibility(View.GONE);
			mViewNoUpcomingHeader.setVisibility(View.VISIBLE);
			mViewNoUpcomingHeaderText.setVisibility(View.VISIBLE);
		}
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Prefs.get(getActivity()).registerOnSharedPreferenceChangeListener(this);
		stickyList.setOnItemLongClickListener(this);
		stickyList.setEmptyView(getActivity().getLayoutInflater().inflate(R.layout.empty_waiting_for_sync, null));
	}

	@Override
	public boolean onCreateActionMode(ActionMode mode, Menu menu) {
		return false;
	}

	@Override
	public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
		return false;
	}

	@Override
	public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
		return false;
	}

	@Override
	public void onDestroyActionMode(ActionMode mode) {
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
		Log.d(TAG, "Preference changed!");
		if (key.equals(Prefs.KEY_JUDGE_TIME)) {
			LoaderManager manager = getLoaderManager();
			manager.restartLoader(RingsQuery._TOKEN, getArguments(), this);
			manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(), this);
		}

	}

	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
		Cursor cursor = (Cursor) mAdapter.getItem(position);
		Bundle b = new Bundle();

		float minutes = Utils.getMaybeNull(cursor, RingsQuery.JUDGE_TIME, Prefs.getEstimatedJudgingTime(getActivity()));
		int ringType = cursor.getInt(RingsQuery.RING_TYPE);
		long dogId = Utils.getMaybeNull(cursor, RingsQuery._ID, -1);
		b.putLong(EditJudgeTimeDialog.BUNDLE_KEY_ID, dogId);
		b.putFloat(EditJudgeTimeDialog.BUNDLE_KEY_TIME, minutes);
		b.putInt(EditJudgeTimeDialog.BUNDLE_KEY_TYPE, ringType);

		EditJudgeTimeDialog d = new EditJudgeTimeDialog();
		d.setArguments(b);
		d.setCallback(this);
		d.show(getFragmentManager(), "dialog");
		return true;
	}

	@Override
	public void onFinishEditDialog(int status, long id, int ringType, float minutes) {
		if (status == EditJudgeTimeDialog.STATUS_SAVE) {
			Map<String, Object> map = new HashMap<String, Object>();
			Log.d(TAG, "Setting minutes to " + minutes);
			map.put(EnteredRings.RING_JUDGE_TIME, minutes);
			switch (ringType) {
			case EnteredRings.TYPE_BREED_RING:
				Log.v(TAG, "updating judge time for breed ring");
				new PersistHelper(getActivity()).updateBreedRing(id, map);
				break;
			case EnteredRings.TYPE_JUNIORS_RING:
				Log.v(TAG, "updating judge time for juniors ring");
				new PersistHelper(getActivity()).updateJuniorsRing(id, map);
				break;
			}
		}
	}

}