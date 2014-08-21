package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import dev.tnclark8012.apps.android.dogshow.R;

public class ShowTeamAddFragment extends Fragment {
	public interface Callback {
		void onCreate();

		void onJoin();
	}

	private static final String TAG = ShowTeamAddFragment.class.getSimpleName();
	private Callback mCallback = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_team_create_or_join,
                container, false);
		((Button) view.findViewById(R.id.button_team_create))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						mCallback.onCreate();
					}
				});
		((Button) view.findViewById(R.id.button_team_join))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						mCallback.onJoin();
					}
				});
		return view;
	}

	private void setCallback(Callback callback) {
		mCallback = callback;
	}

	public static ShowTeamAddFragment newInstance(Callback callback) {
		ShowTeamAddFragment f = new ShowTeamAddFragment();
		f.setCallback(callback);
		return f;
	}
}
