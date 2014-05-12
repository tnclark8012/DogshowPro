package dev.tnclark8012.apps.android.dogshow.ui;

import java.util.HashMap;
import java.util.Map;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamResponse;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class ShowTeamJoinFragment extends Fragment {
	public interface Callback {
		void onJoinFinish(int status, String teamName);
	}

	private Callback mCallback = null;
	private static final String TAG = ShowTeamJoinFragment.class
			.getSimpleName();

	private EditText mNameEditText;
	private EditText mPasswordText;
	private TextView mErrorText;
	public static final int STATUS_BACK = 0;
	public static final int STATUS_FAIL = -1;
	public static final int STATUS_SUCCESS = 1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_team_join, null);
		((Button) view.findViewById(R.id.button_bar_button_right))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						verifyInput();
					}
				});
		((Button) view.findViewById(R.id.button_bar_button_left))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						mCallback.onJoinFinish(STATUS_BACK, null);
					}
				});
		mNameEditText = (EditText) view.findViewById(R.id.edit_show_team_name);
		mPasswordText = (EditText) view
				.findViewById(R.id.edit_show_team_password);
		mErrorText = (TextView) view.findViewById(R.id.text_error);
		return view;
	}

	private void verifyInput() {
		final String teamName = mNameEditText.getText().toString();
		if (Utils.isNullOrEmpty(teamName)) {
			mErrorText.setText("Team name cannot be empty");
			mErrorText.setVisibility(View.VISIBLE);
		} else {
			mErrorText.setText("");
			final String password = mPasswordText.getText().toString();
			if (Utils.isNullOrEmpty(password)) {
				mErrorText.setText("Enter a password");
			} else {
				mErrorText.setText("");
				new AsyncTask<String, Void, ShowTeamResponse>() {// TODO move me
																	// outside
					@Override
					protected ShowTeamResponse doInBackground(String... params) {
						return ApiAccessor
								.getInstance(getActivity())
								.createShowTeam(
										AccountUtils
												.getUserIdentifier(getActivity()),
										params[0], params[1]);
					}

					protected void onPostExecute(ShowTeamResponse response) {
						int status = ShowTeamJoinFragment.this
								.handleResponse(response);
						if (status == STATUS_SUCCESS) {
							mCallback.onJoinFinish(STATUS_SUCCESS,
									response.teamName);
						}
					};
				}.execute(teamName, password);
			}
		}
	}

	private int handleResponse(ShowTeamResponse response) {
		if (response != null) {
			int status = (response.statusCode == 200) ? STATUS_SUCCESS
					: STATUS_FAIL;
			if (status == STATUS_SUCCESS) {
				PersistHelper helper = new PersistHelper(getActivity());
				Map<String, Object> values = new HashMap<String, Object>();
				values.put(ShowTeams.SHOW_TEAM_STATE, response.state);
				values.put(ShowTeams.ENTERED_SHOW, response.enteredShow);
				values.put(ShowTeams.SHOW_TEAM_NAME, response.teamName);
				values.put(ShowTeams.SHOW_TEAM_ID, response.identifier);
				helper.createEntity(ShowTeams.CONTENT_URI, values);
				mErrorText.setText("Success!");
				return STATUS_SUCCESS;
			} else {

				switch (response.statusCode) {
				case 404:
					mErrorText.setText(response.teamName
							+ " doesn't exist. Go ahead and create it!");
					break;
				case 403:
					mErrorText.setText("Forbidden. Have you signed in?");
					break;
				case 401:
					mErrorText.setText("Invlid team name / password");
					break;
				case 409:
					mErrorText.setText("You're already a member of "
							+ response.teamName);
					break;
				default:
					mErrorText.setText("Invalid team name / password");
				}
				return STATUS_FAIL;
			}
		} else {
			mErrorText.setText("Oops! Something went wrong :'(");
			return STATUS_FAIL;
		}
	}

	public void setCallback(Callback callback) {
		mCallback = callback;
	}

	public static ShowTeamJoinFragment newInstance() {
		return new ShowTeamJoinFragment();
	}

	public static ShowTeamJoinFragment newInstance(Callback callback) {
		ShowTeamJoinFragment f = new ShowTeamJoinFragment();
		f.setCallback(callback);
		return f;
	}
}
