package dev.tnclark8012.apps.android.dogshow.ui.dialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class ShowTeamDialog extends DialogFragment implements OnClickListener {
	public interface Callback {
		void onFinishDialog(int status, String teamName, String password);
	}

	private EditText mNameEditText;
	private EditText mPasswordText;
	private EditText mPasswordConfirmText;
	private TextView mErrorText;
	private Callback mCallback = null;
	public static final int STATUS_CANCELLED = -1;
	public static final int STATUS_SAVE = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Bundle args = getArguments();
		View view = inflater.inflate(R.layout.dialog_show_team, container);
		mNameEditText = (EditText) view.findViewById(R.id.edit_text_show_name);
		mPasswordText = (EditText) view.findViewById(R.id.edit_text_show_password);
		mPasswordConfirmText = (EditText) view.findViewById(R.id.edit_text_team_password_confirm);
		if (args == null) {

		} else {
			getDialog().setTitle("Create Team");
		}

		view.findViewById(R.id.dialog_save).setOnClickListener(this);
		view.findViewById(R.id.dialog_cancel).setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		if (mCallback != null) {
			switch (v.getId()) {
			case R.id.dialog_save: {
				String password = mPasswordText.getText().toString();
				if (password.equals(mPasswordConfirmText.getText().toString())) {
					mErrorText.setVisibility(View.GONE);
					mCallback.onFinishDialog(STATUS_SAVE, mNameEditText.getText().toString(), password);
				} else {
					mErrorText.setVisibility(View.VISIBLE);
				}
				break;
			}
			case R.id.dialog_cancel: {
				// mCallback.onFinishDialog(STATUS_CANCELLED, null, null);
				break;
			}
			}
		}
		this.dismiss();
	}

	public void setCallback(Callback callback) {
		mCallback = callback;
	}

	public static ShowTeamDialog newInstance()
	{
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