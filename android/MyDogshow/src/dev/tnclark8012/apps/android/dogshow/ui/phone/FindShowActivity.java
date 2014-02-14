package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.ui.FindShowFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;

public class FindShowActivity extends SimpleSinglePaneActivity implements FindShowFragment.Callbacks{
	private static final String TAG = FindShowActivity.class.getSimpleName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	protected Fragment onCreatePane() {
		return new FindShowFragment();
	}
	@Override
	public void onShowSelected(String showId) {
		Log.v(TAG, "selected show. id: " + showId);
		new SyncHelper(this).executeSync(showId);
		finish();
	}
	@Override
	public void onShowSynced() {

	}

}
