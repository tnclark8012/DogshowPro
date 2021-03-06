package dev.tnclark8012.apps.android.dogshow.ui.phone;

import dev.tnclark8012.apps.android.dogshow.ui.HandlerEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerViewFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityViewFragment;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class HandlerActivity extends BaseEditableEntityActivity {
	private static final String TAG = makeLogTag(HandlerActivity.class);

	
	@Override
	protected BaseEditableEntityViewFragment getViewFragment() {
		return new HandlerViewFragment();
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return new HandlerEditFragment();
	}

	
}