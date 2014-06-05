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
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class EditJudgeTimeDialog extends DialogFragment implements
		OnClickListener {
	public interface Callback {
		void onFinishEditDialog(int status, long id, int type, float minutes);
	}

	private EditText mEditText;
	private float mDefaultMinutes = -1;
	private long mId = -1;
	private int mRingType = -1;
	public static final String BUNDLE_KEY_ID = "id";
	public static final String BUNDLE_KEY_TIME = "time";
	public static final String BUNDLE_KEY_TYPE = "type";
	private Callback mCallback = null;
	public static final int STATUS_CANCELLED = -1;
	public static final int STATUS_SAVE = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Bundle args = getArguments();
		mId = args.getLong(BUNDLE_KEY_ID);
		mRingType = args.getInt(BUNDLE_KEY_TYPE);
		mDefaultMinutes = args.getFloat(BUNDLE_KEY_TIME);
		View view = inflater.inflate(R.layout.dialog_schedule_edit_judge_time,
				container);
		TextView directions = (TextView) view.findViewById(R.id.lbl_edit_time);
		if (mRingType == EnteredRings.TYPE_GROUP_RING) {
			directions.setText(R.string.instructions_judge_time_group);
		}
		mEditText = (EditText) view.findViewById(R.id.txt_time);
		mEditText.setText(String.valueOf(mDefaultMinutes));
		getDialog().setTitle("Adjust Estimated Ring Time");
		view.findViewById(R.id.dialog_ok).setOnClickListener(this);
		view.findViewById(R.id.dialog_cancel).setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		if (mCallback != null) {
			switch (v.getId()) {
			case R.id.dialog_ok: {
				mCallback.onFinishEditDialog(STATUS_SAVE, mId, mRingType, Utils
						.parseSafely(mEditText.getText().toString(),
								mDefaultMinutes));
				break;
			}
			case R.id.dialog_cancel: {
				mCallback.onFinishEditDialog(STATUS_CANCELLED, mId, mRingType,
						mDefaultMinutes);
				break;
			}
			}
		}
		this.dismiss();
	}

	public void setCallback(Callback callback) {
		mCallback = callback;
	}

	public static EditJudgeTimeDialog newInstance(long id,
			float defaultMinutes, Callback callback) {
		Bundle b = new Bundle();
		b.putFloat(BUNDLE_KEY_TIME, defaultMinutes);
		b.putLong(BUNDLE_KEY_ID, id);
		EditJudgeTimeDialog f = new EditJudgeTimeDialog();
		f.setArguments(b);
		f.setCallback(callback);
		return f;
	}
}