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

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class DogEntryFragment extends SherlockFragment implements LoaderManager.LoaderCallbacks<Cursor> {

	private static final String TAG = DogEntryFragment.class.getSimpleName();
	private CursorAdapter mAdapter;
	private int mDogQueryToken;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//return super.onCreateView(inflater, container, savedInstanceState);
		View root = inflater.inflate(R.layout.fragment_entry_dogs, null);
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
		 * Return true to select (activate) the dog in the list, false otherwise.
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
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean onNextClick() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean onBackClick() {
			// TODO Auto-generated method stub
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
		}

		reloadFromArguments(getArguments());
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.list_dogs, menu);
	}

	protected void reloadFromArguments(Bundle arguments) {
//		setListAdapter(null);
//		final Intent intent = BaseActivity.fragmentArgumentsToIntent(arguments);
//		final Uri dogsUri = intent.getData();
//		if (dogsUri == null) {
//			// return;
//		}
//
//		mAdapter = new DogListAdapter(getActivity());
//		mDogQueryToken = DogsQuery._TOKEN;
//		View footer = getLayoutInflater(null).inflate(R.layout.button_bar, null);
//		getListView().addFooterView(footer);
//		setListAdapter(mAdapter);
//		// Force start background query to load sessions
//		getLoaderManager().restartLoader(mDogQueryToken, arguments, this);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException("Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
		activity.getContentResolver().registerContentObserver(Dogs.CONTENT_URI, true, mObserver);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ListView list = (ListView) getView().findViewById(R.id.fragment_entry_dogs_list);
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
		final Uri dogsUri = Dogs.CONTENT_URI;
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

//	/** {@inheritDoc} */
//	@Override
//	public void onListItemClick(ListView l, View v, int position, long id) {
//		final Cursor cursor = (Cursor) mAdapter.getItem(position);
//		String dogId = cursor.getString(cursor.getColumnIndex(DogshowContract.Dogs._ID));
//		if (mCallbacks.onDogSelected(dogId)) {
//			mAdapter.notifyDataSetChanged();
//		}
//	}
	private class DogListAdapter extends CursorAdapter {
		public DogListAdapter(Activity activity) {
			super(activity, null, false);
		}
		
		
		@SuppressWarnings("deprecation")
		@SuppressLint("NewApi")
		@Override
		public void bindView(View view, Context context, Cursor cursor) {
			final int id = cursor.getInt(DogsQuery._ID);
			((TextView) view.findViewById(R.id.list_item_dog_entry_name)).setText(cursor.getString(DogsQuery.DOG_CALL_NAME));
			String breedStr = cursor.getString(DogsQuery.DOG_BREED);
			((TextView) view.findViewById(R.id.list_item_dog_entry_breed)).setText(Breeds.parse(breedStr).getPrimaryName());
			String imagePath = cursor.getString(DogsQuery.DOG_IMAGE_PATH);
			ImageView imageLayout = ((ImageView) view.findViewById(R.id.list_item_dog_entry_thumb));
			boolean entered = Utils.getMaybeNull(cursor, DogsQuery.DOG_IS_SHOWING, 0) == 1;
			CheckBox checkBox = (CheckBox) view.findViewById(R.id.list_item_dog_entry_checkbox);
			checkBox.setChecked(entered);
			checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener(){

				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					// TODO Auto-generated method stub
					mCallbacks.onDogSelected(id, isChecked);
				}
			});
			if (imagePath != null) {
				Resources res = getResources();
				int height = res.getDimensionPixelSize(R.dimen.element_height_normal);
				int width = res.getDimensionPixelSize(R.dimen.element_width_normal);
				//TODO LOW: move to AsyncTask
				BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(imagePath, width, height));
				if (Utils.isJellybean()) {
					imageLayout.setBackground(image);
				} else {
					imageLayout.setImageDrawable(image);
				}
				
			} else {
				imageLayout.setImageResource(R.drawable.dog);
			}
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getActivity().getLayoutInflater().inflate(R.layout.list_item_dog_entry, parent, false);
		}
	}

}