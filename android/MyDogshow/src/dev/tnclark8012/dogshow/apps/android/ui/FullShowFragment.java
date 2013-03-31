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

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.ActionMode;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
/**
 * Schedule Similar to {@link MyScheduleFragment} but does not remove past rings
 * @author Taylor
 *
 */
public class FullShowFragment extends SherlockListFragment implements
		LoaderManager.LoaderCallbacks<Cursor>, ActionMode.Callback {
	private final long upcomingAllowedWindow = 1 * 60 * 1000;
	private long upcomingBreedRingStart = 0;
	private static final String TAG = FullShowFragment.class.getSimpleName();
	private Uri mRingsUri;
	private CursorAdapter mAdapter;
	private int mRingQueryToken;
	private View mRootView;
	private TextView mViewBreed;
	private TextView mViewTime;
	private TextView mViewRing;
	private RelativeLayout mViewBreedImage;
	private RelativeLayout mViewUpcomingHeader;
	private RelativeLayout mViewNoUpcomingHeader;
	private Uri mUpcommingUri;
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
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		final Intent intent = BaseActivity
				.fragmentArgumentsToIntent(getArguments());
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
		mViewBreedImage = (RelativeLayout) mRootView
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
			// TODO swap String [] selectionArgs =
			 String[] selectionArgs = BreedRings.buildUpcomingSelectionArgs(System.currentTimeMillis());
//			String[] selectionArgs = BreedRings.buildUpcomingSelectionArgs(0);
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
				mViewBreedImage.setBackgroundDrawable(image);// setBackgroundDrawable(Drawable.createFromPath(imagePath));

				// mViewImage.setBackgroundDrawable(Drawable.createFromPath(mImagePath));
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
		// TODO Auto-generated method stub

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

			((TextView) view.findViewById(R.id.list_item_ring_names))
					.setText(cursor.getString(BreedRingsQuery.DOG_CALL_NAME));
			((TextView) view.findViewById(R.id.list_item_ring_breed))
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
				DogshowContract.BreedRings.RING_BREED_START,
				DogshowContract.BreedRings.RING_JUDGE,
				DogshowContract.BreedRings.RING_NUMBER,
				DogshowContract.BreedRings.RING_START,
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
				DogshowContract.BreedRings.RING_BREED_START,
				DogshowContract.BreedRings.RING_NUMBER,
				DogshowContract.Dogs.DOG_IMAGE_PATH };
		int _ID = 0;
		int RING_BREED = 1;
		int RING_BREED_START = 2;
		int RING_NUMBER = 3;
		int DOG_IMAGE_PATH = 4;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		// getListView().setAdapter(new ArrayAdapter<String>(getActivity(), 0));
	}

	@Override
	public boolean onCreateActionMode(ActionMode mode,
			com.actionbarsherlock.view.Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onPrepareActionMode(ActionMode mode,
			com.actionbarsherlock.view.Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onActionItemClicked(ActionMode mode,
			com.actionbarsherlock.view.MenuItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onDestroyActionMode(ActionMode mode) {
		// TODO Auto-generated method stub

	}

}