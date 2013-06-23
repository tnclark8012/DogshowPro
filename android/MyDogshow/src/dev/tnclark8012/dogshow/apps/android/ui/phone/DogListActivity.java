package dev.tnclark8012.dogshow.apps.android.ui.phone;

import android.net.Uri;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.ui.DogEditFragment;
import dev.tnclark8012.dogshow.apps.android.ui.DogListFragment;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEntityListActivity;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEntityListFragment;

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
