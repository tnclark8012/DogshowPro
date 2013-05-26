package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockListFragment;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.model.Handler;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;

public class HandlerListFragment extends SherlockListFragment implements OnItemLongClickListener, LoaderManager.LoaderCallbacks<Cursor> {

	private static final String TAG = HandlerListFragment.class.getSimpleName();
	private Handler mHandler = new Handler();
	private int mHandlerQueryToken;
	private CursorAdapter mAdapter;

	public interface Callbacks {
		/**
		 * Return true to select (activate) the dog in the list, false otherwise.
		 */
		public boolean onHandlerSelected(String handlerId);

		/**
		 * Return true if Add event was handled
		 * 
		 * @return
		 */
		public boolean onAddHandlerClick();
	}

	private static Callbacks sDummyCallbacks = new Callbacks() {
		@Override
		public boolean onHandlerSelected(String handlerId) {
			return true;
		}

		public boolean onAddHandlerClick() {
			return false;
		};
	};

	private Callbacks mCallbacks = sDummyCallbacks;

	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		return false;
	}
	
	private final ContentObserver mObserver = new ContentObserver(new android.os.Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			if (getActivity() == null) {
				return;
			}

			Loader<Cursor> loader = getLoaderManager().getLoader(mHandlerQueryToken);
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

	protected void reloadFromArguments(Bundle arguments) {
		setListAdapter(null);
		mAdapter = new HandlerListAdapter(getActivity());
		mHandlerQueryToken = HandlersQuery._TOKEN;
		setListAdapter(mAdapter);
		// Force start background query to load sessions
		getLoaderManager().restartLoader(mHandlerQueryToken, arguments, this);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException("Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
		activity.getContentResolver().registerContentObserver(DogshowContract.Handlers.CONTENT_URI, true, mObserver);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	private interface HandlersQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { DogshowContract.Handlers._ID, DogshowContract.Handlers.HANDLER_NAME, DogshowContract.Handlers.HANDLER_JUNIOR_CLASS };

		int _ID = 0;
		int HANDLER_NAME = 1;
		int HANDLER_JUNIOR_LEVEL = 2;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		final Intent intent = BaseActivity.fragmentArgumentsToIntent(data);
		final Uri handlersUri = intent.getData();
		Loader<Cursor> loader = null;
		if (id == HandlersQuery._TOKEN) {
			loader = new CursorLoader(getActivity(), handlersUri, HandlersQuery.PROJECTION, null, null, DogshowContract.Handlers.DEFAULT_SORT);
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
		if (token == HandlersQuery._TOKEN) {
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

	
	private class HandlerListAdapter extends CursorAdapter {
		public HandlerListAdapter(Activity activity) {
			super(activity, null, false);
		}

		
		@Override
		public void bindView(View view, Context context, Cursor cursor) {
			((TextView) view.findViewById(R.id.list_item_handler_name)).setText(cursor.getString(HandlersQuery.HANDLER_NAME));
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getActivity().getLayoutInflater().inflate(R.layout.list_item_handler, parent, false);
		}
	}
	
}
