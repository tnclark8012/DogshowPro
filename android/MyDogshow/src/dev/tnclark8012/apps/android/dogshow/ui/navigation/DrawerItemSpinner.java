package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.List;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Spinner;
import dev.tnclark8012.apps.android.dogshow.R;

public class DrawerItemSpinner extends NonNavigationDrawerItem {

	private List<SpinnerItem> mItems;

	public DrawerItemSpinner(List<SpinnerItem> items,
			OnClickListener spinnerClickListener) {
		super(R.layout.drawer_item_spinner, IGNORE_RESOURCE, null,
				spinnerClickListener);
		mItems = items;
	}

	public DrawerItemSpinner(List<SpinnerItem> items) {
		this(items, null);
	}

	@Override
	protected DrawerItemViewHolder getViewHolder() {
		return new DrawerItemSpinnerViewHolder();
	}

	@Override
	public View getCustomView(int position, int totalItems, View convertView,
			ViewGroup parent) {
		convertView.setClickable(true);
		convertView.setFocusable(true);
		DrawerItemSpinnerViewHolder holder = (DrawerItemSpinnerViewHolder) convertView
				.getTag();

		if (holder.spinner == null) {
			holder.spinner = (Spinner) convertView
					.findViewById(R.id.drawerSpinner);
		}
		CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(
				parent.getContext(), R.layout.spinner_item_team, mItems);

//		holder.spinner.setAdapter(new ShowTeamSpinnerAdapter(parent
//				.getContext(), null, false));
//
//		holder.spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
//
//			@Override
//			public void onItemSelected(AdapterView<?> adapter, View view,
//					int position, long id) {
//				// new
//				// PersistHelper(view.getContext()).updateEntity(ShowTeams.CONTENT_URI,
//				// id, updateValues);
//			}
//
//			@Override
//			public void onNothingSelected(AdapterView<?> arg0) {
//				// TODO Auto-generated method stub
//
//			}
//		});
		return convertView;
	}

	private static class DrawerItemSpinnerViewHolder extends
			DrawerItemViewHolder {
		Spinner spinner;
	}
}
