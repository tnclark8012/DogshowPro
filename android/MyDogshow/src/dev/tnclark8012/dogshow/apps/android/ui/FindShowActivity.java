package dev.tnclark8012.dogshow.apps.android.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

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
	public void onShowSelected(long showId) {
		Log.v(TAG, "selected show. id: " + showId);
	}
	@Override
	public void onShowSynced() {

	}

}
