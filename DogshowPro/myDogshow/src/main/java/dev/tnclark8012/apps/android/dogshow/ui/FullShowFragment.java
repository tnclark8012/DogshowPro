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

package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Activity;
import android.app.ListFragment;
import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
/**
 * Schedule Similar to {@link MyScheduleFragment} but does not remove past rings
 * @author Taylor
 *
 */
public class FullShowFragment extends ListFragment implements
		LoaderManager.LoaderCallbacks<Cursor>, ActionMode.Callback {
	private final long upcomingAllowedWindow = 1 * 60 * 1000;
	private long upcomingBreedRingStart = 0;
	private static final String TAG = FullShowFragment.class.getSimpleName();
	private CursorAdapter mAdapter;
	private int mRingQueryToken;
	private View mRootView;
	private TextView mViewBreed;
	private TextView mViewTime;
	private TextView mViewRing;
	private ImageView mViewBreedImage;
	private RelativeLayout mViewUpcomingHeader;
	private RelativeLayout mViewNoUpcomingHeader;
	private Handler handler = new Handler();
	
	private Runnable updateUpcomingRunnable = new Runnable() {
		   @Override
		   public void run() {
			   getLoaderManager().restartLoader(UpcomingBreedRingQuery._TOKEN, getArguments(), FullShowFragment.this);
		   }
		};
	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			if (getActivity() == null) {
				return;
			}

			Loader<Cursor> loader = getLoaderManager().getLoader(
					mRingQueryToken);
			if (loader != null) {
				loader.forceLoad();
			}
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mRingQueryToken = BreedRingsQuery._TOKEN;
		mAdapter = new RingListAdapter(getActivity());
		setListAdapter(mAdapter);
		LoaderManager manager = getLoaderManager();
		manager.restartLoader(BreedRingsQuery._TOKEN, getArguments(), this);
		manager.restartLoader(UpcomingBreedRingQuery._TOKEN, getArguments(),
				this);
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Use URI from arguments
		super.onAttach(activity);
		activity.getContentResolver().registerContentObserver(
				DogshowContract.BreedRings.buildEnteredRingsUri(), true,
				mObserver);

	}

	@Override
	public void onDetach() {
		super.onDetach();
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
		handler.removeCallbacks(updateUpcomingRunnable);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.fragment_schedule_list,
				container, false);
		mViewBreed = (TextView) mRootView.findViewById(R.id.schedule_breed);
		mViewRing = (TextView) mRootView.findViewById(R.id.schedule_ring);
		mViewTime = (TextView) mRootView.findViewById(R.id.schedule_ring_time);
		mViewBreedImage = (ImageView) mRootView
				.findViewById(R.id.schedule_breed_image);
		mViewUpcomingHeader = (RelativeLayout)mRootView.findViewById(R.id.schedule_upcoming_header);
		mViewNoUpcomingHeader = (RelativeLayout)mRootView.findViewById(R.id.schedule_no_upcoming_header);

		return mRootView;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		CursorLoader loader = null;

		switch (id) {
		case BreedRingsQuery._TOKEN:
			loader = new CursorLoader(getActivity(),
					BreedRings.buildEnteredRingsUri(),
					BreedRingsQuery.PROJECTION, null, null,
					DogshowContract.BreedRings.DEFAULT_SORT);
			break;
		case UpcomingBreedRingQuery._TOKEN:
			String selection = BreedRings.UPCOMING_SELECTION;
			 String[] selectionArgs = BreedRings.buildUpcomingSelectionArgs(System.currentTimeMillis());
			loader = new CursorLoader(getActivity(),
					BreedRings.buildEnteredRingsUri(),
					UpcomingBreedRingQuery.PROJECTION, selection,
					selectionArgs, DogshowContract.BreedRings.DEFAULT_SORT);
			break;
		}
		return loader;
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
		if (getActivity() == null) {
			return;
		}

		int token = loader.getId();
		if (token == BreedRingsQuery._TOKEN) {
			mAdapter.changeCursor(cursor);
			Bundle arguments = getArguments();

			if (arguments != null && arguments.containsKey("_uri")) {
				String uri = arguments.get("_uri").toString();
			}
		} else if (token == UpcomingBreedRingQuery._TOKEN) {
			onBreedRingUpommingQueryComplete(cursor);
		} else {
			Log.d(TAG, "Query complete, Not Actionable: " + token);
			cursor.close();
		}
	}

	public void onBreedRingUpommingQueryComplete(Cursor cursor) {
		if (cursor.moveToFirst()) {
			mViewNoUpcomingHeader.setVisibility(View.GONE);
			mViewUpcomingHeader.setVisibility(View.VISIBLE);
			
			mViewBreed.setText(cursor
					.getString(UpcomingBreedRingQuery.RING_BREED));
			mViewRing.setText(getString(R.string.template_ring_number,
					cursor.getInt(UpcomingBreedRingQuery.RING_NUMBER)));
			upcomingBreedRingStart = cursor.getLong(UpcomingBreedRingQuery.RING_BREED_START);
			mViewTime.setText(UIUtils.timeStringFromMillis(upcomingBreedRingStart, true));
			long delay = upcomingBreedRingStart + upcomingAllowedWindow - System.currentTimeMillis();
			delay = (delay > 0) ? delay : 0;
			handler.postDelayed(updateUpcomingRunnable, delay);
			String imagePath = cursor
					.getString(UpcomingBreedRingQuery.DOG_IMAGE_PATH);
			if (imagePath != null) {
				Resources res = getResources();
				int height = res
						.getDimensionPixelSize(R.dimen.header_icon_height);
				int width = res
						.getDimensionPixelSize(R.dimen.header_icon_width);

				BitmapDrawable image = new BitmapDrawable(res,
						UIUtils.loadBitmap(imagePath, width, height));
				mViewBreedImage.setBackgroundDrawable(image);
			} else {
				Log.w(TAG, "Image path was null");
				mViewBreedImage.setBackgroundResource(R.drawable.dog);

			}
		} else {
			Log.w(TAG, "No upcoming breed rings found");
			mViewUpcomingHeader.setVisibility(View.GONE);
			mViewNoUpcomingHeader.setVisibility(View.VISIBLE);
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
			Calendar cal = GregorianCalendar.getInstance();
			String format = "h:mm";
			String ampmFormat = "a";

			((TextView) view.findViewById(R.id.list_item_ring_subtitle))
					.setText(cursor.getString(BreedRingsQuery.DOG_CALL_NAME));
			((TextView) view.findViewById(R.id.list_item_ring_title))
					.setText(cursor.getString(BreedRingsQuery.RING_BREED));
			((TextView) view.findViewById(R.id.list_item_ring_number))
					.setText(getString(R.string.template_ring_number, cursor.getInt(BreedRingsQuery.RING_NUMBER)));
			long timeMillis = cursor.getLong(BreedRingsQuery.RING_START);
			((TextView) view.findViewById(R.id.list_item_ring_start))
					.setText(String.format("(%s)",
							UIUtils.timeStringFromMillis(timeMillis, true)));

			timeMillis = cursor.getLong(BreedRingsQuery.RING_BREED_START);
			String time = String.format("%s\n%s",
					UIUtils.timeStringFromMillis(timeMillis, false),
					UIUtils.timeAmPmFromMillis(timeMillis));

			((TextView) view.findViewById(R.id.list_item_ring_time))
					.setText(time);
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getActivity().getLayoutInflater().inflate(
					R.layout.list_item_ring, parent, false);
		}
	}

	private interface BreedRingsQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { DogshowContract.BreedRings._ID,
				DogshowContract.BreedRings.RING_BREED,
				DogshowContract.BreedRings.RING_BLOCK_START,
				DogshowContract.BreedRings.RING_JUDGE,
				DogshowContract.BreedRings.RING_NUMBER,
				DogshowContract.BreedRings.RING_BLOCK_START,
				DogshowContract.Dogs.DOG_CALL_NAME };
		int _ID = 0;
		int RING_BREED = 1;
		int RING_BREED_START = 2;
		int RING_JUDGE = 3;
		int RING_NUMBER = 4;
		int RING_START = 5;
		int DOG_CALL_NAME = 6;
	}

	private interface UpcomingBreedRingQuery {
		int _TOKEN = 0x2;

		String[] PROJECTION = { DogshowContract.BreedRings._ID,
				DogshowContract.BreedRings.RING_BREED,
				DogshowContract.BreedRings.RING_BLOCK_START,
				DogshowContract.BreedRings.RING_NUMBER,
				DogshowContract.Dogs.DOG_IMAGE_PATH };
		int _ID = 0;
		int RING_BREED = 1;
		int RING_BREED_START = 2;
		int RING_NUMBER = 3;
		int DOG_IMAGE_PATH = 4;
	}

	@Override
	public boolean onCreateActionMode(ActionMode mode,
			Menu menu) {
		return false;
	}

	@Override
	public boolean onPrepareActionMode(ActionMode mode,
			Menu menu) {
		return false;
	}

	@Override
	public boolean onActionItemClicked(ActionMode mode,
			MenuItem item) {
		return false;
	}

	@Override
	public void onDestroyActionMode(ActionMode mode) {
	}
}
