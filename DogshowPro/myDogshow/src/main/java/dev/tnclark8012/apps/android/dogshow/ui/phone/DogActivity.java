package dev.tnclark8012.apps.android.dogshow.ui.phone;

import dev.tnclark8012.apps.android.dogshow.ui.DogEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.DogViewFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityViewFragment;

public class DogActivity extends BaseEditableEntityActivity {
	private static final String TAG = DogActivity.class.getSimpleName();

	@Override
	protected BaseEditableEntityViewFragment getViewFragment() {
		return new DogViewFragment();
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return new DogEditFragment();
	}

	
}