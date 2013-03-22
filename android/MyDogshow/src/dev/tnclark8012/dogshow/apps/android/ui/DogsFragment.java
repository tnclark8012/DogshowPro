package dev.tnclark8012.dogshow.apps.android.ui;

import java.util.LinkedHashSet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.BaseColumns;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;

/*
 private interface SessionsQuery {
 int _TOKEN = 0x1;

 String[] PROJECTION = {
 ScheduleContract.Blocks.BLOCK_START,
 ScheduleContract.Blocks.BLOCK_END,
 ScheduleContract.Sessions.SESSION_LEVEL,
 ScheduleContract.Sessions.SESSION_TITLE,
 ScheduleContract.Sessions.SESSION_ABSTRACT,
 ScheduleContract.Sessions.SESSION_REQUIREMENTS,
 ScheduleContract.Sessions.SESSION_STARRED,
 ScheduleContract.Sessions.SESSION_HASHTAGS,
 ScheduleContract.Sessions.SESSION_URL,
 ScheduleContract.Sessions.SESSION_YOUTUBE_URL,
 ScheduleContract.Sessions.SESSION_PDF_URL,
 ScheduleContract.Sessions.SESSION_NOTES_URL,
 ScheduleContract.Sessions.SESSION_LIVESTREAM_URL,
 ScheduleContract.Sessions.ROOM_ID,
 ScheduleContract.Rooms.ROOM_NAME,
 };

 int BLOCK_START = 0;
 int BLOCK_END = 1;
 int LEVEL = 2;
 int TITLE = 3;
 int ABSTRACT = 4;
 int REQUIREMENTS = 5;
 int STARRED = 6;
 int HASHTAGS = 7;
 int URL = 8;
 int YOUTUBE_URL = 9;
 int PDF_URL = 10;
 int NOTES_URL = 11;
 int LIVESTREAM_URL = 12;
 int ROOM_ID = 13;
 int ROOM_NAME = 14;

 int[] LINKS_INDICES = {
 URL,
 YOUTUBE_URL,
 PDF_URL,
 NOTES_URL,
 };

 int[] LINKS_TITLES = {
 R.string.session_link_main,
 R.string.session_link_youtube,
 R.string.session_link_pdf,
 R.string.session_link_notes,
 };
 }

 */
