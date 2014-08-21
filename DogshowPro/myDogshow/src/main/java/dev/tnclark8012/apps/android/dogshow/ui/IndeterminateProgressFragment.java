package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dev.tnclark8012.apps.android.dogshow.R;

public class IndeterminateProgressFragment extends Fragment {
	TextView mMessage;

	public static IndeterminateProgressFragment newInstance(int titleId,
			int waitMessageId) {
		IndeterminateProgressFragment f = new IndeterminateProgressFragment();
		Bundle b = new Bundle();
		b.putInt("title", titleId);
		b.putInt("message", waitMessageId);
		f.setArguments(b);
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Bundle args = getArguments();
		View root = inflater.inflate(R.layout.fragment_indeterminate_progress,
				container, false);
		mMessage = (TextView) root.findViewById(R.id.text_progress_message);
		mMessage.setText(args.getInt("message"));
		((TextView) root.findViewById(R.id.text_progress_title)).setText(args
				.getInt("title"));
		return root;
	}

	public void setMessage(String text) {
		mMessage.setText(text);
	}

	public void setMessage(int textResId) {
		mMessage.setText(textResId);
	}
}
