package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.view.View.OnClickListener;
import dev.tnclark8012.apps.android.dogshow.R;

public class DrawerItemNavigation extends NavigationDrawerItem {
	public DrawerItemNavigation(String text, OnClickListener clickListener) {
		super(R.layout.drawer_item_major, R.id.drawer_item_text1, text,
				clickListener);
	}

	public DrawerItemNavigation(String text) {
		this(text, null);
	}
}
