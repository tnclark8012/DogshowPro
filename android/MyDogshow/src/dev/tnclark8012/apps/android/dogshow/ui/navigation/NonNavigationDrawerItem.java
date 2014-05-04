package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.view.View.OnClickListener;

public class NonNavigationDrawerItem extends DrawerItem {

	public NonNavigationDrawerItem(int layoutResId, int textResId, String text,
			OnClickListener clickListener) {
		super(layoutResId, textResId, text, clickListener);
	}

	public NonNavigationDrawerItem(int layoutResId, int textResId, String text) {
		super(layoutResId, textResId, text, null);
	}

	@Override
	public void setChecked(boolean checked) {
	}

	@Override
	public boolean isChecked() {
		return false;
	}

	@Override
	public void toggle() {
	}

}
