package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import dev.tnclark8012.dogshow.apps.android.BuildConfig;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.ui.phone.ShowSetupActivity;

public class DashboardFragment extends Fragment {
	/**
	 * Logger Tag
	 */
	public static final String TAG = "DashboardAcitivy";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// *****************************
		// Inflate the root view for the
		// dashboard
		// *****************************
		View root = inflater.inflate(R.layout.home_next, container);

		// **********************************
		// Attach the button event handlers
		// *********************************
		root.findViewById(R.id.dashboard_schedule).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				startActivity(new Intent(Intent.ACTION_VIEW, DogshowContract.EnteredRings.CONTENT_URI));
			}

		});

		root.findViewById(R.id.dashboard_doghouse).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				startActivity(new Intent(Intent.ACTION_VIEW, DogshowContract.Dogs.CONTENT_URI));
			}

		});
		if (BuildConfig.DEBUG) {
			View view = root.findViewById(R.id.dashboard_handlers);
			view.setOnClickListener(new View.OnClickListener() {
				public void onClick(View view) {
					Intent intent = new Intent(Intent.ACTION_VIEW, DogshowContract.Handlers.CONTENT_URI);
					startActivity(intent);
				}

			});
			view.setVisibility(View.VISIBLE);
		}
//		root.findViewById(R.id.dashboard_find_show).setOnClickListener(new View.OnClickListener() {
//			public void onClick(View view) {
//				Intent intent = new Intent(getActivity(), ShowSetupActivity.class);
//				intent.setData(DogshowContract.Dogs.CONTENT_URI);
//				startActivity(intent);
//			}
//
//		});
		return root;
	}

}
