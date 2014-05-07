package dev.tnclark8012.apps.android.dogshow.ui.base;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;

public abstract class ButtonBarFragment extends Fragment {

	private static final String TAG = ButtonBarFragment.class.getSimpleName();
	public static final String EXTRA_LEFT_BUTTON_TEXT = "left_button_text";
	public static final String EXTRA_RIGHT_BUTTON_TEXT = "right_button_text";
	private String mLeftButtonText;
	private String mRightButtonText;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mLeftButtonText = getArguments().getString(EXTRA_LEFT_BUTTON_TEXT,
				getString(R.string.button_back));
		mRightButtonText = getArguments().getString(EXTRA_RIGHT_BUTTON_TEXT,
				getString(R.string.button_next));
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		Button left = (Button) view.findViewById(R.id.button_bar_button_left);
		left.setText(mLeftButtonText);
		left.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				onLeftClick();
			}
		});
		Button right = (Button) view.findViewById(R.id.button_bar_button_right);
		right.setText(mRightButtonText);
		right.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				onRightClick();
			}
		});
	}

	protected void onLeftClick() {
		Toast.makeText(getActivity(), "Left", Toast.LENGTH_SHORT).show();
	}

	protected void onRightClick() {
		Toast.makeText(getActivity(), "Join", Toast.LENGTH_SHORT).show();
	}
}
