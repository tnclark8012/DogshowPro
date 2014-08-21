package dev.tnclark8012.apps.android.dogshow.ui.dialog;

import android.app.DialogFragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamResponse;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class ShowTeamDialog extends DialogFragment implements OnClickListener {
	public interface Callback {
		void onFinishDialog(int status, String teamName);
	}

	private EditText mNameEditText;
	private EditText mPasswordText;
	private EditText mPasswordConfirmText;
	private TextView mErrorText;
	private Callback mCallback = null;
	public static final int STATUS_CANCELLED = 0;
	public static final int STATUS_FAIL = -1;
	public static final int STATUS_SUCCESS = 1;
	public static final String KEY_MODE = "mode";
	public static final int MODE_JOIN = 0;
	public static final int MODE_CREATE = 1;
	private int mMode = -1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Bundle args = getArguments();
		View view = inflater.inflate(R.layout.dialog_show_team, container);
		mNameEditText = (EditText) view.findViewById(R.id.edit_text_show_name);
		mPasswordText = (EditText) view.findViewById(R.id.edit_text_show_password);
		mPasswordConfirmText = (EditText) view.findViewById(R.id.edit_text_team_password_confirm);
		mErrorText = (TextView) view.findViewById(R.id.message_team_error);
		mMode = args.getInt(KEY_MODE, -1);
		switch (mMode) {
		case MODE_JOIN:
			getDialog().setTitle("Join Team");
			mPasswordConfirmText.setVisibility(View.GONE);
			view.findViewById(R.id.lbl_team_password_confirm).setVisibility(View.GONE);
			break;
		case MODE_CREATE:
			getDialog().setTitle("Create Team");
			break;
		default:
			throw new RuntimeException("Unknown mode for show team dialog! Use either MODE_CREATE or MODE_JOIN");
		}

		view.findViewById(R.id.dialog_ok).setOnClickListener(this);
		view.findViewById(R.id.dialog_cancel).setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.dialog_ok: {
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
				if (mMode == MODE_CREATE && !password.equals(mPasswordConfirmText.getText().toString())) {
					mErrorText.setText("Passwords do not match");
				} else {

					mErrorText.setText("");
					new AsyncTask<String, Void, ShowTeamResponse>() {// TODO move me outside
						@Override
						protected ShowTeamResponse doInBackground(String... params) {
							if (mMode == MODE_CREATE) {
								return ApiAccessor.getInstance(getActivity()).createShowTeam(AccountUtils.getUserIdentifier(getActivity()), params[0], params[1]);
							} else {
								return ApiAccessor.getInstance(getActivity()).joinShowTeam(AccountUtils.getUserIdentifier(getActivity()), params[0], params[1]);
							}
						}

						protected void onPostExecute(ShowTeamResponse response) {
							int status = ShowTeamDialog.this.handleResponse(response);
							if (mCallback != null) {
								mCallback.onFinishDialog(status, response.teamName);
							}
							if (status == STATUS_SUCCESS) {
								dismiss();
							}
						}
                    }.execute(teamName, password);
				}
			}
			break;
		}
		case R.id.dialog_cancel: {
			if (mCallback != null) {
				mCallback.onFinishDialog(STATUS_CANCELLED, null);
			}
			dismiss();
			break;
		}
		}
	}

	private int handleResponse(ShowTeamResponse response) {
		if (response != null) {
			int status = (response.statusCode == 200) ? STATUS_SUCCESS : STATUS_FAIL;
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
					mErrorText.setText(response.teamName + " doesn't exist. Go ahead and create it!");
					break;
				case 403:
					mErrorText.setText("Forbidden. Have you signed in?");
					break;
				case 401:
					mErrorText.setText("Invlid team name / password");
					break;
				case 409:
					if (mMode == MODE_CREATE) {
						mErrorText.setText("Sorry! A team with that name already exists. Try something else.");
					} else {
						mErrorText.setText("You're already a member of " + response.teamName);
					}
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

	public static ShowTeamDialog newInstance() {
		return new ShowTeamDialog();
	}

	public static ShowTeamDialog newInstance(String name, Callback callback) {
		Bundle b = new Bundle();
		ShowTeamDialog f = new ShowTeamDialog();
		f.setArguments(b);
		f.setCallback(callback);
		return f;
	}
}