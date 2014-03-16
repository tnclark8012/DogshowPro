package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import dev.tnclark8012.apps.android.dogshow.BuildConfig;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;

public class DashboardFragment extends Fragment {
	/**
	 * Logger Tag
	 */
	public static final String TAG = "DashboardAcitivy";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// *****************************
		// Inflate the root view for the
		// dashboard
		// *****************************
		View root = inflater.inflate(R.layout.home_next, container, false);

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
		// root.findViewById(R.id.dashboard_find_show).setOnClickListener(new View.OnClickListener() {
		// public void onClick(View view) {
		// Intent intent = new Intent(getActivity(), ShowSetupActivity.class);
		// intent.setData(DogshowContract.Dogs.CONTENT_URI);
		// startActivity(intent);
		// }
		//
		// });
		return root;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.dashboard, menu);
		if (!Prefs.isSyncEnabled(getActivity())) {
			menu.findItem(R.id.menu_sync).setVisible(false).setEnabled(false);
			menu.findItem(R.id.menu_sign_out).setVisible(false).setEnabled(false);
		}
	}

}
