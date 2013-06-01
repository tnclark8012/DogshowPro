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

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.ActionMode;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.preferences.Prefs;
import dev.tnclark8012.dogshow.apps.android.provider.PersistHelper;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.dogshow.apps.android.ui.dialog.EditJudgeTimeDialog;
import dev.tnclark8012.dogshow.apps.android.util.DebugUtils;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;
import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;

public class MyScheduleFragment extends SherlockListFragment implements LoaderManager.LoaderCallbacks<Cursor>, ActionMode.Callback, OnSharedPreferenceChangeListener, OnItemLongClickListener, EditJudgeTimeDialog.Callback {
	private static float defaultPerDogJudgingMinutes = 2;
	private final long upcomingAllowedWindow = 1 * 60 * 1000;
	private long upcomingBreedRingStart = 0;
	private static final String TAG = MyScheduleFragment.class.getSimpleName();
	private CursorAdapter mAdapter;
	private View mRootView;
	private TextView mViewTitle;
	private TextView mViewTime;
	private TextView mViewRing;
	private RelativeLayout mBreedImage;
	private RelativeLayout mViewUpcomingHeader;
	private RelativeLayout mViewNoUpcomingHeader;
	private TextView mViewNoUpcomingHeaderText;
	private SparseBooleanArray newDayPositions;

	private Handler handler = new Handler();

