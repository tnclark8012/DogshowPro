package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class CustomDrawerAdapter extends ArrayAdapter<DrawerItem> {
	public static final String TAG = CustomDrawerAdapter.class.getSimpleName();
	Context context;
	List<DrawerItem> drawerItemList;
	int layoutResID;
	int mViewTypeCount;
	int totalItems;

	public CustomDrawerAdapter(Context context, int layoutResourceID,
			List<DrawerItem> listItems) {
		super(context, layoutResourceID, listItems);
		this.context = context;
		this.drawerItemList = listItems;
		this.layoutResID = layoutResourceID;
		Set<Integer> viewTypes = new HashSet<Integer>();
		for (DrawerItem d : listItems) {
			viewTypes.add(d.getLayoutResId());
		}
		mViewTypeCount = viewTypes.size();
		totalItems = drawerItemList.size();
	}

	@Override
	public int getViewTypeCount() {
		return mViewTypeCount;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	@Override
	public int getItemViewType(int position) {
		return drawerItemList.get(position).getLayoutResId();
	}

	@Override
	public View getView(final int position, View convertView,
			final ViewGroup parent) {
		LayoutInflater inflater = ((Activity) context).getLayoutInflater();
		convertView = drawerItemList.get(position).getView(inflater, position,
				totalItems, convertView, parent);
		convertView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (drawerItemList.get(position) instanceof NavigationDrawerItem) {
					for (int i = 0; i < totalItems; i++) {
						drawerItemList.get(i).setChecked(i == position);
					}
				}
				drawerItemList.get(position).onClick(v);
			}
		});
		return convertView;
	}

}