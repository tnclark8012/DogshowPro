package dev.tnclark8012.dogshow.apps.android.ui.phone;

import android.net.Uri;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.ui.HandlerEditFragment;
import dev.tnclark8012.dogshow.apps.android.ui.HandlerListFragment;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEntityListActivity;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEntityListFragment;

public class HandlerListActivity extends BaseEntityListActivity{

	@Override
	protected BaseEntityListFragment getListFragment() {
		return new HandlerListFragment();
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return new HandlerEditFragment();
	}

	@Override
	protected Uri getEntityUri(String entityId) {
		return Handlers.buildHandlerUri(entityId);
	}
	
}
