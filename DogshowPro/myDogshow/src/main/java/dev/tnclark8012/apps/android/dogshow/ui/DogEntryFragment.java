package dev.tnclark8012.apps.android.dogshow.ui;

import android.annotation.SuppressLint;
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
import android.provider.BaseColumns;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseActivity;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class DogEntryFragment extends Fragment implements
		LoaderManager.LoaderCallbacks<Cursor> {

	private static final String TAG = DogEntryFragment.class.getSimpleName();
	private CursorAdapter mAdapter;
	private int mDogQueryToken;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_entry_dogs, container, false);
		Button back = (Button) root.findViewById(R.id.button_bar_button_left);
		back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mCallbacks.onBackClick();
			}
		});
		Button next = (Button) root.findViewById(R.id.button_bar_button_right);
		next.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mCallbacks.onNextClick();
			}
		});
		return root;
	}

	public interface Callbacks {
		/**
		 * Return true to select (activate) the dog in the list, false
		 * otherwise.
		 */
		public boolean onDogSelected(int dogId, boolean checked);

		/**
		 * Return true if Add event was handled
		 * 
		 * @return
		 */
		public boolean onNextClick();

		public boolean onBackClick();
	}

	private static Callbacks sDummyCallbacks = new Callbacks() {

		@Override
		public boolean onDogSelected(int dogId, boolean checked) {
			return false;
		}

		@Override
		public boolean onNextClick() {
			return false;
		}

		@Override
		public boolean onBackClick() {
			return false;
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
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException(
					"Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
		activity.getContentResolver().registerContentObserver(Dogs.CONTENT_URI,
				true, mObserver);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ListView list = (ListView) getView().findViewById(
				R.id.fragment_entry_dogs_list);
		list.setAdapter(null);
		mAdapter = new DogListAdapter(getActivity());
		mDogQueryToken = DogsQuery._TOKEN;
		list.setAdapter(mAdapter);
		// Force start background query to load sessions
		getLoaderManager().restartLoader(mDogQueryToken, getArguments(), this);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	private interface DogsQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { BaseColumns._ID, Dogs.DOG_CALL_NAME,
				Dogs.DOG_BREED, Dogs.DOG_IMAGE_PATH, Dogs.DOG_IS_SHOWING };

		int _ID = 0;
		int DOG_CALL_NAME = 1;
		int DOG_BREED = 2;
		int DOG_IMAGE_PATH = 3;
		int DOG_IS_SHOWING = 4;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		final Intent intent = BaseActivity.fragmentArgumentsToIntent(data);
		final Uri dogsUri = Dogs.CONTENT_URI;
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

	private class DogListAdapter extends CursorAdapter {
		public DogListAdapter(Activity activity) {
			super(activity, null, false);
		}

		@SuppressWarnings("deprecation")
		@SuppressLint("NewApi")
		@Override
		public void bindView(View view, Context context, Cursor cursor) {
			final int id = cursor.getInt(DogsQuery._ID);
			((TextView) view.findViewById(R.id.list_item_dog_entry_name))
					.setText(cursor.getString(DogsQuery.DOG_CALL_NAME));
			String breedStr = cursor.getString(DogsQuery.DOG_BREED);
			((TextView) view.findViewById(R.id.list_item_dog_entry_breed))
					.setText(Breeds.parse(breedStr).getPrimaryName());
			String imagePath = cursor.getString(DogsQuery.DOG_IMAGE_PATH);
			ImageView imageView = ((ImageView) view
					.findViewById(R.id.list_item_dog_entry_thumb));
			boolean entered = Utils.getMaybeNull(cursor,
					DogsQuery.DOG_IS_SHOWING, 0) == 1;
			CheckBox checkBox = (CheckBox) view
					.findViewById(R.id.list_item_dog_entry_checkbox);
			Log.v(TAG, id + ":" + cursor.getString(DogsQuery.DOG_CALL_NAME));
			checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					mCallbacks.onDogSelected(id, isChecked);
				}
			});
			checkBox.setChecked(entered);
			if (imagePath != null) {
				UIUtils.displayImage(context, imageView, imagePath);
			} else {
				imageView.setImageResource(R.drawable.dog);
			}
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getActivity().getLayoutInflater().inflate(
					R.layout.list_item_dog_entry, parent, false);
		}
	}

}
