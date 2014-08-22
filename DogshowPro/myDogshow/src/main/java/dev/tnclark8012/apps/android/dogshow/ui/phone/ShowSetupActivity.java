package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.ui.DogEntryFragment;
import dev.tnclark8012.apps.android.dogshow.ui.FindShowFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerEntryFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class ShowSetupActivity extends SimpleSinglePaneActivity implements DogEntryFragment.Callbacks, FindShowFragment.Callbacks, HandlerEntryFragment.Callbacks {
	private static final String TAG = makeLogTag(ShowSetupActivity.class);
	DogEntryFragment mDogsFragment;
	HandlerEntryFragment mHandlerFragment;
	FindShowFragment mFindShowFragment;
	int active = 1;
	Show show;

	PersistHelper helper = new PersistHelper(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
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
		switch (active) {
		case 1:
			getFragmentManager().beginTransaction().replace(R.id.root_container, mDogsFragment, "single_pane").commit();
			break;
		case 2:
			getFragmentManager().beginTransaction().replace(R.id.root_container, mHandlerFragment, "single_pane").commit();

			break;
		case 3:
			new AsyncTask<Show, Void, Void>() {

				@Override
				protected Void doInBackground(Show... params) {
					new SyncHelper(ShowSetupActivity.this).enterShow(params[0]);
					return null;
				}
			}.execute(show);
			// new SyncHelper(this).executeSync(showId);
			finish();
			break;
		}
		active++;
		return false;
	}

	@Override
	public boolean onBackClick() {
		switch (active) {
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
	public void onShowSelected(Show show) {
		this.show = show;
		onNextClick();
	}

	@Override
	public void onShowSynced() {
	}

	@Override
	public boolean onDogSelected(int dogId, boolean isChecked) {
		LOGV(TAG, "dog ID " + dogId + ((isChecked) ? " is Showing" : " NOT showing"));
		Map<String, Object> values = new HashMap<String, Object>();
		values.put(Dogs.DOG_IS_SHOWING, Utils.booleanToInt(isChecked));
		helper.updateDog(dogId, values);

		return true;
	}

	@Override
	public boolean onHandlerSelected(int handlerId, boolean checked) {
		Map<String, Object> values = new HashMap<String, Object>();
		values.put(Handlers.HANDLER_IS_SHOWING, Utils.booleanToInt(checked));
		helper.updateEntity(Handlers.CONTENT_URI, handlerId, values);
		return true;
	}

	@Override
	public boolean onHandlerEnteredJuniorsClicked(int handlerId, boolean checked) {
		Map<String, Object> values = new HashMap<String, Object>();
		values.put(Handlers.HANDLER_IS_SHOWING_JUNIORS, Utils.booleanToInt(checked));
		helper.updateEntity(Handlers.CONTENT_URI, handlerId, values);
		return true;
	}

}
