package dev.tnclark8012.apps.android.dogshow.ui.phone;

import dev.tnclark8012.apps.android.dogshow.ui.DogEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.DogViewFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityViewFragment;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class DogActivity extends BaseEditableEntityActivity {
	private static final String TAG = makeLogTag(DogActivity.class);

	@Override
	protected BaseEditableEntityViewFragment getViewFragment() {
		return new DogViewFragment();
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return new DogEditFragment();
	}

	
}