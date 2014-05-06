package dev.tnclark8012.apps.android.dogshow.ui.dialog;

import java.util.HashMap;
import java.util.Map;

import android.app.DialogFragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamResponse;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class ShowTeamChooserDialog extends DialogFragment implements
		OnClickListener {
	public interface Callback {
		void onFinishDialog(int status, String teamName);
	}

	private EditText mNameEditText;
	private EditText mPasswordText;
	private EditText mPasswordConfirmText;
	private TextView mErrorText;
	private Callback mCallback = null;
	private ListView mListView;
	public static final int STATUS_CANCELLED = 0;
	public static final int STATUS_FAIL = -1;
	public static final int STATUS_SUCCESS = 1;
	public static final String KEY_MODE = "mode";
	public static final int MODE_JOIN = 0;
	public static final int MODE_CREATE = 1;
	private int mMode = -1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Bundle args = getArguments();
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
			Toast.makeText(getActivity(), "Ok", Toast.LENGTH_SHORT).show();
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