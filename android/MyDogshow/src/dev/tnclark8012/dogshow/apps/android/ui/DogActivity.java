package dev.tnclark8012.dogshow.apps.android.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.actionbarsherlock.view.MenuItem;

import dev.tnclark8012.dogshow.apps.android.R;

public class DogActivity extends SimpleSinglePaneActivity implements DogEditFragment.Callbacks, DogViewFragment.Callbacks {
	private static final String TAG = DogActivity.class.getSimpleName();
	private boolean isEditing = false;
	private DogViewFragment mViewFragment;
	private DogEditFragment mEditFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (mViewFragment == null)
			mViewFragment = new DogViewFragment();
		if (mEditFragment == null)
			mEditFragment = new DogEditFragment();

	}

	@Override
	protected Fragment onCreatePane() {
		if (mViewFragment == null) {
			mViewFragment = new DogViewFragment();
		}
		
		return mViewFragment;
	}

	private void swapFragments(boolean toEdit) {
		Fragment swapIn = (toEdit) ? mEditFragment : mViewFragment;
		swapIn.setArguments(intentToFragmentArguments(getIntent()));
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.root_container, swapIn, "single_pane").commit();
	}

	@Override
	public void onSave() {
		Log.d(TAG, "onSave");
		isEditing = false;
		swapFragments(isEditing);
	}

	@Override
	public void onCancel() {
		Log.d(TAG, "onCancel");
		isEditing = false;
		swapFragments(isEditing);
	}
	
	@Override
	public void onEdit() {
		Log.d(TAG, "onEdit");
		isEditing = true;
		swapFragments(isEditing);
	}
}