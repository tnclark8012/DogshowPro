package dev.tnclark8012.dogshow.apps.android.ui.phone;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import dev.tnclark8012.dogshow.apps.android.ui.HandlerEditFragment;
import dev.tnclark8012.dogshow.apps.android.ui.HandlerViewFragment;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityActivity;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityViewFragment;

public class HandlerActivity extends BaseEditableEntityActivity {
	private static final String TAG = HandlerActivity.class.getSimpleName();

	
	@Override
	protected BaseEditableEntityViewFragment getViewFragment() {
		return new HandlerViewFragment();
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return new HandlerEditFragment();
	}

	
}