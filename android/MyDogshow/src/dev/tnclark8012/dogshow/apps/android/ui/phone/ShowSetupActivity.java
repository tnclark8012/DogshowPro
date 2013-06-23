package dev.tnclark8012.dogshow.apps.android.ui.phone;

import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.provider.PersistHelper;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sync.SyncHelper;
import dev.tnclark8012.dogshow.apps.android.ui.DogEntryFragment;
import dev.tnclark8012.dogshow.apps.android.ui.FindShowFragment;
import dev.tnclark8012.dogshow.apps.android.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.dogshow.apps.android.ui.DogEntryFragment.Callbacks;

public class ShowSetupActivity extends SimpleSinglePaneActivity implements DogEntryFragment.Callbacks, FindShowFragment.Callbacks {
	private static final String TAG = ShowSetupActivity.class.getSimpleName();
	DogEntryFragment mDogsFragment;
	FindShowFragment mFindShowFragment;
	String showId;
	Map<Integer, Boolean> enteredDogs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (enteredDogs == null) {
			enteredDogs = new HashMap<Integer, Boolean>();
		}
		if (mDogsFragment == null)
			mDogsFragment = new DogEntryFragment();
		if (mFindShowFragment == null)
			mFindShowFragment = new FindShowFragment();
	}

	@Override
	protected Fragment onCreatePane() {
		if (mFindShowFragment == null)
			mFindShowFragment = new FindShowFragment();
		return mFindShowFragment;
	}

	@Override
	public boolean onNextClick() {
		PersistHelper helper = new PersistHelper(this);
		Map<String, Object> values = new HashMap<String, Object>();
		for (Integer id : enteredDogs.keySet()) {
            Log.d(TAG, "Is " + id + " showing? " + enteredDogs.get(id));
			values.put(Dogs.DOG_IS_SHOWING, (enteredDogs.get(id) ? 1 : 0));
			helper.updateDog(id, values);
		}
		new SyncHelper(this).executeSync(showId);
		finish();
		return false;
	}

	@Override
	public boolean onBackClick() {
		getSupportFragmentManager().beginTransaction().replace(R.id.root_container, mFindShowFragment, "single_pane").commit();
		return false;
	}

	@Override
	public boolean onDogSelected(int dogId, boolean isChecked) {
		enteredDogs.put(dogId, isChecked);
		return true;
	}

	@Override
	public void onShowSelected(String showId) {
		this.showId = showId;
		getSupportFragmentManager().beginTransaction().replace(R.id.root_container, mDogsFragment, "single_pane").commit();

	}

	@Override
	public void onShowSynced() {
		// TODO Auto-generated method stub

	}

}
