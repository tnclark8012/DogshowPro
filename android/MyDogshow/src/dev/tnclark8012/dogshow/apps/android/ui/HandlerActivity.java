package dev.tnclark8012.dogshow.apps.android.ui;

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