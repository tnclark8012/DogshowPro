package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Activity;
import android.content.CursorLoader;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CursorAdapter;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.DogListAdapter;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.DogsQuery;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityViewFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;

public class DogListFragment extends BaseEntityListFragment {
	private static final String TAG = DogListFragment.class.getSimpleName();
	private String mTitle;

	@Override
	protected BaseEditableEntityViewFragment getViewFragment() {
		return new DogViewFragment();
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return new DogEditFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().getActionBar().setTitle(R.string.dashboard_doghouse);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		mTitle = getString(R.string.dashboard_doghouse);
	}

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
		return new CursorLoader(activity, uri, DogsQuery.PROJECTION, null,
				null, Dogs.DEFAULT_SORT);
	}

	@Override
	protected int getIdColumnIndex() {
		return DogsQuery._ID;
	}

	@Override
	protected int getTitleColumnIndex() {
		return DogsQuery.DOG_CALL_NAME;
	}

	@Override
	protected Uri buildEntityUri(String entityId) {
		return Dogs.buildDogUri(entityId);
	}

	@Override
	public String getTitle() {
		return mTitle;
	}
}
