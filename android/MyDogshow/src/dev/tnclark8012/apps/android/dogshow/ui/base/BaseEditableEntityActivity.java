package dev.tnclark8012.apps.android.dogshow.ui.base;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.apps.android.dogshow.R;

public abstract class BaseEditableEntityActivity extends SimpleSinglePaneActivity implements BaseEditableEntityViewFragment.Callbacks, BaseEditableEntityEditFragment.Callbacks {
	private static final String TAG = BaseEditableEntityActivity.class.getSimpleName();
	private boolean isEditing = false;
	private Bundle mIntentBundle;
	private BaseEditableEntityViewFragment mViewFragment;
	private BaseEditableEntityEditFragment mEditFragment;

	protected abstract BaseEditableEntityViewFragment getViewFragment();

	protected abstract BaseEditableEntityEditFragment getEditFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		mIntentBundle = intentToFragmentArguments(getIntent());
		if (mViewFragment == null)
			mViewFragment = getViewFragment();
		if (mEditFragment == null)
			mEditFragment = getEditFragment();
		mViewFragment.setArguments(mIntentBundle);
		mEditFragment.setArguments(mIntentBundle);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayHomeAsUpEnabled(true);
		// actionBar.setHomeButtonEnabled(true);
	}

	@Override
	protected final Fragment onCreatePane() {
		if (mViewFragment == null) {
			mViewFragment = getViewFragment();
		}

		return mViewFragment;
	}

	private void swapFragments(boolean toEdit) {
		Fragment swapIn = (toEdit) ? mEditFragment : mViewFragment;
		swapIn.setArguments(mIntentBundle);
		getFragmentManager().beginTransaction().replace(R.id.root_container, swapIn, "single_pane").commit();
	}

	@Override
	public void onSave() {
		isEditing = false;
		swapFragments(isEditing);
	}

	@Override
	public final void onCancel() {
		isEditing = false;
		swapFragments(isEditing);
	}

	@Override
	public final void onEditClick() {
		isEditing = true;
		swapFragments(isEditing);
	}

	@Override
	public void setTitle(CharSequence title) {
		getActionBar().setTitle(title);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			if (isEditing) {
				onCancel();
			} else {
				finish();
			}
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
