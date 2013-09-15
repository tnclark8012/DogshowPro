package dev.tnclark8012.dogshow.apps.android.ui.base;

import android.app.Fragment;
import android.os.Bundle;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.ui.SimpleSinglePaneActivity;

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
}
