package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.ui.FindShowFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class FindShowActivity extends SimpleSinglePaneActivity implements FindShowFragment.Callbacks{
	private static final String TAG = makeLogTag(FindShowActivity.class);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	protected Fragment onCreatePane() {
		return new FindShowFragment();
	}
	@Override
	public void onShowSelected(Show show) {
		LOGV(TAG, "selected show. id: " + show.showId);
		new SyncHelper(this).enterShow(show);
		finish();
	}
	@Override
	public void onShowSynced() {

	}

}
