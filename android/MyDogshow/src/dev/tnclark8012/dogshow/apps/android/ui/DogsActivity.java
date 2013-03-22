package dev.tnclark8012.dogshow.apps.android.ui;

import android.content.Intent;
import android.support.v4.app.Fragment;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;

public class DogsActivity extends SimpleSinglePaneActivity implements
		DogsFragment.Callbacks {

	@Override
	protected Fragment onCreatePane() {
		return new DogsFragment();
	}

	@Override
	public boolean onDogSelected(String dogId) {
		startActivity(new Intent(Intent.ACTION_VIEW,
				DogshowContract.Dogs.buildDogUri(dogId)));
		return false;
	}
}
