package dev.tnclark8012.apps.android.dogshow.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public class YesNoDialog extends DialogFragment {
	public interface Callback {
		void onFinishDialog(int status, Bundle args);
	}

	public static final String BUNDLE_KEY_TITLE = "title";
	public static final String BUNDLE_KEY_MESSAGE = "message";
	private Callback mCallback = null;
	public static final int STATUS_NO = -1;
	public static final int STATUS_YES = 1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		final Bundle args = getArguments();
		return new AlertDialog.Builder(getActivity()).setTitle(args.getString(BUNDLE_KEY_TITLE)).setMessage(args.getString(BUNDLE_KEY_MESSAGE)).setNegativeButton(android.R.string.no, new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				if (mCallback != null)
					mCallback.onFinishDialog(STATUS_NO, args);
			}
		}).setPositiveButton(android.R.string.yes, new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				if (mCallback != null)
					mCallback.onFinishDialog(STATUS_YES, args);
			}
		}).create();
	}

	public void setCallback(Callback callback) {
		mCallback = callback;
	}
	
	@Override
	public void onDestroyView() {
	  if (getDialog() != null && getRetainInstance())
	    getDialog().setDismissMessage(null);
	  super.onDestroyView();
	}
	public static YesNoDialog newInstance( Bundle args, Callback callback)
	{
		YesNoDialog f = new YesNoDialog();
		f.setArguments(args);
		f.setCallback(callback);
		return f;
	}
	public static YesNoDialog newInstance(String title, String message, Callback callback) {
		Bundle b = new Bundle();
		b.putString(BUNDLE_KEY_TITLE, title);
		b.putString(BUNDLE_KEY_MESSAGE, message);
		YesNoDialog f = new YesNoDialog();
		f.setArguments(b);
		f.setCallback(callback);
		return f;
	}
}