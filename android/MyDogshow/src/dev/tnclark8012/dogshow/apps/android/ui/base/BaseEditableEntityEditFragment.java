package dev.tnclark8012.dogshow.apps.android.ui.base;

import java.util.Map;

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

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.provider.PersistHelper;

public abstract class BaseEditableEntityEditFragment extends SherlockFragment implements LoaderManager.LoaderCallbacks<Cursor> {
	public static final String INTENT_EXTRA_NEW_ENTITY = "dev.tnclark8012.dogshow.intent.extra.NEW_ENTITY";
	private boolean mCreateNewEntity = false;
	private int mEntityId = -1;
	private Uri mEntityUri;
	private final int mQueryToken = getQueryToken();
	private Callbacks mCallbacks;
	public interface Callbacks{
		public void onSave();
		public void onCancel();
	}
	protected abstract int getEntityIdFromUri(Uri uri);
	protected abstract int getQueryToken();
	protected abstract Map<String, Object> getEntityValueMap();
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

		final Intent intent = BaseActivity.fragmentArgumentsToIntent(getArguments());
		if (intent.getBooleanExtra(INTENT_EXTRA_NEW_ENTITY, false)) {
			mCreateNewEntity = true;
		} else {
			mEntityUri = intent.getData();

			if (mEntityUri == null) {
				return;
			}

			mEntityId = getEntityIdFromUri(mEntityUri);

			LoaderManager manager = getLoaderManager();
			manager.restartLoader(mQueryToken, null, this);
		}
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
		inflater.inflate(R.menu.entity_edit, menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
		case R.id.menu_entity_edit_cancel:
			mCallbacks.onCancel();
			return true;
		case R.id.menu_entity_edit_save:
			PersistHelper helper = new PersistHelper(getActivity());
			if(mCreateNewEntity)
			{
				helper.createEntity(getContentUri(), getEntityValueMap());
			}
			else
			{
				helper.updateEntity(getContentUri(), mEntityId, getEntityValueMap());
			}
			mCallbacks.onSave();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}