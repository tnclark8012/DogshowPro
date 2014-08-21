package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dev.tnclark8012.apps.android.dogshow.R;

public class IncompleteFragment extends Fragment {
	public static IncompleteFragment newInstance(String message) {
		IncompleteFragment f = new IncompleteFragment();
		Bundle b = new Bundle();
		b.putString("message", message);
		f.setArguments(b);
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.fragment_incomplete, container,
				false);
		TextView tv = (TextView) v.findViewById(R.id.text1);
		tv.setText(getArguments().getString("message"));
		return v;

	}
}
