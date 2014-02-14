package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.net.Uri;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;

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
