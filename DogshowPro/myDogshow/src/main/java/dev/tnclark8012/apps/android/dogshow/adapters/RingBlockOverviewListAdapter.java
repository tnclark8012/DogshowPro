package dev.tnclark8012.apps.android.dogshow.adapters;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.RingBlockOverviewQuery;

/**
 * List adapter for ring block overviews. Use with {@link RingBlockOverviewQuery}. Because {@link RingBlockOverviewQuery.COUNT_AHEAD} is monotonically increasing,
 * you can pass a selectedCountAhead to highlight as bold. Rings are grouped by their judges.
 * {@inheritDoc}
 *
 */
public class RingBlockOverviewListAdapter extends CursorAdapter {
	private Activity mActivity;
	private int mSelectedCountAhead = -1;

	public RingBlockOverviewListAdapter(Activity activity, Cursor cursor,
			int selectedCountAhead) {
		super(activity, cursor, false);
		mActivity = activity;
		mSelectedCountAhead = selectedCountAhead;
	}

	private static class ViewHolder {
		TextView judgeView;
		TextView titleView;
	}


	@Override
	public void bindView(View view, Context context, Cursor cursor) {
		ViewHolder holder = (ViewHolder) view.getTag();
		String previousJudge = null;
		String currentJudge = cursor
				.getString(RingBlockOverviewQuery.JUDGE_NAME);
		if (cursor.moveToPrevious()) {
			previousJudge = cursor.getString(RingBlockOverviewQuery.JUDGE_NAME);
		}
		cursor.moveToNext();
		if (currentJudge.equals(previousJudge)) {
			holder.judgeView.setVisibility(View.GONE);
		} else {
			holder.judgeView.setText(currentJudge);
			holder.judgeView.setVisibility(View.VISIBLE);
		}
		holder.titleView
				.setTypeface(((cursor
						.getInt(RingBlockOverviewQuery.COUNT_AHEAD) == mSelectedCountAhead) ? Typeface.DEFAULT_BOLD
						: Typeface.DEFAULT));
		holder.titleView
				.setText(cursor.getString(RingBlockOverviewQuery.TITLE));
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		View view = mActivity.getLayoutInflater().inflate(
				R.layout.list_item_ring_block_overview, parent, false);
		ViewHolder holder = new ViewHolder();
		holder.judgeView = ((TextView) view
				.findViewById(R.id.list_item_ring_block_judge));
		holder.titleView = ((TextView) view
				.findViewById(R.id.list_item_ring_block_title));
		view.setTag(holder);
		return view;
	}
}