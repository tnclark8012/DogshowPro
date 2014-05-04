package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import dev.tnclark8012.apps.android.dogshow.R;

public class DrawerItemOption extends NonNavigationDrawerItem {
	public DrawerItemOption(String text, OnClickListener clickListener) {
		super(R.layout.drawer_item_minor, R.id.drawer_item_text1, text,
				clickListener);
	}

	public DrawerItemOption(String text) {
		this(text, null);
	}

	@Override
	protected View getCustomView(int position, int totalItems,
			View convertView, ViewGroup parent) {
		convertView
				.findViewById(R.id.drawer_item_minor_bottom_divider)
				.setVisibility(
						(position == totalItems - 1) ? View.VISIBLE : View.GONE);
		return convertView;
	}
}
