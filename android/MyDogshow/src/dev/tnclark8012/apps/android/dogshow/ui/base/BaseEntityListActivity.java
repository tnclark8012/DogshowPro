package dev.tnclark8012.apps.android.dogshow.ui.base;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;

public abstract class BaseEntityListActivity extends SimpleSinglePaneActivity implements BaseEntityListFragment.Callbacks, BaseEditableEntityEditFragment.Callbacks {
	BaseEntityListFragment mListFragment;
	private static final String TAG = BaseEntityListActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	protected abstract BaseEntityListFragment getListFragment();

	protected abstract BaseEditableEntityEditFragment getEditFragment();

	protected abstract Uri getEntityUri(String entityId);

	@Override
	protected final Fragment onCreatePane() {
		if (mListFragment == null)
			mListFragment = getListFragment();
		return mListFragment;
	}

	@Override
	protected void onResume() {
		super.onResume();
		if (mListFragment == null) {
			mListFragment = getListFragment();
		}
	}

	private void swapFragments(boolean toAdd) {
		Fragment swapIn;
		Bundle args = intentToFragmentArguments(getIntent());
		if (toAdd) {
			swapIn = getEditFragment();
			args.putBoolean(BaseEditableEntityEditFragment.INTENT_EXTRA_NEW_ENTITY, true);
		} else {
			swapIn = mListFragment;
		}
		swapIn.setArguments(args);
		getFragmentManager().beginTransaction().replace(R.id.root_container, swapIn, "single_pane").commit();
	}

	@Override
	public boolean onEntityClick(Uri uri, String entityId) {
		startActivity(new Intent(Intent.ACTION_VIEW, getEntityUri(entityId)));
		return false;
	}

	@Override
	public final boolean onAddEntityClick(Uri uri) {
		swapFragments(true);
		return true;
	}

	@Override
	public final void onSave() {
		swapFragments(false);

	}

	@Override
	public final void onCancel() {
		swapFragments(false);
	}

	@Override
	public void onDeleteEntity(Uri uri, String entityId) {
		Log.d(TAG, "Delete request for entity Id: " + entityId);
		PersistHelper helper = new PersistHelper(this);
		helper.deleteEntity(getEntityUri(entityId));
	}
}
