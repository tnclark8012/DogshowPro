package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamAddFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;

public class ShowTeamAddActivity extends SimpleSinglePaneActivity {
	private static final String TAG = ShowTeamAddActivity.class.getSimpleName();
	ShowTeamAddFragment mAddFragment;
	int active = 1;
	private static final int STEP_CREATE_OR_JOIN = 0;
	private static final int STEP_CREATE = 1;
	private static final int STEP_JOIN = 2;
	private static final int STEP_COMPLETE = 3;
	private int mCurrentStep = STEP_CREATE_OR_JOIN;
	private View mView;

	PersistHelper helper = new PersistHelper(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (mAddFragment == null)
			mAddFragment = new ShowTeamAddFragment();
	}

	@Override
	protected Fragment onCreatePane() {
		if (mAddFragment == null)
			mAddFragment = new ShowTeamAddFragment();
		return mAddFragment;
	}

	public boolean onNextClick() {
		switch (active) {
		case 1:
			break;
		case 2:
			// getFragmentManager().beginTransaction().replace(R.id.root_container,
			// mHandlerFragment, "single_pane").commit();
			break;
		case 3:
			break;
		}
		active++;
		return false;
	}

	public boolean onBackClick() {
		switch (active) {
		case 1:
			finish();
			break;
		case 2:
			// getFragmentManager().beginTransaction().replace(R.id.root_container,
			// mFindShowFragment, "single_pane").commit();
			break;
		case 3:
			break;
		}
		active--;
		return false;
	}

}
