package dev.tnclark8012.apps.android.dogshow.ui;

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
import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamResponse;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class ShowTeamCreateFragment extends Fragment {
	public interface Callback {
		void onCreateFinish(int status, String teamName);
	}

	private Callback mCallback = null;
	private static final String TAG = ShowTeamCreateFragment.class
			.getSimpleName();

	private EditText mNameEditText;
	private EditText mPasswordText;
	private EditText mPasswordConfirmText;
	private TextView mErrorText;
	public static final int STATUS_BACK = 0;
	public static final int STATUS_FAIL = -1;
	public static final int STATUS_SUCCESS = 1;
	private View mProgressLayout;
	private TextView mProgressMessage;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_team_create, null);
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
						mCallback.onCreateFinish(STATUS_BACK, null);
					}
				});
		mNameEditText = (EditText) view.findViewById(R.id.edit_show_team_name);
		mPasswordText = (EditText) view
				.findViewById(R.id.edit_show_team_password);
		mPasswordConfirmText = (EditText) view
				.findViewById(R.id.edit_show_team_confirm_password);
		mErrorText = (TextView) view.findViewById(R.id.text_error);
		mProgressLayout = view.findViewById(R.id.indeterminate_progress);
		((TextView) mProgressLayout.findViewById(R.id.text_progress_title))
				.setText(R.string.progress_title_creating_team);
		mProgressMessage = ((TextView) mProgressLayout
				.findViewById(R.id.text_progress_message));
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
			}
			if (!password.equals(mPasswordConfirmText.getText().toString())) {
				mErrorText.setText("Passwords do not match");
			} else {
				mProgressLayout.setVisibility(View.VISIBLE);
				mErrorText.setText("");
				new AsyncTask<String, Integer, ShowTeamResponse>() {// TODO
																	// move
																	// me
					// outside
					@Override
					protected ShowTeamResponse doInBackground(String... params) {
						IApiAccessor accessor = ApiAccessor
								.getInstance(getActivity());
						ShowTeamResponse response = accessor.createShowTeam(
								AccountUtils.getUserIdentifier(getActivity()),
								params[0], params[1]);
						publishProgress(response.statusCode);
						if (isCancelled()) {
							return null;
						} else {
							Prefs.setCurrentTeamIdentifier(getActivity(),
									response.identifier);
							SyncHelper.requestManualSync(getActivity(),
									AccountUtils
											.getChosenAccount(getActivity()));
							return response;
						}
					}

					protected void onProgressUpdate(Integer... values) {
						int status = handleResponse(values[0]);
						if (status != STATUS_SUCCESS) {
							cancel(true);
						}
					};

					protected void onPostExecute(ShowTeamResponse response) {
						mProgressLayout.setVisibility(View.GONE);
						if (mCallback != null) {
							mCallback.onCreateFinish(STATUS_SUCCESS,
									response.teamName);
						}
					};
				}.execute(teamName, password);
			}
		}
	}

	private int handleResponse(int statusCode) {
		int status = (statusCode == 200) ? STATUS_SUCCESS : STATUS_FAIL;
		if (status == STATUS_SUCCESS) {
			mProgressMessage
					.setText(R.string.progress_message_joining_team_sync);
			return STATUS_SUCCESS;
		} else {
			mProgressLayout.setVisibility(View.GONE);
			switch (statusCode) {
			case 403:
				mErrorText.setText("Forbidden. Have you signed in?");
				break;
			case 409:
				mErrorText
						.setText("Sorry! A team with that name already exists. Try something else.");
				break;
			default:
				mErrorText.setText("Invalid team name / password");
			}
			return STATUS_FAIL;
		}
	}

	public void setCallback(Callback callback) {
		mCallback = callback;
	}

	public static ShowTeamCreateFragment newInstance() {
		return new ShowTeamCreateFragment();
	}

	public static ShowTeamCreateFragment newInstance(Callback callback) {
		ShowTeamCreateFragment f = new ShowTeamCreateFragment();
		f.setCallback(callback);
		return f;
	}
}