	private Runnable updateUpcomingRunnable = new Runnable() {
		@Override
		public void run() {
			LoaderManager manager = getLoaderManager();
			manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(), MyScheduleFragment.this);
			manager.restartLoader(AllRingsQuery._TOKEN, getArguments(), MyScheduleFragment.this);
		}
	};
	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			Toast.makeText(getActivity(), "onChange", Toast.LENGTH_SHORT).show();
			if (getActivity() == null) {
				return;
			}

			Loader<Cursor> loader = getLoaderManager().getLoader(AllRingsQuery._TOKEN);
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
		defaultPerDogJudgingMinutes = Prefs.getEstimatedJudgingTime(getActivity());
		mAdapter = new RingListAdapter(getActivity());
		setListAdapter(mAdapter);
		LoaderManager manager = getLoaderManager();
		 manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(), this);//TODO use argument ring query token to choose ring types to show
		 manager.restartLoader(AllRingsQuery._TOKEN, getArguments(), this);
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
		return mRootView;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		CursorLoader loader = null;
		String selection = EnteredRings.UPCOMING_SELECTION;
		String[] selectionArgs = EnteredRings.buildUpcomingSelectionArgs(0);
		switch (id) {
		case BreedRingsQuery._TOKEN:
			loader = new CursorLoader(getActivity(), BreedRings.buildEnteredRingsUri(), BreedRingsQuery.PROJECTION, selection, selectionArgs, BreedRings.DEFAULT_SORT);
			break;
		case UpcomingRingQuery._TOKEN:
			loader = new CursorLoader(getActivity(), EnteredRings.CONTENT_URI, UpcomingRingQuery.PROJECTION, selection, selectionArgs, BreedRings.DEFAULT_SORT);
			break;
		case AllRingsQuery._TOKEN:
			loader = new CursorLoader(getActivity(), EnteredRings.CONTENT_URI, AllRingsQuery.PROJECTION, null, null, EnteredRings.DEFAULT_SORT);
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
		if (token == BreedRingsQuery._TOKEN) {
			Log.v(TAG, "Cursor contains " + cursor.getCount() + " breed rings");
			onBreedRingsQueryComplete(cursor);
		} else if (token == UpcomingRingQuery._TOKEN) {
			onUpcomingRingQueryComplete(cursor);
		} else if (token == AllRingsQuery._TOKEN) {
			onAllRingsQueryComplete(cursor);
		} else {
			Log.d(TAG, "Query complete, Not Actionable: " + token);
			cursor.close();
		}
	}

	public void onAllRingsQueryComplete(Cursor cursor) {
		int cursorSize = cursor.getCount();
		ArrayList<Integer> newPositions = new ArrayList<Integer>();
		if (cursorSize > 0) {
			cursor.moveToFirst();
			int position = 0;
			newDayPositions = new SparseBooleanArray(cursorSize);
			newDayPositions.put(position, true);
			newPositions.add(position);
			long prevBlockMillis = cursor.getLong(AllRingsQuery.BLOCK_START);
			long currentBlockMillis = 0;
			if (cursorSize > 1) {
				while (cursor.moveToNext()) {
					position++;
					currentBlockMillis = cursor.getLong(AllRingsQuery.BLOCK_START);
					if (!Utils.isSameDay(prevBlockMillis, currentBlockMillis)) {
						newDayPositions.put(position, true);
						newPositions.add(position);
					}
					prevBlockMillis = currentBlockMillis;
				}
			}
			cursor.moveToPosition(-1);
			mAdapter.changeCursor(cursor);
		}
	}

	public void onBreedRingsQueryComplete(Cursor cursor) {
		int cursorSize = cursor.getCount();
		ArrayList<Integer> newPositions = new ArrayList<Integer>();
		if (cursorSize > 0) {
			cursor.moveToFirst();
			int position = 0;
			newDayPositions = new SparseBooleanArray(cursorSize);
			newDayPositions.put(position, true);
			newPositions.add(position);
			long prevBlockMillis = cursor.getLong(BreedRingsQuery.RING_BLOCK_START);
			long currentBlockMillis = 0;
			if (cursorSize > 1) {
				while (cursor.moveToNext()) {
					position++;
					currentBlockMillis = cursor.getLong(BreedRingsQuery.RING_BLOCK_START);
					if (!Utils.isSameDay(prevBlockMillis, currentBlockMillis)) {
						newDayPositions.put(position, true);
						newPositions.add(position);
					}
					prevBlockMillis = currentBlockMillis;
				}
			}
			DebugUtils.logArray("DebugUtils", newPositions.toArray());
			cursor.moveToPosition(-1);
			mAdapter.changeCursor(cursor);
		}
	}

	public void onUpcomingRingQueryComplete(Cursor cursor) {
		if (cursor.moveToFirst()) {
			mViewNoUpcomingHeader.setVisibility(View.GONE);
			mViewUpcomingHeader.setVisibility(View.VISIBLE);
			String title = cursor.getString(UpcomingRingQuery.RING_TITLE);

			switch(cursor.getInt(UpcomingRingQuery.RING_TYPE))
			{
			case EnteredRings.TYPE_BREED_RING:
				title = Breeds.parse(title).getPlural();
				break;
			case EnteredRings.TYPE_JUNIORS_RING:
				title = JuniorClass.parse(title).getPrimaryName();
				break;
			}
			mViewTitle.setText(title);
			mViewRing.setText(getString(R.string.template_ring_number, cursor.getInt(UpcomingRingQuery.RING_NUMBER)));
			upcomingBreedRingStart = cursor.getLong(UpcomingRingQuery.RING_BLOCK_START);
			int countAhead = cursor.getInt(UpcomingRingQuery.BREED_COUNT_AHEAD);
			float judgeMinutesPerDog = Utils.getMaybeNull(cursor, UpcomingRingQuery.RING_JUDGE_TIME, defaultPerDogJudgingMinutes);
			long estimatedStart = Utils.estimateBlockStart(countAhead, upcomingBreedRingStart, judgeMinutesPerDog);

			mViewTime.setText(UIUtils.timeStringFromMillis(estimatedStart, true));
			long delay = estimatedStart + upcomingAllowedWindow - System.currentTimeMillis();
			Log.i(TAG, "Closest ring is " + new Date(estimatedStart));
			delay = (delay > 0) ? delay : 0;
			if (Utils.isSameDay(estimatedStart + upcomingAllowedWindow, System.currentTimeMillis()))// FIXME
				handler.postDelayed(updateUpcomingRunnable, delay);
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

	private class RingListAdapter extends CursorAdapter {
		public RingListAdapter(Activity activity) {
			super(activity, null, false);
		}

		@Override
		public void bindView(View view, Context context, Cursor cursor) {

			int countAhead = cursor.getInt(AllRingsQuery.COUNT_AHEAD);
			long blockTimeMillis = cursor.getLong(AllRingsQuery.BLOCK_START);
			float judgeMinutesPerDog = Utils.getMaybeNull(cursor, AllRingsQuery.JUDGE_TIME, defaultPerDogJudgingMinutes);
			long estMillis = Utils.estimateBlockStart(countAhead, blockTimeMillis, judgeMinutesPerDog);
			int cursorPosition = cursor.getPosition();
			Log.d(TAG, "position " + cursorPosition + " is type: " + cursor.getInt(AllRingsQuery.RING_TYPE));
			if (newDayPositions.get(cursorPosition)) {
				ViewStub stub = (ViewStub) view.findViewById(R.id.list_item_ring_header_stub);
				RelativeLayout header = null;
				if (stub != null) {
					header = (RelativeLayout) stub.inflate();
				} else {
					header = (RelativeLayout) view.findViewById(R.id.list_item_ring_header);
				}
				((TextView) header.findViewById(R.id.list_item_ring_header_date)).setText(DateUtils.formatDateTime(mContext, blockTimeMillis, DateUtils.FORMAT_SHOW_WEEKDAY | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NO_YEAR) + "");
				header.setVisibility(View.VISIBLE);
			} else {
				RelativeLayout header = (RelativeLayout) view.findViewById(R.id.list_item_ring_header);
				if (header != null) {
					header.setVisibility(View.GONE);
				}
			}
			((TextView) view.findViewById(R.id.list_item_ring_subtitle)).setText(cursor.getString(AllRingsQuery.SUBTITLE));
			String title = cursor.getString(AllRingsQuery.TITLE);
			if (cursor.getInt(AllRingsQuery.RING_TYPE) == EnteredRings.TYPE_BREED_RING) {
				title = Breeds.parse(title).getPrimaryName();
			} else {
				title = JuniorClass.parse(title).getPrimaryName();
			}
			((TextView) view.findViewById(R.id.list_item_ring_title)).setText(title);
			((TextView) view.findViewById(R.id.list_item_ring_number)).setText(getString(R.string.template_ring_number, cursor.getInt(AllRingsQuery.RING_NUMBER)));

			((TextView) view.findViewById(R.id.list_item_ring_start)).setText(String.format("(%s)", UIUtils.timeStringFromMillis(blockTimeMillis, true)));

			String time = String.format("%s\n%s", UIUtils.timeStringFromMillis(estMillis, false), UIUtils.timeAmPmFromMillis(estMillis));

			((TextView) view.findViewById(R.id.list_item_ring_time)).setText(time);
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getActivity().getLayoutInflater().inflate(R.layout.list_item_ring_with_header, parent, false);
		}
	}

	/**
	 * TODO Why can't this be the same query as {@link UpcomingRingQuery}? How much would we save?
	 * 
	 * @author Taylor
	 * 
	 */
	private interface BreedRingsQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { BreedRings._ID, BreedRings.RING_BREED, BreedRings.RING_BLOCK_START, BreedRings.RING_JUDGE_TIME, BreedRings.RING_NUMBER, Dogs.ENTERED_DOGS_NAMES, BreedRings.RING_COUNT_AHEAD };
		int _ID = 0;
		int RING_BREED = 1;
		int RING_BLOCK_START = 2;
		int RING_JUDGE_TIME = 3;
		int RING_NUMBER = 4;
		int ENTERED_CALL_NAMES = 5;
		int BREED_COUNT_AHEAD = 6;
	}

	private interface AllRingsQuery {
		int _TOKEN = 0x3;
		String[] PROJECTION = { EnteredRings._ID, EnteredRings.RING_BLOCK_START, EnteredRings.RING_COUNT_AHEAD, EnteredRings.ENTERED_RINGS_IMAGE_PATH, EnteredRings.RING_NUMBER, EnteredRings.ENTERED_RINGS_SUBTITLE, EnteredRings.ENTERED_RINGS_TITLE, EnteredRings.RING_JUDGE_TIME, EnteredRings.ENTERED_RINGS_TYPE };
		int _ID = 0;
		int BLOCK_START = 1;
		int COUNT_AHEAD = 2;
		int IMAGE_PATH = 3;
		int RING_NUMBER = 4;
		int SUBTITLE = 5;
		int TITLE = 6;
		int JUDGE_TIME = 7;
		int RING_TYPE = 8;
	}

	private interface UpcomingRingQuery {
		int _TOKEN = 0x2;

		String[] PROJECTION = { EnteredRings._ID, EnteredRings.ENTERED_RINGS_TITLE, EnteredRings.RING_BLOCK_START, EnteredRings.RING_NUMBER, EnteredRings.ENTERED_RINGS_IMAGE_PATH, EnteredRings.RING_COUNT_AHEAD, EnteredRings.RING_JUDGE_TIME, EnteredRings.ENTERED_RINGS_TYPE };
		int _ID = 0;
		int RING_TITLE = 1;
		int RING_BLOCK_START = 2;
		int RING_NUMBER = 3;
		int DOG_IMAGE_PATH = 4;
		int BREED_COUNT_AHEAD = 5;
		int RING_JUDGE_TIME = 6;
		int RING_TYPE = 7;

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Prefs.get(getActivity()).registerOnSharedPreferenceChangeListener(this);
		getListView().setOnItemLongClickListener(this);
	}

	@Override
	public boolean onCreateActionMode(ActionMode mode, com.actionbarsherlock.view.Menu menu) {
		return false;
	}

	@Override
	public boolean onPrepareActionMode(ActionMode mode, com.actionbarsherlock.view.Menu menu) {
		return false;
	}

	@Override
	public boolean onActionItemClicked(ActionMode mode, com.actionbarsherlock.view.MenuItem item) {
		return false;
	}

	@Override
	public void onDestroyActionMode(ActionMode mode) {
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
		Log.d(TAG, "Preference changed!");
		if (key.equals(Prefs.KEY_JUDGE_TIME)) {
			defaultPerDogJudgingMinutes = Prefs.getEstimatedJudgingTime(getActivity());
			LoaderManager manager = getLoaderManager();
			manager.restartLoader(AllRingsQuery._TOKEN, getArguments(), this);
			manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(), this);
		}

	}

	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
		Cursor cursor = (Cursor) mAdapter.getItem(position);
		Bundle b = new Bundle();
		float minutes = Utils.getMaybeNull(cursor, AllRingsQuery.JUDGE_TIME, defaultPerDogJudgingMinutes);
		int ringType = cursor.getInt(AllRingsQuery.RING_TYPE);
		long dogId = Utils.getMaybeNull(cursor, AllRingsQuery._ID, -1);
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