package dev.tnclark8012.dogshow.apps.android.ui;

import android.annotation.SuppressLint;
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
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class DogsFragment extends SherlockListFragment implements LoaderManager.LoaderCallbacks<Cursor> {

	private static final String TAG = DogsFragment.class.getSimpleName();
	private Handler mHandler = new Handler();
	private int mDogQueryToken;
	private CursorAdapter mAdapter;

	public interface Callbacks {
		/**
		 * Return true to select (activate) the dog in the list, false otherwise.
		 */
		public boolean onDogSelected(String dogId);

		/**
		 * Return true if Add event was handled
		 * 
		 * @return
		 */
		public boolean onAddDogClick();
	}

	private static Callbacks sDummyCallbacks = new Callbacks() {
		@Override
		public boolean onDogSelected(String dogId) {
			return true;
		}

		public boolean onAddDogClick() {
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

			Loader<Cursor> loader = getLoaderManager().getLoader(mDogQueryToken);
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

		if (item.getItemId() == R.id.menu_list_dogs_add && mCallbacks.onAddDogClick()) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	protected void reloadFromArguments(Bundle arguments) {
		setListAdapter(null);
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
			throw new ClassCastException("Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
		activity.getContentResolver().registerContentObserver(DogshowContract.Dogs.CONTENT_URI, true, mObserver);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	private interface DogsQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { BaseColumns._ID, Dogs.DOG_CALL_NAME, Dogs.DOG_BREED, Dogs.DOG_IMAGE_PATH, Dogs.DOG_IS_SHOWING };

		int _ID = 0;
		int DOG_CALL_NAME = 1;
		int DOG_BREED = 2;
		int DOG_IMAGE_PATH = 3;
        int DOG_IS_SHOWING = 4;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		final Intent intent = BaseActivity.fragmentArgumentsToIntent(data);
		final Uri dogsUri = intent.getData();
		Loader<Cursor> loader = null;
		if (id == DogsQuery._TOKEN) {
			loader = new CursorLoader(getActivity(), dogsUri, DogsQuery.PROJECTION, null, null, DogshowContract.Dogs.DEFAULT_SORT);
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

	/** {@inheritDoc} */
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		final Cursor cursor = (Cursor) mAdapter.getItem(position);
		String dogId = cursor.getString(cursor.getColumnIndex(DogshowContract.Dogs._ID));
		if (mCallbacks.onDogSelected(dogId)) {
			mAdapter.notifyDataSetChanged();
		}
	}

	private class DogListAdapter extends CursorAdapter {
		public DogListAdapter(Activity activity) {
			super(activity, null, false);
		}

		
		@SuppressWarnings("deprecation")
		@SuppressLint("NewApi")
		@Override
		public void bindView(View view, Context context, Cursor cursor) {
            //TODO LOW: Denote entered dogs
			((TextView) view.findViewById(R.id.list_item_dog_name)).setText(cursor.getString(DogsQuery.DOG_CALL_NAME));
			String breedStr = cursor.getString(DogsQuery.DOG_BREED);
			((TextView) view.findViewById(R.id.list_item_dog_breed)).setText(Breeds.parse(breedStr).getPrimaryName());
			String imagePath = cursor.getString(DogsQuery.DOG_IMAGE_PATH);
			RelativeLayout imageLayout = ((RelativeLayout) view.findViewById(R.id.list_item_dog_thumb));
			if (imagePath != null) {
				Resources res = getResources();
				int height = res.getDimensionPixelSize(R.dimen.element_height_normal);
				int width = res.getDimensionPixelSize(R.dimen.element_width_normal);
				//TODO LOW: move to AsyncTask
				BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(imagePath, width, height));
				if (Utils.isJellybean()) {
					imageLayout.setBackground(image);
				} else {
					imageLayout.setBackgroundDrawable(image);
				}
				
			} else {
				imageLayout.setBackgroundResource(R.drawable.dog);
			}
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getActivity().getLayoutInflater().inflate(R.layout.list_item_dog, parent, false);
		}
	}

}
