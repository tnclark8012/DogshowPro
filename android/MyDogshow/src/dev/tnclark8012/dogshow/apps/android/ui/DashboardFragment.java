package dev.tnclark8012.dogshow.apps.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;

public class DashboardFragment extends SherlockFragment
{
	/**
	 * Logger Tag
	 */
	public static final String TAG = "DashboardAcitivy";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// *****************************
		// Inflate the root view for the
		// dashboard
		// *****************************
		View root = inflater.inflate(R.layout.dashboard, container);

		// **********************************
		// Attach the button event handlers
		// *********************************
		root.findViewById(R.id.schedule).setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view)
			{
					Intent intent = new Intent(getActivity(), ScheduleActivity.class);
					startActivity(intent);
			}

		});

		root.findViewById(R.id.doghouse).setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view)
			{
				startActivity(new Intent(Intent.ACTION_VIEW,
		                DogshowContract.Dogs.CONTENT_URI));
//					startActivity(intent);
			}

		});

		root.findViewById(R.id.handlers).setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view)
			{
					Intent intent = new Intent(getActivity(), HandlerActivity.class);
					startActivity(intent);
			}

		});
		return root;
	}

}
