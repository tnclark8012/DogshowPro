package dev.tnclark8012.dogshow.apps.android.ui.dialog;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import com.actionbarsherlock.app.SherlockDialogFragment;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.util.Utils;

public class EditJudgeTimeDialog extends SherlockDialogFragment implements OnEditorActionListener {
	public interface EditJudgeTimeDialogListener {
		void onFinishEditDialog(float enteredMinutes);
	}

	private EditText mEditText;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.dialog_schedule_edit_judge_time, container);
		mEditText = (EditText) view.findViewById(R.id.txt_time);
		getDialog().setTitle("[Title]");
		return view;
	}

	@Override
	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		if (EditorInfo.IME_ACTION_DONE == actionId) {
			// Return input text to activity
			EditJudgeTimeDialogListener activity = (EditJudgeTimeDialogListener) getActivity();
			activity.onFinishEditDialog(Utils.parseSafely(mEditText.getText().toString(), -1f));
			this.dismiss();
			return true;
		}
		return false;
	}

}