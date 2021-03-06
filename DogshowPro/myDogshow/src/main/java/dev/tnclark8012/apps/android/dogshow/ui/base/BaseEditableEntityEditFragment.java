package dev.tnclark8012.apps.android.dogshow.ui.base;

import android.app.Activity;
import android.app.Fragment;
import android.app.LoaderManager;
import android.content.Context;
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
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.util.Map;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public abstract class BaseEditableEntityEditFragment extends Fragment implements
		LoaderManager.LoaderCallbacks<Cursor> {
	public static final String INTENT_EXTRA_NEW_ENTITY = "dev.tnclark8012.dogshow.intent.extra.NEW_ENTITY";
	private boolean mCreateNewEntity = false;
	private int mEntityId = -1;
	private Uri mEntityUri;
	private final int mQueryToken = getQueryToken();
	private Callbacks mCallbacks;

	public interface Callbacks {
		public void onSave(Map<String,Object> entityMap);//TODO these should just be models...

		public void onCancel();
	}

	protected final boolean creatingNewEntity() {
		return mCreateNewEntity;
	}

	
	public abstract String getTitle();

	protected abstract int getEntityIdFromUri(Uri uri);

	protected abstract int getQueryToken();

	public abstract Map<String, Object> getEntityValueMap();

	/**
	 * TODO This method and {@link #getQueryToken()} match
	 * {@link BaseEntityListFragment#getCursorLoader(Activity, Uri)} etc. Super
	 * class?
	 * 
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
			SyncHelper.requestManualSync(getActivity(),
					AccountUtils.getChosenAccount(getActivity()));
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
			getActivity().setTitle(getTitle());
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
		if (intent.getBooleanExtra(INTENT_EXTRA_NEW_ENTITY, false)) {
			mCreateNewEntity = true;
		} else {
			mEntityUri = intent.getData();

			if (mEntityUri == null) {
				mCreateNewEntity = true;
				return;
			}

			mEntityId = getEntityIdFromUri(mEntityUri);

			LoaderManager manager = getLoaderManager();
			manager.restartLoader(mQueryToken, null, this);
		}
		getActivity().setTitle(getTitle());
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (activity instanceof Callbacks) {
			mCallbacks = (Callbacks) activity;
		}
		activity.getContentResolver().registerContentObserver(getContentUri(),
				true, mObserver);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	@Override
	public void onResume() {
		super.onResume();
		getActivity().getActionBar().setTitle(getTitle());
	}

	@Override
	public void onPause() {
		super.onPause();
		View focused = getActivity().getCurrentFocus();
		if (focused != null) {// TODO mActivity
			InputMethodManager imm = (InputMethodManager) getActivity()
					.getSystemService(Context.INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(focused.getWindowToken(), 0);
		}

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
			if (mCallbacks != null) {
				mCallbacks.onCancel();
			}
			return true;
		case R.id.menu_entity_edit_save:
			if (mCallbacks != null) {
				mCallbacks.onSave(getEntityValueMap());
			}
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
