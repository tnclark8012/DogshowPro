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

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamResponse;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class ShowTeamJoinFragment extends Fragment {
	public interface Callback {
		void onJoinFinish(int status, String teamName, String teamIdentifier);
	}

	private Callback mCallback = null;
	private static final String TAG = makeLogTag(ShowTeamJoinFragment.class);

	private EditText mNameEditText;
	private EditText mPasswordText;
	private TextView mErrorText;
	public static final int STATUS_BACK = 0;
	public static final int STATUS_FAIL = -1;
	public static final int STATUS_SUCCESS = 1;
	private View mProgressLayout;
	private TextView mProgressMessage;
	private String mTeamName;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_team_join, container, false);
		view.findViewById(R.id.button_bar_button_right)
				.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        verifyInput();
                    }
                });
		view.findViewById(R.id.button_bar_button_left)
				.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCallback.onJoinFinish(STATUS_BACK, null, null);
                    }
                });
		mNameEditText = (EditText) view.findViewById(R.id.edit_show_team_name);
		mPasswordText = (EditText) view
				.findViewById(R.id.edit_show_team_password);
		mErrorText = (TextView) view.findViewById(R.id.text_error);
		mProgressLayout = view.findViewById(R.id.indeterminate_progress);
		((TextView) mProgressLayout.findViewById(R.id.text_progress_title))
				.setText(R.string.progress_title_joining_team);
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
			} else {
				mProgressLayout.setVisibility(View.VISIBLE);
				mErrorText.setText("");
				mTeamName = teamName;
				new AsyncTask<String, Integer, ShowTeamResponse>() {// TODO move
																	// me
																	// //
																	// outside
					@Override
					protected ShowTeamResponse doInBackground(String... params) {
						ShowTeamResponse response = ApiAccessor.getInstance(
								getActivity()).joinShowTeam(
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
					}

                    protected void onPostExecute(ShowTeamResponse response) {
						mProgressLayout.setVisibility(View.GONE);
						if (mCallback != null) {
							mCallback.onJoinFinish(STATUS_SUCCESS,
									response.teamName, response.identifier);
						}
					}
                }.execute(mTeamName, password);
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
			case 404:
				mErrorText.setText(getString(R.string.error_team_doesnt_exist,
						mTeamName));
				break;
			case 403:
				mErrorText.setText("Forbidden. Have you signed in?");
				break;
			case 401:
				mErrorText.setText("Invlid team name / password");
				break;
			case 409:
				mErrorText.setText("You're already a member of " + mTeamName);
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

	public static ShowTeamJoinFragment newInstance() {
		return new ShowTeamJoinFragment();
	}

	public static ShowTeamJoinFragment newInstance(Callback callback) {
		ShowTeamJoinFragment f = new ShowTeamJoinFragment();
		f.setCallback(callback);
		return f;
	}
}
