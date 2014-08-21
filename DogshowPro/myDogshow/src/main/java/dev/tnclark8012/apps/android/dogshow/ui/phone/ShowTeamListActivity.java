package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;

import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;

public class ShowTeamListActivity extends SimpleSinglePaneActivity {
	@Override
	protected Fragment onCreatePane() {
		return new ShowTeamListFragment();
	}
}
