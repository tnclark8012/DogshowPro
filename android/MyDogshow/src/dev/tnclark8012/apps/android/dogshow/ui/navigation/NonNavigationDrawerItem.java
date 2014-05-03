package dev.tnclark8012.apps.android.dogshow.ui.navigation;

public class NonNavigationDrawerItem extends DrawerItem {

	public NonNavigationDrawerItem(int layoutResId, int textResId, String text) {
		super(layoutResId, textResId, text);
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
