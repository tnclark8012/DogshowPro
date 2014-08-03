package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.view.View;
import android.view.ViewGroup;
import dev.tnclark8012.apps.android.dogshow.R;

public class DrawerItemHeader extends NonNavigationDrawerItem{
	public DrawerItemHeader(String text) {
		super(R.layout.drawer_item_header, R.id.drawer_item_text1, text, null);
	}
	
	@Override
	public View getCustomView(int position, int totalItems, View convertView, ViewGroup parent) {
		convertView.setClickable(false);
		convertView.setFocusable(false);
		return convertView;
	}
}
