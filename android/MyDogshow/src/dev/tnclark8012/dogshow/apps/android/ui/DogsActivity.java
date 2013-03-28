package dev.tnclark8012.dogshow.apps.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;

public class DogsActivity extends SimpleSinglePaneActivity implements
		DogsFragment.Callbacks, DogEditFragment.Callbacks {
	DogsFragment mDogsFragment;

	// TODO Create SQL Create URI for dog
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (mDogsFragment == null)
			mDogsFragment = new DogsFragment();
	}

	@Override
	protected Fragment onCreatePane() {
		if (mDogsFragment == null)
			mDogsFragment = new DogsFragment();
		return mDogsFragment;
	}

	private void swapFragments(boolean toAdd) {
		Fragment swapIn;
		Bundle args = intentToFragmentArguments(getIntent());
		if (toAdd) {
			swapIn = new DogEditFragment();
			args.putBoolean(DogEditFragment.INTENT_EXTRA_NEW_DOG, true);
		} else {
			swapIn = mDogsFragment;
		}
		swapIn.setArguments(args);
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.root_container, swapIn, "single_pane").commit();
	}

	@Override
	public boolean onDogSelected(String dogId) {
		startActivity(new Intent(Intent.ACTION_VIEW,
				DogshowContract.Dogs.buildDogUri(dogId)));
		return false;
	}

	@Override
	public boolean onAddDogClick() {
		swapFragments(true);
		return true;
	}

	@Override
	public void onSave() {
		swapFragments(false);

	}

	@Override
	public void onCancel() {
		swapFragments(false);
	}
}
