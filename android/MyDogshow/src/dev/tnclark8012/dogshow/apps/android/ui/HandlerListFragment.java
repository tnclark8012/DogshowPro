package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.Activity;
import android.content.CursorLoader;
import android.net.Uri;
import android.widget.CursorAdapter;
import dev.tnclark8012.dogshow.apps.android.adapters.HandlerListAdapter;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.sql.query.Query.HandlersQuery;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEntityListFragment;

public class HandlerListFragment extends BaseEntityListFragment{

	private static final String TAG = HandlerListFragment.class.getSimpleName();

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
