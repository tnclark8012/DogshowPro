package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Loader;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.database.ContentObserver;
import android.database.Cursor;
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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import dev.tnclark8012.apps.android.dogshow.BuildConfig;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.RingListAdapter;
import dev.tnclark8012.apps.android.dogshow.adapters.RingListCursorWrapper;
import dev.tnclark8012.apps.android.dogshow.adapters.RingListCursorWrapper.RingListCursorWrapperOptions;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.GroupRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Rings;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.RingsQuery;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.UpcomingRingQuery;
import dev.tnclark8012.apps.android.dogshow.ui.dialog.EditJudgeTimeDialog;
import dev.tnclark8012.apps.android.dogshow.ui.dialog.RingBlockOverviewDialogFragment;
import dev.tnclark8012.apps.android.dogshow.util.Lists;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class MyScheduleFragment extends Fragment implements
		LoaderManager.LoaderCallbacks<Cursor>, ActionMode.Callback,
		OnSharedPreferenceChangeListener, OnItemLongClickListener,
		OnItemClickListener, EditJudgeTimeDialog.Callback {
	private long upcomingBreedRingStart = 0;
	private static final String TAG = MyScheduleFragment.class.getSimpleName();
	private RingListAdapter mAdapter;
	private View mRootView;
	private TextView mViewTitle;
	private TextView mViewTime;
	private TextView mViewRing;
	private ImageView mBreedImage;
	private RelativeLayout mViewUpcomingHeader;
	private RelativeLayout mViewNoUpcomingHeader;
	private TextView mViewNoUpcomingHeaderText;
	private SparseBooleanArray newDayPositions;
	private StickyListHeadersListView stickyList;
	private RingListCursorWrapperOptions mUpcommingRingsOptions;
	private RingListCursorWrapperOptions mEnteredRingsOptions;
	private Handler handler = new Handler();
	private DisplayImageOptions mImageOptions = new DisplayImageOptions.Builder()
			.resetViewBeforeLoading(true).build();

	private Runnable updateUpcomingRunnable = new Runnable() {
		@Override
		public void run() {
			LoaderManager manager = getLoaderManager();
			manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(),
					MyScheduleFragment.this);
			manager.restartLoader(RingsQuery._TOKEN, getArguments(),
					MyScheduleFragment.this);
		}
	};
	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			if (getActivity() == null) {
				return;
			}
			Loader<Cursor> loader = getLoaderManager().getLoader(
					RingsQuery._TOKEN);
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
		getActivity().getActionBar().setTitle(R.string.dashboard_schedule);
		mAdapter = new RingListAdapter(getActivity());
		LoaderManager manager = getLoaderManager();
		manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(), this);// TODO
																				// use
																				// argument
																				// ring
																				// query
																				// token
																				// to
																				// choose
																				// ring
																				// types
																				// to
																				// show
		manager.restartLoader(RingsQuery._TOKEN, getArguments(), this);
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Use URI from arguments
		super.onAttach(activity);
		Prefs.get(getActivity()).registerOnSharedPreferenceChangeListener(this);
		activity.getContentResolver().registerContentObserver(
				Rings.CONTENT_URI, true, mObserver);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
		handler.removeCallbacks(updateUpcomingRunnable);
		Prefs.get(getActivity()).unregisterOnSharedPreferenceChangeListener(
				this);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.fragment_schedule_list,
				container, false);
		mViewTitle = (TextView) mRootView.findViewById(R.id.schedule_breed);
		mViewRing = (TextView) mRootView.findViewById(R.id.schedule_ring);
		mViewTime = (TextView) mRootView.findViewById(R.id.schedule_ring_time);
		mBreedImage = (ImageView) mRootView
				.findViewById(R.id.schedule_breed_image);
		mViewUpcomingHeader = (RelativeLayout) mRootView
				.findViewById(R.id.schedule_upcoming_header);
		mViewNoUpcomingHeader = (RelativeLayout) mRootView
				.findViewById(R.id.schedule_no_upcoming_header);
		mViewNoUpcomingHeaderText = (TextView) mRootView
				.findViewById(R.id.schedule_no_upcoming_header_text);
		stickyList = (StickyListHeadersListView) mRootView
				.findViewById(R.id.ring_list);
		stickyList.setAdapter(mAdapter);
		return mRootView;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		CursorLoader loader = null;
		String selection = EnteredRings.UPCOMING_SELECTION;
		boolean includeGroups = Prefs.showGroupRings(getActivity());
		
		String[] allSelectionArgs = EnteredRings.buildUpcomingSelectionArgs(
                (BuildConfig.DEBUG) ? 0 : Utils.twelveAmToday()
				, includeGroups);
		String[] upcomingArgs = EnteredRings.buildUpcomingSelectionArgs(
                (BuildConfig.DEBUG) ? 0 :Utils.currentTimeUtc()
				,includeGroups);
		switch (id) {
		case UpcomingRingQuery._TOKEN:
			loader = new CursorLoader(getActivity(), EnteredRings.CONTENT_URI,
					UpcomingRingQuery.PROJECTION, selection, upcomingArgs,
					BreedRings.DEFAULT_SORT);
			break;
		case RingsQuery._TOKEN:
			loader = new CursorLoader(getActivity(), EnteredRings.CONTENT_URI,
					RingsQuery.PROJECTION, selection, allSelectionArgs,
					EnteredRings.DEFAULT_SORT);
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
		if (mEnteredRingsOptions == null) {
			mEnteredRingsOptions = new RingListCursorWrapperOptions();
			mEnteredRingsOptions.ringCountColumnIndex = RingsQuery.RING_COUNT;
			mEnteredRingsOptions.bitchCountColumnIndex = RingsQuery.BITCH_COUNT;
			mEnteredRingsOptions.blockStartColumnIndex = RingsQuery.BLOCK_START;
			mEnteredRingsOptions.countAheadColumnIndex = RingsQuery.COUNT_AHEAD;
			mEnteredRingsOptions.dogCountColumnIndex = RingsQuery.DOG_COUNT;
			mEnteredRingsOptions.firstClassColumnIndex = RingsQuery.FIRST_CLASS;
			mEnteredRingsOptions.perAheadJudgeMillsColumnIndex = RingsQuery.JUDGE_TIME;
			mEnteredRingsOptions.ringTypeColumnIndex = RingsQuery.RING_TYPE;
			mEnteredRingsOptions.specialBitchCountColumnIndex = RingsQuery.SPECIAL_BITCH_COUNT;
			mEnteredRingsOptions.specialDogCountColumnIndex = RingsQuery.SPECIAL_DOG_COUNT;
		}
		// Default could change async, so don't cache
		mEnteredRingsOptions.defaultPerDogJudgeMillis = Prefs
				.getEstimatedDogJudgingTime(getActivity());
		mEnteredRingsOptions.defaultPerGroupJudgeMillis = Prefs
				.getEstimatedGroupJudgingTime(getActivity());
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
			// TODO HIGH this should use JUDGE_TIME estimates. I.e. setting
			// judge time to several hours should push a ring to the next day,
			// maybe eliminating a section altogether
			long prevBlockMillis = cursor.getLong(RingsQuery.BLOCK_START);
			String dateStr = DateUtils.formatDateTime(getActivity(),
					prevBlockMillis, DateUtils.FORMAT_SHOW_WEEKDAY
							| DateUtils.FORMAT_SHOW_DATE
							| DateUtils.FORMAT_NO_YEAR);
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
						dateStr = DateUtils.formatDateTime(getActivity(),
								currentBlockMillis,
								DateUtils.FORMAT_SHOW_WEEKDAY
										| DateUtils.FORMAT_SHOW_DATE
										| DateUtils.FORMAT_NO_YEAR);
						sectionHeaders.add(dateStr);
						sectionIndex++;
					}
					sectionIds.add(sectionIndex);
					prevBlockMillis = currentBlockMillis;
				}
			}
			cursor.moveToPosition(-1);
			// TODO use Guava
			mAdapter.setSections(Lists.toArray(sectionIndices, -1),
					sectionHeaders.toArray(new String[sectionHeaders.size()]),
					Lists.toArray(sectionIds, -1));

			mAdapter.changeCursor(new RingListCursorWrapper(cursor,
					mEnteredRingsOptions));
		}

	}

	public void onUpcomingRingQueryComplete(Cursor orignialCursor) {
		if (mUpcommingRingsOptions == null) {
			mUpcommingRingsOptions = new RingListCursorWrapperOptions();
			mUpcommingRingsOptions.ringCountColumnIndex = UpcomingRingQuery.RING_COUNT;
			mUpcommingRingsOptions.bitchCountColumnIndex = UpcomingRingQuery.BITCH_COUNT;
			mUpcommingRingsOptions.blockStartColumnIndex = UpcomingRingQuery.RING_BLOCK_START;
			mUpcommingRingsOptions.countAheadColumnIndex = UpcomingRingQuery.BREED_COUNT_AHEAD;
			mUpcommingRingsOptions.dogCountColumnIndex = UpcomingRingQuery.DOG_COUNT;
			mUpcommingRingsOptions.firstClassColumnIndex = UpcomingRingQuery.FIRST_CLASS;
			mUpcommingRingsOptions.perAheadJudgeMillsColumnIndex = UpcomingRingQuery.RING_JUDGE_TIME;
			mUpcommingRingsOptions.ringTypeColumnIndex = UpcomingRingQuery.RING_TYPE;
			mUpcommingRingsOptions.specialBitchCountColumnIndex = UpcomingRingQuery.SPECIAL_BITCH_COUNT;
			mUpcommingRingsOptions.specialDogCountColumnIndex = UpcomingRingQuery.SPECIAL_DOG_COUNT;
		}
		mUpcommingRingsOptions.defaultPerDogJudgeMillis = Prefs
				.getEstimatedDogJudgingTime(getActivity());
		mUpcommingRingsOptions.defaultPerGroupJudgeMillis = Prefs
				.getEstimatedGroupJudgingTime(getActivity());
		RingListCursorWrapper cursor = new RingListCursorWrapper(
				orignialCursor, mUpcommingRingsOptions);

		if (cursor.moveToFirst()) {
			int type = cursor.getInt(UpcomingRingQuery.RING_TYPE);
			mViewNoUpcomingHeader.setVisibility(View.GONE);
			mViewUpcomingHeader.setVisibility(View.VISIBLE);
			String title = cursor.getString(UpcomingRingQuery.RING_TITLE);
			mViewTitle.setText(title);
			mViewRing.setText(getString(R.string.template_ring_number,
					cursor.getInt(UpcomingRingQuery.RING_NUMBER)));
			mViewRing
					.setVisibility((type == EnteredRings.TYPE_GROUP_RING) ? View.GONE
							: View.VISIBLE);
			upcomingBreedRingStart = cursor
					.getLong(UpcomingRingQuery.RING_BLOCK_START);
			int countAhead = cursor.getInt(UpcomingRingQuery.BREED_COUNT_AHEAD);

			int[] breedCount = null;
			if (type == EnteredRings.TYPE_BREED_RING) {
				breedCount = new int[] {
						cursor.getInt(UpcomingRingQuery.DOG_COUNT),
						cursor.getInt(UpcomingRingQuery.BITCH_COUNT),
						cursor.getInt(UpcomingRingQuery.SPECIAL_DOG_COUNT),
						cursor.getInt(UpcomingRingQuery.SPECIAL_BITCH_COUNT) };
				int firstClass = cursor.getInt(UpcomingRingQuery.FIRST_CLASS);
				int currentColumn = 0;
				// Add the counts of classes before the first entered.
				while (firstClass > 0) {
					countAhead += breedCount[currentColumn];
					currentColumn++;
					firstClass--;
				}
			}

			long judgeMinutesPerDog = Utils.getMaybeNull(cursor,
					UpcomingRingQuery.RING_JUDGE_TIME,
					Prefs.getEstimatedDogJudgingTime(getActivity()));
			long estimatedStart = Utils.estimateBlockStart(countAhead,
					upcomingBreedRingStart, judgeMinutesPerDog);

			mViewTime.setText(UIUtils
					.timeStringFromMillis(estimatedStart, true));
			String imagePath = cursor
					.getString(UpcomingRingQuery.DOG_IMAGE_PATH);
			if (imagePath != null) {
				UIUtils.displayImage(getActivity(), mImageOptions, mBreedImage,
						imagePath);
			} else {
				mBreedImage.setImageResource(R.drawable.dog);
			}
			long currentStart = estimatedStart;
			// Setup the refresh to update upcoming
            if(!BuildConfig.DEBUG) {
                while (cursor.moveToNext()) {
                    countAhead = cursor.getInt(UpcomingRingQuery.BREED_COUNT_AHEAD);
                    judgeMinutesPerDog = Utils.getMaybeNull(cursor,
                            UpcomingRingQuery.RING_JUDGE_TIME,
                            Prefs.getEstimatedDogJudgingTime(getActivity()));
                    upcomingBreedRingStart = cursor
                            .getLong(UpcomingRingQuery.RING_BLOCK_START);
                    estimatedStart = Utils.estimateBlockStart(countAhead,
                            upcomingBreedRingStart, judgeMinutesPerDog);
                    if (estimatedStart > currentStart) {
                        long delay = estimatedStart - Utils.currentTimeUtc();
                        Log.i(TAG,
                                "Closest ring is "
                                        + cursor.getString(UpcomingRingQuery.RING_TITLE)
                                        + " at "
                                        + UIUtils
                                        .timeStringFromMillis(estimatedStart, true));
                        delay = (delay > 0) ? delay : 0;
                        handler.postDelayed(updateUpcomingRunnable, delay);
                        Log.i(TAG, "Updating in " + (delay / 1000) + " seconds.");
//					Toast.makeText(getActivity(), "Update in " + (delay/1000), Toast.LENGTH_SHORT).show();;
                        break;
                    }
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
		stickyList.setOnItemLongClickListener(this);
		stickyList.setOnItemClickListener(this);
		stickyList.setEmptyView(getActivity().getLayoutInflater().inflate(
				R.layout.empty_waiting_for_sync, null));
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
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
			String key) {
		Log.d(TAG, "Preference changed!");
		if (key.equals(Prefs.KEY_JUDGE_TIME)
				|| key.equals(Prefs.KEY_SHOW_GROUPS)) {
			LoaderManager manager = getLoaderManager();
			manager.restartLoader(RingsQuery._TOKEN, getArguments(), this);
			manager.restartLoader(UpcomingRingQuery._TOKEN, getArguments(),
					this);
		}

	}

	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view,
			int position, long id) {
		Cursor cursor = (Cursor) mAdapter.getItem(position);
		Bundle b = new Bundle();
		float minutes = Utils.getMaybeNull(cursor, RingsQuery.JUDGE_TIME,
				Prefs.getEstimatedDogJudgingTime(getActivity())) / 60000f;
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
	public void onFinishEditDialog(int status, long id, int ringType,
			float minutes) {
		if (status == EditJudgeTimeDialog.STATUS_SAVE) {
			Map<String, Object> map = new HashMap<String, Object>();
			Log.d(TAG, "Setting minutes to " + minutes);
			long value = (long) (minutes * 60000);
			map.put(EnteredRings.RING_JUDGE_TIME, (value != Prefs
					.getEstimatedDogJudgingTime(getActivity())) ? value : null);// if
																				// set
																				// to
																				// default,
																				// it's
																				// no
																				// longer
																				// "customized"
			switch (ringType) {
			case EnteredRings.TYPE_BREED_RING:
				Log.v(TAG, "updating judge time for breed ring");
				new PersistHelper(getActivity()).updateEntity(
						BreedRings.CONTENT_URI, id, map);
				break;
			case EnteredRings.TYPE_JUNIORS_RING:
				Log.v(TAG, "updating judge time for juniors ring");
				new PersistHelper(getActivity()).updateEntity(
						JuniorsRings.CONTENT_URI, id, map);
				break;
			case EnteredRings.TYPE_GROUP_RING:
				Log.v(TAG, "updating judge time for group ring");
				new PersistHelper(getActivity()).updateEntity(
						GroupRings.CONTENT_URI, id, map);
				break;
			}
		}
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position,
			long id) {
		Cursor cursor = (Cursor) mAdapter.getItem(position);
		RingBlockOverviewDialogFragment d = RingBlockOverviewDialogFragment
				.newInstance(cursor.getInt(RingsQuery.RING_NUMBER),
						cursor.getLong(RingsQuery.BLOCK_START),
						cursor.getInt(RingsQuery.COUNT_AHEAD));
		d.show(getFragmentManager(), "overview_dialog");
	}
}