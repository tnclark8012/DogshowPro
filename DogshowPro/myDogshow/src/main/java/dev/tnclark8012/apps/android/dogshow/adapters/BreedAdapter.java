package dev.tnclark8012.apps.android.dogshow.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;
import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;

public class BreedAdapter extends ArrayAdapter<String> {
	private static final String TAG = BreedAdapter.class.getSimpleName();

	public BreedAdapter(Context context, BreedGroup group) {
		super(context, android.R.layout.simple_list_item_1, android.R.id.text1,
				group.getBreedNames());

	}

	public BreedAdapter(Context context, int layoutResoureId,
			int textViewResourceId, String[] objects) {
		super(context, layoutResoureId, textViewResourceId, objects);
	}

}
