package dev.tclark.dogshow.apps.android.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.actionbarsherlock.view.MenuItem;

import dev.tclark.dogshow.apps.android.R;

public class DogActivity extends SimpleSinglePaneActivity {
	private boolean isEditing = false;
	private DogViewFragment mViewFragment;
	private DogEditFragment mEditFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
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

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Log.d("DogActivity", "clicked item");
		int id = item.getItemId();
		switch (id) {
		case android.R.id.home:
			if (isEditing) {
				swapFragments();
			} else {
				Log.d("DogActivity", "finishing...");
				finish();
			}
			return true;
		case R.id.menu_edit_dog:
			swapFragments();
			return true;
		case R.id.menu_dog_edit_save:
			swapFragments();
			return true;
		case R.id.menu_dog_edit_cancel:
			swapFragments();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void swapFragments() {
		Log.d("DogActivity", "swapping: " + isEditing);
		Fragment swapIn = (isEditing) ? mViewFragment : mEditFragment;
		isEditing = !isEditing;
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.root_container, swapIn, "single_pane").commit();
	}
}