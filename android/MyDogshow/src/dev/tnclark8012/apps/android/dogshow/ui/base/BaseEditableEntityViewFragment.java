package dev.tnclark8012.apps.android.dogshow.ui.base;

import android.app.Activity;
import android.app.Fragment;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import dev.tnclark8012.apps.android.dogshow.R;

public abstract class BaseEditableEntityViewFragment extends Fragment implements
LoaderManager.LoaderCallbacks<Cursor>{
	public static final String INTENT_EXTRA_NEW_ENTITY = "dev.tnclark8012.dogshow.intent.extra.NEW_ENTITY";
	private Uri mEntityUri;
	private final int mQueryToken = getQueryToken();
	private Callbacks mCallbacks;
	public interface Callbacks{
		public void onEditClick();
	}
	protected abstract int getQueryToken();
	/**
	 * TODO This method and {@link #getQueryToken()} match {@link BaseEntityListFragment#getCursorLoader(Activity, Uri)} etc. Super class?
	 * @param activity
	 * @param uri
	 * @return
	 */
	protected abstract CursorLoader getCursorLoader(Activity activity, Uri uri);
	protected abstract void onQueryComplete(Cursor cursor);
	protected abstract Uri getContentUri();
	
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
	public final Loader<Cursor> onCreateLoader(int id, Bundle data) {
		CursorLoader loader = null;
		if (id == mQueryToken) {
			loader = getCursorLoader(getActivity(), mEntityUri);
		}
		return loader;
	}

	@Override
	public final void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
		if (getActivity() == null) {
			return;
		}
		if (loader.getId() == mQueryToken) {
			onQueryComplete(cursor);
		}
	}

	@Override
	public final void onLoaderReset(Loader<Cursor> arg0) {
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
		final Intent intent = BaseActivity
				.fragmentArgumentsToIntent(getArguments());
		mEntityUri = intent.getData();

		if (mEntityUri == null) {
			return;
		}

		LoaderManager manager = getLoaderManager();
		manager.restartLoader(getQueryToken(), null, this);
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
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.entity_view, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == R.id.menu_edit_entity) {
			mCallbacks.onEditClick();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
}
