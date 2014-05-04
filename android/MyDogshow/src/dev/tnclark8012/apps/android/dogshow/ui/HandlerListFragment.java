package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Activity;
import android.content.CursorLoader;
import android.net.Uri;
import android.widget.CursorAdapter;
import dev.tnclark8012.apps.android.dogshow.adapters.HandlerListAdapter;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.HandlersQuery;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;

public class HandlerListFragment extends BaseEntityListFragment {

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
		return new CursorLoader(activity, uri, HandlersQuery.PROJECTION, null,
				null, Handlers.DEFAULT_SORT);
	}

	@Override
	protected int getIdColumnIndex() {
		return HandlersQuery._ID;
	}

	@Override
	protected int getTitleColumnIndex() {
		return HandlersQuery.HANDLER_NAME;
	}

	@Override
	protected Uri buildEntityUri(String entityId) {
		return Handlers.buildHandlerUri(entityId);
	}

}