public class DogsFragment extends SherlockListFragment implements
		LoaderManager.LoaderCallbacks<Cursor> {

	private static final String TAG = DogsFragment.class.getSimpleName();
	private LinkedHashSet<Integer> mSelectedSessionPositions = new LinkedHashSet<Integer>();
	private Handler mHandler = new Handler();
	private int mDogQueryToken;
	private String mSelectedDogId;
	private CursorAdapter mAdapter;

	public interface Callbacks {
		/**
		 * Return true to select (activate) the dog in the list, false
		 * otherwise.
		 */
		public boolean onDogSelected(String dogId);
	}

	private static Callbacks sDummyCallbacks = new Callbacks() {
		@Override
		public boolean onDogSelected(String sessionId) {
			return true;
		}
	};

	private Callbacks mCallbacks = sDummyCallbacks;

	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			if (getActivity() == null) {
				return;
			}

			Loader<Cursor> loader = getLoaderManager()
					.getLoader(mDogQueryToken);
			if (loader != null) {
				loader.forceLoad();
			}
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
		if (savedInstanceState != null) {
			// mSelectedSessionId =
			// savedInstanceState.getString(STATE_SELECTED_ID);
		}

		reloadFromArguments(getArguments());
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.list_dogs, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == R.id.menu_list_dogs_add) {
			Log.v(TAG, "Add dog [not implemented]");
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	protected void reloadFromArguments(Bundle arguments) {
		// Teardown from previous arguments
		setListAdapter(null);

		// Load new arguments
		final Intent intent = BaseActivity.fragmentArgumentsToIntent(arguments);
		final Uri dogsUri = intent.getData();

		if (dogsUri == null) {
			// return;
		}

		mAdapter = new DogListAdapter(getActivity());
		mDogQueryToken = DogsQuery._TOKEN;

		setListAdapter(mAdapter);

		// Force start background query to load sessions
		getLoaderManager().restartLoader(mDogQueryToken, arguments, this);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException(
					"Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
		activity.getContentResolver().registerContentObserver(
				DogshowContract.Dogs.CONTENT_URI, true, mObserver);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	private interface DogsQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { BaseColumns._ID, DogshowContract.Dogs.DOG_ID,
				DogshowContract.Dogs.DOG_CALL_NAME,
				DogshowContract.Dogs.DOG_BREED,
				DogshowContract.Dogs.DOG_IMAGE_PATH };

		int _ID = 0;
		int DOG_ID = 1;
		int DOG_CALL_NAME = 2;
		int DOG_BREED = 3;
		int DOG_IMAGE_PATH = 4;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		final Intent intent = BaseActivity.fragmentArgumentsToIntent(data);
		final Uri dogsUri = intent.getData();
		Loader<Cursor> loader = null;
		if (id == DogsQuery._TOKEN) {
			loader = new CursorLoader(getActivity(), dogsUri,
					DogsQuery.PROJECTION, null, null,
					DogshowContract.Dogs.DEFAULT_SORT);
		} else {
			Log.w(TAG, "Couldn't create loader");
		}
		return loader;
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
		if (getActivity() == null) {
			return;
		}

		int token = loader.getId();
		if (token == DogsQuery._TOKEN) {
			mAdapter.changeCursor(cursor);
			Bundle arguments = getArguments();

			if (arguments != null && arguments.containsKey("_uri")) {
				String uri = arguments.get("_uri").toString();
			}
		} else {
			Log.d(TAG, "Query complete, Not Actionable: " + token);
			cursor.close();
		}
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
	}

	// @Override
	// public boolean onActionItemClicked(ActionMode arg0, MenuItem arg1) {
	// // TODO Auto-generated method stub
	// return false;
	// }
	//
	// @Override
	// public boolean onCreateActionMode(ActionMode arg0, Menu arg1) {
	// // TODO Auto-generated method stub
	// return false;
	// }
	//
	// @Override
	// public void onDestroyActionMode(ActionMode arg0) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public boolean onPrepareActionMode(ActionMode arg0, Menu arg1) {
	// // TODO Auto-generated method stub
	// return false;
	// }
	//
	// @Override
	// public void onItemCheckedStateChanged(ActionMode arg0, int arg1, long
	// arg2,
	// boolean arg3) {
	// // TODO Auto-generated method stub
	// }

	/** {@inheritDoc} */
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		final Cursor cursor = (Cursor) mAdapter.getItem(position);
		String dogId = cursor.getString(cursor
				.getColumnIndex(DogshowContract.Dogs.DOG_ID));
		if (mCallbacks.onDogSelected(dogId)) {
			mSelectedDogId = dogId;
			mAdapter.notifyDataSetChanged();
		}
	}

	private class DogListAdapter extends CursorAdapter {
		public DogListAdapter(Activity activity) {
			super(activity, null, false);
		}

		@Override
		public void bindView(View view, Context context, Cursor cursor) {
			((TextView) view.findViewById(R.id.list_item_dog_name))
					.setText(cursor.getString(DogsQuery.DOG_CALL_NAME));
			((TextView) view.findViewById(R.id.list_item_dog_breed))
					.setText(cursor.getString(DogsQuery.DOG_BREED));
			String imagePath = cursor.getString(DogsQuery.DOG_IMAGE_PATH);
			if (imagePath != null) {
				((RelativeLayout) view.findViewById(R.id.list_item_dog_thumb))
						.setBackgroundDrawable(Drawable
								.createFromPath(imagePath));
			}
			else
			{
				Log.w(TAG, "Dog image path was null");
			}
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getActivity().getLayoutInflater().inflate(
					R.layout.list_item_dog, parent, false);
		}
	}

}
