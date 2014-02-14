package dev.tnclark8012.apps.android.dogshow.ui.phone;

import java.util.HashMap;
import java.util.Map;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.ui.DogEntryFragment;
import dev.tnclark8012.apps.android.dogshow.ui.FindShowFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerEntryFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.apps.android.dogshow.R;

public class ShowSetupActivity extends SimpleSinglePaneActivity implements DogEntryFragment.Callbacks, FindShowFragment.Callbacks, HandlerEntryFragment.Callbacks {
	private static final String TAG = ShowSetupActivity.class.getSimpleName();
	DogEntryFragment mDogsFragment;
	HandlerEntryFragment mHandlerFragment;
	FindShowFragment mFindShowFragment;
	int active = 1;
	String showId;
	
	Map<Integer, Boolean> enteredDogs;
	Map<Integer, Boolean> enteredHandlers;
	SparseBooleanArray enteredJuniors;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (enteredDogs == null) {
			enteredDogs = new HashMap<Integer, Boolean>();
		}
		if (enteredHandlers == null) {
			enteredHandlers = new HashMap<Integer, Boolean>();
		}
		if (enteredJuniors== null) {
			enteredJuniors = new SparseBooleanArray();
		}
		if (mDogsFragment == null)
			mDogsFragment = new DogEntryFragment();
		if (mHandlerFragment == null)
			mHandlerFragment = new HandlerEntryFragment();
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
		switch(active){
		case 1:
			getFragmentManager().beginTransaction().replace(R.id.root_container, mDogsFragment, "single_pane").commit();
			break;
		case 2:
			getFragmentManager().beginTransaction().replace(R.id.root_container, mHandlerFragment, "single_pane").commit();

			break;
		case 3:
			PersistHelper helper = new PersistHelper(this);
			Map<String, Object> values = new HashMap<String, Object>();
			for (Integer id : enteredDogs.keySet()) {
				Log.d(TAG, "Is " + id + " showing? " + enteredDogs.get(id));
				values.put(Dogs.DOG_IS_SHOWING, (enteredDogs.get(id).booleanValue() ? 1 : 0));
				helper.updateDog(id, values);
			}
			values.clear();
			for(Integer id: enteredHandlers.keySet())
			{
				values.put(Handlers.HANDLER_IS_SHOWING, enteredHandlers.get(id) ? 1 : 0);
				values.put(Handlers.HANDLER_IS_SHOWING_JUNIORS, enteredJuniors.get(id) ? 1 : 0);
				helper.updateEntity(Handlers.CONTENT_URI, id, values);
			}
			new AsyncTask<String, Void, Void>() {

				@Override
				protected Void doInBackground(String... params) {
					new SyncHelper(ShowSetupActivity.this).executeSync(params[0]);
					return null;
				}
			}.execute(showId);
//			new SyncHelper(this).executeSync(showId);
			finish();
			break;
		}
		active++;
		return false;
	}

	@Override
	public boolean onBackClick() {
		switch(active)
		{
		case 1:
			finish();
			break;
		case 2:
			getFragmentManager().beginTransaction().replace(R.id.root_container, mFindShowFragment, "single_pane").commit();
			break;
		case 3:
			getFragmentManager().beginTransaction().replace(R.id.root_container, mDogsFragment, "single_pane").commit();
			break;
		}
		active--;
		return false;
	}

	@Override
	public boolean onDogSelected(int dogId, boolean isChecked) {
		enteredDogs.put(dogId, isChecked);
		Log.v(TAG, "dog ID " + dogId  + ((isChecked)?" is Showing" : " NOT showing"));
		return true;
	}

	@Override
	public void onShowSelected(String showId) {
		this.showId = showId;
		onNextClick();
	}

	@Override
	public void onShowSynced() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onHandlerSelected(int handlerId, boolean checked) {
		enteredHandlers.put(handlerId, checked);
		return true;
	}

	@Override
	public boolean onHandlerEnteredJuniorsClicked(int handlerId, boolean checked) {
		enteredJuniors.put(handlerId, checked);
		return true;
	}

}
