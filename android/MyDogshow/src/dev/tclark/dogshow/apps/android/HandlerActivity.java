package dev.tclark.dogshow.apps.android;

import dev.tclark.dogshow.apps.android.ui.HandlerListFragment;
import dev.tclark.dogshow.apps.android.ui.SimpleSinglePaneActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class HandlerActivity extends SimpleSinglePaneActivity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	@Override
	protected Fragment onCreatePane() {
		
		return new HandlerListFragment();
	}
}
