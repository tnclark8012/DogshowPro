package dev.tnclark8012.apps.android.dogshow.ui.dialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;

public class ShowTeamChooserDialog extends DialogFragment implements
		OnClickListener {
	public interface Callback {
		void onFinishDialog(int status, String teamName);
	}

	private Callback mCallback = null;
	private ListView mListView;
	public static final int STATUS_CANCELLED = -1;
	public static final int STATUS_SELECT = 0;
	public static final int STATUS_ADD = 1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.dialog_choose_show_team,
				container);
		mListView = (ListView) view.findViewById(R.id.list_choose_show_team);
		mListView.setAdapter(new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_single_choice, new String[] {
						"Just Me", "Stellar", "Add Team" }));
		mListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

		mListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(getActivity(), "Clicked " + position,
						Toast.LENGTH_SHORT).show();
				if (position == parent.getCount() - 1) {
					if (mCallback != null) {
						mCallback.onFinishDialog(STATUS_ADD, null);
					}
					dismiss();
				}
			}
		});
		view.findViewById(R.id.dialog_ok).setOnClickListener(this);
		view.findViewById(R.id.dialog_cancel).setOnClickListener(this);
		getDialog().setTitle("Choose a team");

		return view;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.dialog_ok: {
			if (mCallback != null) {
				mCallback.onFinishDialog(STATUS_SELECT, null);
			}
			dismiss();
			break;
		}
		case R.id.dialog_cancel: {
			Toast.makeText(getActivity(), "Cancel", Toast.LENGTH_SHORT).show();
			if (mCallback != null) {
				mCallback.onFinishDialog(STATUS_CANCELLED, null);
			}
			dismiss();
			break;
		}
		}
	}

	public void setCallback(Callback callback) {
		mCallback = callback;
	}

	public static ShowTeamChooserDialog newInstance() {
		return new ShowTeamChooserDialog();
	}

	public static ShowTeamChooserDialog newInstance(String name,
			Callback callback) {
		Bundle b = new Bundle();
		ShowTeamChooserDialog f = new ShowTeamChooserDialog();
		f.setArguments(b);
		f.setCallback(callback);
		return f;
	}
}