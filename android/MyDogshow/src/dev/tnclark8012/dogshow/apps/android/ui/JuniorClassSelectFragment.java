package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;

public class JuniorClassSelectFragment extends ListFragment {
	private static final String TAG = JuniorClassSelectFragment.class.getSimpleName();

	public interface Callback {
		public void onJuniorClassSelected(JuniorClass juniorClass);
	}

	private Callback mListener;
	private JuniorClass[] classes = JuniorClass.values();

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		String[] classNames = new String[1 + classes.length];
		classNames[0] = "None";
		for (int i = 0; i < classes.length; i++) {
			classNames[i+1] = classes[i].getPrimaryName();
		}
		
		setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, classNames));
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Log.v(TAG, "clicked position " + position);
		if (mListener != null) {
			mListener.onJuniorClassSelected((position == 0) ? null : classes[position-1]);
			
		}
	}

	public void setCallbackListener(Callback listener) {
		mListener = listener;
	}
}
