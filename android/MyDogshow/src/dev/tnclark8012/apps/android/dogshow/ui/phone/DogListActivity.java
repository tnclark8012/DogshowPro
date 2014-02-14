package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.net.Uri;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.ui.DogEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.DogListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;

public class DogListActivity extends BaseEntityListActivity {

	@Override
	protected BaseEntityListFragment getListFragment() {
		// TODO Auto-generated method stub
		return new DogListFragment();
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		// TODO Auto-generated method stub
		return new DogEditFragment();
	}

	@Override
	protected Uri getEntityUri(String entityId) {
		// TODO Auto-generated method stub
		return Dogs.buildDogUri(entityId);
	}
}
