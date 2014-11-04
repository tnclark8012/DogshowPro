package dev.tnclark8012.apps.android.dogshow.adapters;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.RingsQuery;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class     RingListAdapter extends CursorAdapter implements
		StickyListHeadersAdapter, SectionIndexer {
	public static final String TAG =  makeLogTag(RingListAdapter.class);
	private int[] mSectionIndices;
	private String[] mSectionHeaders;
	private int[] mSectionIds;
	private LayoutInflater mInflater;
	private Activity mActivity;

	public void setSections(int[] indices, String[] sectionHeaders,
			int[] sectionIds) {
		mSectionHeaders = sectionHeaders;
		mSectionIndices = indices;
		mSectionIds = sectionIds;
	}

	public RingListAdapter(Activity activity) {
		super(activity, null, false);
		mActivity = activity;
		mInflater = mActivity.getLayoutInflater();
	}

	static class ViewHolder {
		TextView titleView;
		TextView subtitleView;
		TextView ringNumberView;
		TextView ringStartView;
		TextView ringTimeView;
	}

	@Override
	public void bindView(View view, Context context, Cursor cursor) {
		ViewHolder holder = (ViewHolder) view.getTag();

		long blockTimeMillis = cursor.getLong(RingsQuery.BLOCK_START);
		// blockTimeMillis = new Date(blockTimeMillis).getTime();
		long estMillis = ((RingListCursorWrapper) cursor).getEstimatedStart();
		int ringType = cursor.getInt(RingsQuery.RING_TYPE);
		holder.subtitleView.setText(cursor.getString(RingsQuery.SUBTITLE));
		holder.titleView.setText(cursor.getString(RingsQuery.TITLE));
		if (ringType == EnteredRings.TYPE_GROUP_RING) {
			holder.ringNumberView.setVisibility(View.GONE);
			holder.ringStartView.setVisibility(View.GONE);
		} else {
			holder.ringNumberView.setVisibility(View.VISIBLE);
			holder.ringStartView.setVisibility(View.VISIBLE);
		}
		holder.ringNumberView.setText(mActivity.getString(
				R.string.template_ring_number,
				cursor.getInt(RingsQuery.RING_NUMBER)));
		holder.ringStartView.setText(String.format("(%s)",
				UIUtils.timeStringFromMillis(blockTimeMillis, true))
				+ " " + ((RingListCursorWrapper) cursor).getBreedCount());

		String time = String.format("%s\n%s",
				UIUtils.timeStringFromMillis(estMillis, false),
				UIUtils.timeAmPmFromMillis(estMillis));
		holder.ringTimeView.setText(time);
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		View view = mInflater.inflate(R.layout.list_item_ring_with_header,
				parent, false);
		ViewHolder holder = new ViewHolder();
		holder.titleView = ((TextView) view
				.findViewById(R.id.list_item_ring_title));
		holder.subtitleView = ((TextView) view
				.findViewById(R.id.list_item_ring_subtitle));
		holder.ringNumberView = ((TextView) view
				.findViewById(R.id.list_item_ring_number));
		holder.ringStartView = ((TextView) view
				.findViewById(R.id.list_item_ring_start));
		holder.ringTimeView = ((TextView) view
				.findViewById(R.id.list_item_ring_time));
		view.setTag(holder);
		return view;
	}

	@Override
	public View getHeaderView(int position, View convertView, ViewGroup parent) {
		TextView text;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.list_item_ring_header,
					parent, false);
			text = (TextView) convertView
					.findViewById(R.id.list_item_ring_header_date);
			convertView.setTag(text);
		} else {
			text = (TextView) convertView.getTag();
		}
		text.setText(mSectionHeaders[mSectionIds[position]]);
		return convertView;
	}

	@Override
	public long getHeaderId(int position) {
		return mSectionHeaders[mSectionIds[position]].hashCode();
	}

	@Override
	public int getPositionForSection(int section) {
		if (section >= mSectionIndices.length) {
			section = mSectionIndices.length - 1;
		} else if (section < 0) {
			section = 0;
		}
		return mSectionIndices[section];
	}

	//TODO isn't there a better data structure for this?
	@Override
	public int getSectionForPosition(int position) {
		for (int i = 0; i < mSectionIndices.length; i++) {
			if (position < mSectionIndices[i]) {
				return i - 1;
			}
		}
		return mSectionIndices.length - 1;
	}

	@Override
	public Object[] getSections() {
		return mSectionHeaders;
	}

}