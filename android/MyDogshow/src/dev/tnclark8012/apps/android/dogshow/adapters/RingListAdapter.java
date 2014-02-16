package dev.tnclark8012.apps.android.dogshow.adapters;

import java.util.Date;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.RingsQuery;
import dev.tnclark8012.apps.android.dogshow.util.Arrays;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class RingListAdapter extends CursorAdapter implements StickyListHeadersAdapter, SectionIndexer {
	public static final String TAG = RingListAdapter.class.getName();
	private int[] mSectionIndices;
	private String[] mSectionHeaders;
	private int[] mSectionIds;
	private LayoutInflater mInflater;
	private Activity mActivity;

	public void setSections(int[] indices, String[] sectionHeaders, int[] sectionIds) {
		mSectionHeaders = sectionHeaders;
		mSectionIndices = indices;
		mSectionIds = sectionIds;
	}

	public RingListAdapter(Activity activity) {
		super(activity, null, false);
		mActivity = activity;
		mInflater = mActivity.getLayoutInflater();
	}

	@Override
	public void bindView(View view, Context context, Cursor cursor) {

		int countAhead = cursor.getInt(RingsQuery.COUNT_AHEAD);
		int type = cursor.getInt(RingsQuery.RING_TYPE);
		int[] breedCount = null;
		if (type == EnteredRings.TYPE_BREED_RING) {
			breedCount = new int[] { cursor.getInt(RingsQuery.DOG_COUNT), cursor.getInt(RingsQuery.BITCH_COUNT), cursor.getInt(RingsQuery.SPECIAL_DOG_COUNT), cursor.getInt(RingsQuery.SPECIAL_BITCH_COUNT) };
			int firstClass = cursor.getInt(RingsQuery.FIRST_CLASS);
			int currentColumn = 0;
			// Add the counts of classes before the first entered.
			while (firstClass > 0) {
				countAhead += breedCount[currentColumn];
				currentColumn++;
				firstClass--;
			}
		}
		long blockTimeMillis = cursor.getLong(RingsQuery.BLOCK_START);
		blockTimeMillis = new Date(blockTimeMillis).getTime();
		float judgeMinutesPerDog = Utils.getMaybeNull(cursor, RingsQuery.JUDGE_TIME, Prefs.getEstimatedJudgingTime(mActivity));
		long estMillis = Utils.estimateBlockStart(countAhead, blockTimeMillis, judgeMinutesPerDog);
		int cursorPosition = cursor.getPosition();
		Log.d(TAG, "position " + cursorPosition + " is type: " + cursor.getInt(RingsQuery.RING_TYPE));
		((TextView) view.findViewById(R.id.list_item_ring_subtitle)).setText(cursor.getString(RingsQuery.SUBTITLE));
		String title = cursor.getString(RingsQuery.TITLE);
		((TextView) view.findViewById(R.id.list_item_ring_title)).setText(title);
		((TextView) view.findViewById(R.id.list_item_ring_number)).setText(mActivity.getString(R.string.template_ring_number, cursor.getInt(RingsQuery.RING_NUMBER))); 
		((TextView) view.findViewById(R.id.list_item_ring_start)).setText(String.format("(%s)", UIUtils.timeStringFromMillis(blockTimeMillis, true)) + " " + Arrays.concat("-", breedCount));

		String time = String.format("%s\n%s", UIUtils.timeStringFromMillis(estMillis, false), UIUtils.timeAmPmFromMillis(estMillis));
		((TextView) view.findViewById(R.id.list_item_ring_time)).setText(time);
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		return mInflater.inflate(R.layout.list_item_ring_with_header, parent, false);
	}

	@Override
	public View getHeaderView(int position, View convertView, ViewGroup parent) {
		TextView text;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.list_item_ring_header, parent, false);
			text = (TextView) convertView.findViewById(R.id.list_item_ring_header_date);
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