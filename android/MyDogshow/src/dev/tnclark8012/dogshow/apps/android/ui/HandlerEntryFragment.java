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

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseActivity;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class HandlerEntryFragment extends SherlockFragment implements LoaderManager.LoaderCallbacks<Cursor> {

	private static final String TAG = HandlerEntryFragment.class.getSimpleName();
	private CursorAdapter mAdapter;
	private int mHandlerQueryToken;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// return super.onCreateView(inflater, container, savedInstanceState);
		View root = inflater.inflate(R.layout.fragment_entry_handlers, null);
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
		 * Return true to select (activate) the handler in the list, false otherwise.
		 */
		public boolean onHandlerSelected(int handlerId, boolean checked);
		
		public boolean onHandlerEnteredJuniorsClicked(int handlerId, boolean checked);

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
		public boolean onHandlerSelected(int handlerId, boolean checked) {
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

		@Override
		public boolean onHandlerEnteredJuniorsClicked(int handlerId, boolean checked) {
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
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException("Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
		activity.getContentResolver().registerContentObserver(Handlers.CONTENT_URI, true, mObserver);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ListView list = (ListView) getView().findViewById(R.id.fragment_entry_handlers_list);
		list.setAdapter(null);
		mAdapter = new HandlersListAdapter(getActivity());
		mHandlerQueryToken = HandlersQuery._TOKEN;
		list.setAdapter(mAdapter);
		// Force start background query to load sessions
		getLoaderManager().restartLoader(mHandlerQueryToken, getArguments(), this);
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = sDummyCallbacks;
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	private interface HandlersQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { Handlers._ID, Handlers.HANDLER_IS_SHOWING, Handlers.HANDLER_IS_SHOWING_JUNIORS, Handlers.HANDLER_NAME, Handlers.HANDLER_IMAGE_PATH };

		int _ID = 0;
		int HANDLER_IS_SHOWING = 1;
		int HANDLER_IS_SHOWING_JUNIORS = 2;
		int HANDLER_NAME = 3;
		int HANDLER_IMAGE_PATH = 4;
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		final Intent intent = BaseActivity.fragmentArgumentsToIntent(data);
		final Uri handlersUri = Handlers.CONTENT_URI;
		Loader<Cursor> loader = null;
		if (id == HandlersQuery._TOKEN) {
			loader = new CursorLoader(getActivity(), handlersUri, HandlersQuery.PROJECTION, null, null, Handlers.DEFAULT_SORT);
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

	private class HandlersListAdapter extends CursorAdapter {
		public HandlersListAdapter(Activity activity) {
			super(activity, null, false);
		}

		@SuppressWarnings("deprecation")
		@SuppressLint("NewApi")
		@Override
		public void bindView(View view, Context context, Cursor cursor) {
			final int id = cursor.getInt(HandlersQuery._ID);
			((TextView) view.findViewById(R.id.list_item_handler_entry_name)).setText(cursor.getString(HandlersQuery.HANDLER_NAME));
			String imagePath = cursor.getString(HandlersQuery.HANDLER_IMAGE_PATH);
			ImageView imageLayout = ((ImageView) view.findViewById(R.id.list_item_handler_entry_thumb));
			boolean entered = Utils.getMaybeNull(cursor, HandlersQuery.HANDLER_IS_SHOWING, 0) == 1;
			final boolean enteredJuniors = Utils.getMaybeNull(cursor, HandlersQuery.HANDLER_IS_SHOWING_JUNIORS, 0) == 1;
			CheckBox enteredCheckBox = (CheckBox) view.findViewById(R.id.list_item_handler_entry_checkbox);
			//purposely check after setting listener ensures that handlers are "picked up" to account for juniors entries as well
			enteredCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {

				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					mCallbacks.onHandlerSelected(id, isChecked);
				}
			});
			enteredCheckBox.setChecked(entered);
			CompoundButton enteredJuniorsButton = (CompoundButton) view.findViewById(R.id.list_item_handler_entry_junior_button);
			enteredJuniorsButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					mCallbacks.onHandlerEnteredJuniorsClicked(id, isChecked);
				}
			});
			enteredJuniorsButton.setClickable(true);
			enteredJuniorsButton.setChecked(enteredJuniors);
			if (imagePath != null) {
				Resources res = getResources();
				int height = res.getDimensionPixelSize(R.dimen.element_height_normal);
				int width = res.getDimensionPixelSize(R.dimen.element_width_normal);
				// TODO LOW: move to AsyncTask
				BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(imagePath, width, height));
				if (Utils.isJellybean()) {
					imageLayout.setBackground(image);
				} else {
					imageLayout.setImageDrawable(image);
				}

			} else {
				imageLayout.setImageResource(R.drawable.ic_default_handler);
			}
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getActivity().getLayoutInflater().inflate(R.layout.list_item_handler_entry, parent, false);
		}
	}

}
