package dev.tnclark8012.dogshow.apps.android.ui.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.ui.SimpleSinglePaneActivity;

public abstract class BaseEntityListActivity extends SimpleSinglePaneActivity implements BaseEntityListFragment.Callbacks, BaseEditableEntityEditFragment.Callbacks{
	BaseEntityListFragment mListFragment;
	
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
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.root_container, swapIn, "single_pane").commit();
	}

	@Override
	public final boolean onEntityClick(String entityId) {
		startActivity(new Intent(Intent.ACTION_VIEW,
				getEntityUri(entityId)));
		return false;
	}

	@Override
	public final boolean onAddEntityClick() {
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
}