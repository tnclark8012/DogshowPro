package dev.tnclark8012.apps.android.dogshow.ui.base;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.Map;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigatableActivity;

public abstract class BaseEditableEntityActivity extends NavigatableActivity
		implements BaseEditableEntityViewFragment.Callbacks,
		BaseEditableEntityEditFragment.Callbacks {
	private static final String TAG = BaseEditableEntityActivity.class
			.getSimpleName();
	private boolean isEditing = false;
	private Bundle mIntentBundle;
	private BaseEditableEntityViewFragment mViewFragment;
	private BaseEditableEntityEditFragment mEditFragment;

	protected abstract BaseEditableEntityViewFragment getViewFragment();

	protected abstract BaseEditableEntityEditFragment getEditFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Setup our fragments before calling super.onCreate so they're ready
		// for createPane()
		mIntentBundle = intentToFragmentArguments(getIntent());
		if (mViewFragment == null)
			mViewFragment = getViewFragment();
		if (mEditFragment == null)
			mEditFragment = getEditFragment();
		mViewFragment.setArguments(mIntentBundle);
		String action = getIntent().getAction();
		if (action.equals(Intent.ACTION_INSERT)) {
			mIntentBundle.putBoolean(
					BaseEditableEntityEditFragment.INTENT_EXTRA_NEW_ENTITY,
					true);
		}
		mEditFragment.setArguments(mIntentBundle);

		super.onCreate(savedInstanceState);

		// actionBar.setHomeButtonEnabled(true);
	}

	@Override
	protected final Fragment onCreatePane() {
		String action = getIntent().getAction();
		if (action.equals(Intent.ACTION_INSERT)
				|| action.equals(Intent.ACTION_EDIT)) {
			return mEditFragment;
		} else if (action.equals(Intent.ACTION_VIEW)) {
			return mViewFragment;
		}
		throw new RuntimeException("No action specified for entity!");
	}

	private void swapFragments(boolean toEdit) {
		Fragment swapIn = (toEdit) ? mEditFragment : mViewFragment;
		swapIn.setArguments(mIntentBundle);
		getFragmentManager().beginTransaction()
				.replace(R.id.root_container, swapIn, "single_pane").commit();
	}

	@Override
	public void onSave(Map<String, Object> entityMap) {
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
