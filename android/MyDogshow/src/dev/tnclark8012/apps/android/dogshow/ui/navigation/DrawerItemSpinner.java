package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.List;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Spinner;
import dev.tnclark8012.apps.android.dogshow.R;

public class DrawerItemSpinner extends NonNavigationDrawerItem {

	public DrawerItemSpinner(List<SpinnerItem> items,
			OnClickListener spinnerClickListener) {
		super(R.layout.drawer_item_spinner, IGNORE_RESOURCE, null,
				spinnerClickListener);
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
		return convertView;
	}

	private static class DrawerItemSpinnerViewHolder extends
			DrawerItemViewHolder {
		Spinner spinner;
	}
}
