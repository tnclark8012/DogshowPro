package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.graphics.Typeface;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.util.Typefaces;

public class NavigationDrawerItem extends DrawerItem {
	public NavigationDrawerItem(int layoutResId, int textResId, String text) {
		super(layoutResId, textResId, text);
	}

	private boolean mChecked;

	@Override
	public void setChecked(boolean checked) {
		mChecked = checked;
		DrawerItemViewHolder holder = (DrawerItemViewHolder) mView.getTag();
		if (checked) {
			holder.textView.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
		} else {
			holder.textView.setTypeface(Typefaces.SANS_SERIF_LIGHT);
		}
	}

	@Override
	public boolean isChecked() {
		return mChecked;
	}

	@Override
	public void toggle() {
		setChecked(!mChecked);
	}

}
