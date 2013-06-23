package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.content.CursorLoader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEntityListFragment;

public class HandlerListFragment extends BaseEntityListFragment{

	private static final String TAG = HandlerListFragment.class.getSimpleName();
	private interface HandlersQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { DogshowContract.Handlers._ID, DogshowContract.Handlers.HANDLER_NAME, DogshowContract.Handlers.HANDLER_JUNIOR_CLASS };

		int _ID = 0;
		int HANDLER_NAME = 1;
		int HANDLER_JUNIOR_LEVEL = 2;
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

	@Override
	protected Uri getContentUri() {
		return Handlers.CONTENT_URI;
	}

	@Override
	protected CursorAdapter getCursorAdapter(Activity activity) {
		return new HandlerListAdapter(activity);
	}

	@Override
	protected CursorLoader getCursorLoader(Activity activity, Uri uri) {
		return new CursorLoader(activity, uri, HandlersQuery.PROJECTION, null, null, null);
	}

	@Override
	protected int getIdColumnIndex() {
		return HandlersQuery._ID;
	}
	
}
