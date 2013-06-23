package dev.tnclark8012.dogshow.apps.android.ui.phone;

import dev.tnclark8012.dogshow.apps.android.ui.DogEditFragment;
import dev.tnclark8012.dogshow.apps.android.ui.DogViewFragment;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityActivity;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityViewFragment;

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