package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;

public class DrawerItemSpinner extends NonNavigationDrawerItem {

	private List<SpinnerItem> mItems;

	public DrawerItemSpinner(List<SpinnerItem> items) {
		super(R.layout.drawer_item_spinner, IGNORE_RESOURCE, null);
		mItems = items;
	}

	@Override
	protected DrawerItemViewHolder getViewHolder() {
		return new DrawerItemSpinnerViewHolder();
	}
	

	@Override
	public View getCustomView(int position, int totalItems, View convertView, ViewGroup parent) {
		convertView.setClickable(true);
		convertView.setFocusable(true);
		DrawerItemSpinnerViewHolder holder = (DrawerItemSpinnerViewHolder) convertView
				.getTag();

		if( holder.spinner == null )
		{
			holder.spinner = (Spinner) convertView.findViewById(R.id.drawerSpinner);
		}
		CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(
				parent.getContext(), R.layout.spinner_item_team, mItems);

		holder.spinner.setAdapter(adapter);

		holder.spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(arg1.getContext(), "User Changed",
						Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});
		return convertView;
	}

	private static class DrawerItemSpinnerViewHolder extends
			DrawerItemViewHolder {
		Spinner spinner;
	}
}
