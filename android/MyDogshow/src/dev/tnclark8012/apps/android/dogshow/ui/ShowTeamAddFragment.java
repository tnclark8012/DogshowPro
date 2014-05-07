package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;

public class ShowTeamAddFragment extends Fragment {

	private static final String TAG = ShowTeamAddFragment.class.getSimpleName();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_team_create_or_join,
				null);
		((Button) view.findViewById(R.id.button_team_create))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						Toast.makeText(getActivity(), "Create",
								Toast.LENGTH_SHORT).show();
					}
				});
		((Button) view.findViewById(R.id.button_team_join))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						Toast.makeText(getActivity(), "Join",
								Toast.LENGTH_SHORT).show();
					}
				});
		return view;
	}
}
