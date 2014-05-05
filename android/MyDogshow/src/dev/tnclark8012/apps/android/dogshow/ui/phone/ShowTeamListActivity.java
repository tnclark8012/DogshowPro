package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.net.Uri;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;

public class ShowTeamListActivity extends BaseEntityListActivity {

	@Override
	protected BaseEntityListFragment getListFragment() {
		// TODO Auto-generated method stub
		return new ShowTeamListFragment();
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return null;
	}

	@Override
	protected Uri getEntityUri(String entityId) {
		return ShowTeams.buildShowTeamUri(entityId);
	}

}
