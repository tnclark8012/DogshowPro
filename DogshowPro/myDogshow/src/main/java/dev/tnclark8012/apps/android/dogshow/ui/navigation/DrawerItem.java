package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;

public abstract class DrawerItem implements Checkable, OnClickListener {

	public static final int TYPE_SPINNER = 0;
	public static final int TYPE_MAJOR = 1;
	public static final int TYPE_MINOR = 2;
	protected String mText;
	protected int mTextResId;
	protected int mLayoutResId;
	protected View mView;
	public static final int IGNORE_RESOURCE = -1;
	private OnClickListener mClickListener;

	public DrawerItem(int layoutResId, int textResId, String text,
			OnClickListener clickListener) {
		this(layoutResId, textResId, text);
		mClickListener = clickListener;
	}

	public DrawerItem(int layoutResId, int textResId, String text) {
		mText = text;
		mTextResId = textResId;
		mLayoutResId = layoutResId;
	}

	int getLayoutResId() {
		return mLayoutResId;
	}

	public final View getView(LayoutInflater inflater, int position,
			int totalItems, View convertView, ViewGroup parent) {
		View view = convertView;
		DrawerItemViewHolder holder = getViewHolder();
		if (view != null) {
			holder = (DrawerItemViewHolder) view.getTag();
		}

		if (view == null || holder == null || holder.layoutId != mLayoutResId) {
			view = inflater.inflate(mLayoutResId, parent, false);
			holder.layoutId = mLayoutResId;
			if (mTextResId != IGNORE_RESOURCE) {
				holder.textView = (TextView) view.findViewById(mTextResId);
			}
		}
		if (mTextResId != IGNORE_RESOURCE) {
			holder.textView.setText(mText);
		}
		view.setTag(holder);
		view.setFocusable(true);
		view.setClickable(true);
		mView = getCustomView(position, totalItems, view, parent);
		return mView;
	}

	protected DrawerItemViewHolder getViewHolder() {
		return new DrawerItemViewHolder();
	}

	protected View getCustomView(int position, int totalItems,
			View convertView, ViewGroup parent) {
		return convertView;
	}

	protected static class DrawerItemViewHolder {
		int layoutId;
		TextView textView;
	}

	public final void onClick() {
		onClick(mView);
	}

	@Override
	public final void onClick(View v) {
		if (mClickListener != null) {
			mClickListener.onClick(v);
		}
	}
}
