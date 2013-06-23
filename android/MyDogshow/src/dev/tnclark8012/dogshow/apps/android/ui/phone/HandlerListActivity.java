package dev.tnclark8012.dogshow.apps.android.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class HandlerActivity extends SimpleSinglePaneActivity implements HandlerListFragment.Callbacks{
	@Override
	protected Fragment onCreatePane() {
		
		return new HandlerListFragment();
	}

	@Override
	public boolean onHandlerSelected(String handlerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onAddHandlerClick() {
		// TODO Auto-generated method stub
		return false;
	}
}
