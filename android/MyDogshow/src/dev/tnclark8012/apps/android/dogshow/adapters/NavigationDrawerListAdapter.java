package dev.tnclark8012.apps.android.dogshow.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NavigationDrawerListAdapter extends ArrayAdapter<String> {

	private int selectedItem;
	private int mTextViewResourceId;

	public NavigationDrawerListAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
		super(context, resource, textViewResourceId, objects);
		mTextViewResourceId = textViewResourceId;
	}

	public void selectItem(int position) {
		selectedItem = position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = super.getView(position, convertView, parent);
		((TextView) convertView.findViewById(mTextViewResourceId)).setTypeface(null, position == selectedItem ? Typeface.BOLD : Typeface.NORMAL);

		return convertView;
	}

}
