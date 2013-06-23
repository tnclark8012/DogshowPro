package dev.tnclark8012.dogshow.apps.android.ui.base;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import dev.tnclark8012.dogshow.apps.android.R;

public abstract class BaseEntityListFragment extends SherlockListFragment implements LoaderManager.LoaderCallbacks<Cursor> {
	//TODO HIGH
	public interface Callbacks
	{
		public boolean onEntityClick(String entityId);
		public boolean onAddEntityClick();
	}
	protected abstract Uri getContentUri();
	protected abstract CursorAdapter getCursorAdapter(Activity activity);
	protected abstract CursorLoader getCursorLoader(Activity activity, Uri uri);
	protected abstract int getIdColumnIndex();
	
	private static final String TAG = BaseEntityListFragment.class.getSimpleName();
	private final int mQueryToken = new Random().nextInt();
	private CursorAdapter mAdapter;

	private static Callbacks sDummyCallbacks = new Callbacks() {
		@Override
		public boolean onEntityClick(String entityId) {
			return true;
		}

		public boolean onAddEntityClick() {
			return false;
		};
	};

	private Callbacks mCallbacks = sDummyCallbacks;

	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			if (getActivity() == null) {
				return;
			}

			Loader<Cursor> loader = getLoaderManager().getLoader(mQueryToken);
			if (loader != null) {
				loader.forceLoad();
			}
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
		reloadFromArguments(getArguments());
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.list_entity, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == R.id.menu_list_entity_add && mCallbacks.onAddEntityClick()) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	protected void reloadFromArguments(Bundle arguments) {
		setListAdapter(null);
		final Intent intent = BaseActivity.fragmentArgumentsToIntent(arguments);
		//TODO HIGH get Uri from intent
		mAdapter = getCursorAdapter(getActivity());
		setListAdapter(mAdapter);
		// Force start background query to load sessions
		getLoaderManager().restartLoader(mQueryToken, arguments, this);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException("Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
		activity.getContentResolver().registerContentObserver(getContentUri(), true, mObserver);
	}
	
	

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}
	
	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		final Intent intent = BaseActivity.fragmentArgumentsToIntent(data);
		final Uri uri = intent.getData();
		Loader<Cursor> loader = null;
		if (id == mQueryToken) {
			loader = getCursorLoader(getActivity(), uri);
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
		if (token == mQueryToken) {
			mAdapter.changeCursor(cursor);
		} else {
			Log.d(TAG, "Query complete, Not Actionable: " + token);
			cursor.close();
		}
	}

	@Override
	public void onLoaderReset(Loader<Cursor> loader) {
	}

	/** {@inheritDoc} */
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		final Cursor cursor = (Cursor) mAdapter.getItem(position);
		String entityId = cursor.getString(getIdColumnIndex());
		if (mCallbacks.onEntityClick(entityId)) {
			mAdapter.notifyDataSetChanged();
		}
	}
}
