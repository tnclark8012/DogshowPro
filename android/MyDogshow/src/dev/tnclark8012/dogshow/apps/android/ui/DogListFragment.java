package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.Activity;
import android.content.CursorLoader;
import android.net.Uri;
import android.widget.CursorAdapter;
import dev.tnclark8012.dogshow.apps.android.adapters.DogListAdapter;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.query.Query.DogsQuery;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEntityListFragment;

public class DogListFragment extends BaseEntityListFragment {
	private static final String TAG = DogListFragment.class.getSimpleName();
	@Override
	protected Uri getContentUri() {
		return Dogs.CONTENT_URI;
	}
	@Override
	protected CursorAdapter getCursorAdapter(Activity activity) {
		return new DogListAdapter(activity);
	}
	@Override
	protected CursorLoader getCursorLoader(Activity activity, Uri uri) {
		return new CursorLoader(activity, uri, DogsQuery.PROJECTION, null, null, Dogs.DEFAULT_SORT);
	}
	@Override
	protected int getIdColumnIndex() {
		return DogsQuery._ID;
	}

	
}
