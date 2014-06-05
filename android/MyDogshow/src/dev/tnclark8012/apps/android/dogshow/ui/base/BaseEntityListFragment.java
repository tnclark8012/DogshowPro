package dev.tnclark8012.apps.android.dogshow.ui.base;

import java.util.Random;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.ListFragment;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.CursorAdapter;
import android.widget.ListView;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.ui.dialog.YesNoDialog;
import dev.tnclark8012.apps.android.dogshow.ui.dialog.YesNoDialog.Callback;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public abstract class BaseEntityListFragment extends ListFragment implements
		LoaderManager.LoaderCallbacks<Cursor>, OnItemLongClickListener {
	// TODO HIGH
	public interface Callbacks {
		public boolean onEntityClick(Uri uri, String entityId);

		public boolean onAddEntityClick(Uri uri);

		public void onDeleteEntity(Uri uri, String entityId);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	protected abstract Uri getContentUri();

	protected abstract CursorAdapter getCursorAdapter(Activity activity);

	protected abstract CursorLoader getCursorLoader(Activity activity, Uri uri);

	protected abstract int getIdColumnIndex();

	protected abstract int getTitleColumnIndex();

	public abstract String getTitle();

	protected abstract Uri buildEntityUri(String entityId);

	protected abstract BaseEditableEntityViewFragment getViewFragment();

	protected abstract BaseEditableEntityEditFragment getEditFragment();

	private static final String TAG = BaseEntityListFragment.class
			.getSimpleName();
	private final int mQueryToken = new Random().nextInt();
	private CursorAdapter mAdapter;
	private static Callbacks sDummyCallbacks = new Callbacks() {
		@Override
		public boolean onEntityClick(Uri uri, String entityId) {
			return true;
		}

		public boolean onAddEntityClick(Uri uri) {
			return false;
		}

		@Override
		public void onDeleteEntity(Uri uri, String entityId) {
		}
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
		getActivity().setTitle(getTitle());
	}

	@Override
	public void onResume() {
		super.onResume();
		getListView().setOnItemLongClickListener(this);
		getActivity().getActionBar().setTitle(getTitle());
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.list_entity, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == R.id.menu_list_entity_add) {
			mCallbacks.onAddEntityClick(getContentUri());
			// Fragment f = getEditFragment();
			// if (f != null) {
			// Bundle b = new Bundle();
			// b.putBoolean(
			// BaseEditableEntityEditFragment.INTENT_EXTRA_NEW_ENTITY,
			// true);
			// f.setArguments(b);
			// f.setTargetFragment(this, 0);
			// getFragmentManager().beginTransaction()
			// .addToBackStack("add_entity")
			// .add(R.id.root_container, f, "add_entity").commit();
			// setMenuVisibility(false);
			// }
			// startActivity(new Intent(Intent.ACTION_INSERT, getContentUri()));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		setMenuVisibility(true);
	}

	protected void reloadFromArguments(Bundle arguments) {
		setListAdapter(null);
		// TODO HIGH get Uri from intent
		mAdapter = getCursorAdapter(getActivity());
		setListAdapter(mAdapter);
		// Force start background query to load sessions
		getLoaderManager().restartLoader(mQueryToken, arguments, this);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (activity instanceof Callbacks) {
			mCallbacks = (Callbacks) activity;
		} else if (this instanceof Callbacks) {
			mCallbacks = (Callbacks) this;
		} else {
			// throw new
			// ClassCastException("Activity or fragment must implement fragment's callbacks.");
		}
		activity.getContentResolver().registerContentObserver(getContentUri(),
				true, mObserver);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		Loader<Cursor> loader = null;
		if (id == mQueryToken) {
			loader = getCursorLoader(getActivity(), getContentUri());
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
		mCallbacks.onEntityClick(getContentUri(), entityId);
	}

	protected CursorAdapter getAdapter() {
		return mAdapter;
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> adapter, View view,
			int position, long id) {
		setRetainInstance(true);
		final Cursor cursor = (Cursor) mAdapter.getItem(position);
		String entityTitle = Utils.getMaybeNull(cursor, getTitleColumnIndex(),
				"It");
		if ((Utils.isNullOrEmpty(entityTitle))) {
			entityTitle = "It";
		}
		final String entityId = Utils.getMaybeNull(cursor, getIdColumnIndex(),
				null);
		Bundle args = new Bundle();
		args.putString("Id", entityId);
		args.putString(YesNoDialog.BUNDLE_KEY_TITLE, "Delete " + entityTitle);
		args.putString(YesNoDialog.BUNDLE_KEY_MESSAGE, entityTitle
				+ " will be gone for-e-ver.");
		DialogFragment d = YesNoDialog.newInstance(args, new Callback() {
			@Override
			public void onFinishDialog(int status, Bundle args) {
				if (status == YesNoDialog.STATUS_YES) {
					String entityId = args.getString("Id");
					Uri contentUri = getContentUri();
					mCallbacks.onDeleteEntity(contentUri, entityId);
					new PersistHelper(getActivity())
							.deleteEntity(buildEntityUri(entityId));
					setRetainInstance(false);
				}
			}
		});
		d.show(getFragmentManager(), "dialog");
		return true;
	}
}
