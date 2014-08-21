package dev.tnclark8012.apps.android.dogshow.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
/**
 * Simple array adapter displaying the breed names in a breed group
 */
public class BreedAdapter extends ArrayAdapter<String> {
	public static final String TAG = makeLogTag(BreedAdapter.class);

	public BreedAdapter(Context context, BreedGroup group) {
		super(context, android.R.layout.simple_list_item_1, android.R.id.text1,
				group.getBreedNames());

	}

	public BreedAdapter(Context context, int layoutResoureId,
			int textViewResourceId, String[] objects) {
		super(context, layoutResoureId, textViewResourceId, objects);
	}

}
