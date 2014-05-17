package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamAddFragment;
import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamCreateFragment;
import dev.tnclark8012.apps.android.dogshow.ui.ShowTeamJoinFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;

public class ShowTeamAddActivity extends SimpleSinglePaneActivity implements
		ShowTeamCreateFragment.Callback, ShowTeamJoinFragment.Callback,
		ShowTeamAddFragment.Callback {
	private static final String TAG = ShowTeamAddActivity.class.getSimpleName();
	private ShowTeamAddFragment mAddFragment;
	private ShowTeamJoinFragment mJoinFragment;
	private ShowTeamCreateFragment mCreateFragment;
	private int mStep = STEP_CREATE_OR_JOIN;
	private static final int STEP_CREATE_OR_JOIN = 0;
	private static final int STEP_CREATE = 1;
	private static final int STEP_JOIN = 2;
	private static final int STEP_COMPLETE = 3;
	private View mView;

	PersistHelper helper = new PersistHelper(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (mAddFragment == null)
			mAddFragment = ShowTeamAddFragment.newInstance(this);
	}

	@Override
	protected Fragment onCreatePane() {
		if (mAddFragment == null)
			mAddFragment = ShowTeamAddFragment.newInstance(this);
		return mAddFragment;
	}

	@Override
	public void onCreateFinish(int status, String teamName,
			String teamIdentifier) {
		handleJoinCreateResult(status, teamName, teamIdentifier);
	}

	@Override
	public void onCreate() {
		mStep = STEP_CREATE;
		showFragment(mStep);
	}

	@Override
	public void onJoin() {
		mStep = STEP_JOIN;
		showFragment(mStep);
	}

	private void handleJoinCreateResult(int status, String teamName,
			String teamIdentifier) {
		// TODO
		// lose
		// teamName
		// param.
		// Not
		// used
		if (status == ShowTeamJoinFragment.STATUS_SUCCESS) {
			new PersistHelper(this).setActiveTeam(teamIdentifier);
			finish();
		}
		if (status == ShowTeamJoinFragment.STATUS_BACK) {
			if (mStep > STEP_CREATE_OR_JOIN) {
				mStep = STEP_CREATE_OR_JOIN;
				showFragment(mStep);
			} else {
				finish();
			}
		} else if (status == ShowTeamJoinFragment.STATUS_FAIL) {
			Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public void onJoinFinish(int status, String teamName, String teamIdentifier) {
		handleJoinCreateResult(status, teamName, teamIdentifier);
	}

	private void showFragment(int step) {
		Fragment f = null;
		switch (step) {
		case STEP_CREATE_OR_JOIN:
			f = ShowTeamAddFragment.newInstance(this);
			break;
		case STEP_CREATE:
			f = ShowTeamCreateFragment.newInstance(this);
			break;
		case STEP_JOIN:
			f = ShowTeamJoinFragment.newInstance(this);
			break;
		}
		getFragmentManager().beginTransaction()
				.replace(R.id.root_container, f, "single_pane").commit();
	}
}
