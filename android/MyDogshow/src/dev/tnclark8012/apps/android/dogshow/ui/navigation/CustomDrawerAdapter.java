package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.util.SparseIntArray;
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
	SparseIntArray mPositionViewTypeMap;

	public CustomDrawerAdapter(Context context, int layoutResourceID,
			List<DrawerItem> listItems) {
		super(context, layoutResourceID, listItems);
		this.context = context;
		drawerItemList = listItems;
		totalItems = drawerItemList.size();
		this.layoutResID = layoutResourceID;
		mPositionViewTypeMap = new SparseIntArray(totalItems);// [position,
																// viewTypeId]
		int currentResId;
		SparseIntArray viewTypeResIdMap = new SparseIntArray();
		for (int i = 0; i < totalItems; i++) {
			currentResId = drawerItemList.get(i).getLayoutResId();
			if (viewTypeResIdMap.indexOfValue(currentResId) == -1) {
				// new resId
				viewTypeResIdMap.put(mViewTypeCount, currentResId);// [viewTypeId,
																	// resId]
				mViewTypeCount++;
			}
			mPositionViewTypeMap.put(i,
					viewTypeResIdMap.indexOfValue(currentResId));
		}
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
		return mPositionViewTypeMap.get(position);
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