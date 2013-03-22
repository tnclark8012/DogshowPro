package dev.tnclark8012.dogshow.apps.android.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;
import dev.tnclark8012.dogshow.shared.BreedGroup;

public class BreedAdapter extends ArrayAdapter<String> {

	public BreedAdapter(Context context, BreedGroup group) {
		super(context, android.R.layout.simple_list_item_1, group.getBreedNames());

	}

	public BreedAdapter(Context context, int layoutResoureId,
			int textViewResourceId, String[] objects) {
		super(context, layoutResoureId, textViewResourceId, objects);
	}

}
