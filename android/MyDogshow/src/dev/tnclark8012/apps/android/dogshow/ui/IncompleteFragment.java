package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import dev.tnclark8012.apps.android.dogshow.R;

public class IncompleteFragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_incomplete,
				container, false);
		
	}
}