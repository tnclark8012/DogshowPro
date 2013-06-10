//package dev.tnclark8012.dogshow.apps.android.adapters;
//
//import android.app.Activity;
//import android.content.Context;
//import android.database.Cursor;
//import android.text.format.DateUtils;
//import android.util.Log;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.ViewStub;
//import android.widget.CursorAdapter;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//import dev.tnclark8012.dogshow.apps.android.R;
//import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.EnteredRings;
//import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
//import dev.tnclark8012.dogshow.apps.android.util.Utils;
//import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;
//import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;
//
//public class RingListAdapter extends CursorAdapter {
//	private Activity mActivity;
//	private static final String TAG = RingListAdapter.class.getSimpleName();
//		public RingListAdapter(Activity activity) {
//			super(activity, null, false);
//			mActivity = activity;
//		}
//
//		@Override
//		public void bindView(View view, Context context, Cursor cursor) {
//
//			int countAhead = cursor.getInt(AllRingsQuery.COUNT_AHEAD);
//			long blockTimeMillis = cursor.getLong(AllRingsQuery.BLOCK_START);
//			float judgeMinutesPerDog = Utils.getMaybeNull(cursor, AllRingsQuery.JUDGE_TIME, defaultPerDogJudgingMinutes);
//			long estMillis = Utils.estimateBlockStart(countAhead, blockTimeMillis, judgeMinutesPerDog);
//			int cursorPosition = cursor.getPosition();
//			Log.d(TAG, "position " + cursorPosition + " is type: " + cursor.getInt(AllRingsQuery.RING_TYPE));
//			if (newDayPositions.get(cursorPosition)) {
//				ViewStub stub = (ViewStub) view.findViewById(R.id.list_item_ring_header_stub);
//				RelativeLayout header = null;
//				if (stub != null) {
//					header = (RelativeLayout) stub.inflate();
//				} else {
//					header = (RelativeLayout) view.findViewById(R.id.list_item_ring_header);
//				}
//				((TextView) header.findViewById(R.id.list_item_ring_header_date)).setText(DateUtils.formatDateTime(mActivity, blockTimeMillis, DateUtils.FORMAT_SHOW_WEEKDAY | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NO_YEAR) + "");
//				header.setVisibility(View.VISIBLE);
//			} else {
//				RelativeLayout header = (RelativeLayout) view.findViewById(R.id.list_item_ring_header);
//				if (header != null) {
//					header.setVisibility(View.GONE);
//				}
//			}
//			((TextView) view.findViewById(R.id.list_item_ring_subtitle)).setText(cursor.getString(AllRingsQuery.SUBTITLE));
//			String title = cursor.getString(AllRingsQuery.TITLE);
//			if (cursor.getInt(AllRingsQuery.RING_TYPE) == EnteredRings.TYPE_BREED_RING) {
//				title = Breeds.parse(title).getPrimaryName();
//			} else {
//				title = JuniorClass.parse(title).getPrimaryName();
//			}
//			((TextView) view.findViewById(R.id.list_item_ring_title)).setText(title);
//			((TextView) view.findViewById(R.id.list_item_ring_number)).setText(getString(R.string.template_ring_number, cursor.getInt(AllRingsQuery.RING_NUMBER)));
//
//			((TextView) view.findViewById(R.id.list_item_ring_start)).setText(String.format("(%s)", UIUtils.timeStringFromMillis(blockTimeMillis, true)));
//
//			String time = String.format("%s\n%s", UIUtils.timeStringFromMillis(estMillis, false), UIUtils.timeAmPmFromMillis(estMillis));
//
//			((TextView) view.findViewById(R.id.list_item_ring_time)).setText(time);
//		}
//
//		@Override
//		public View newView(Context context, Cursor cursor, ViewGroup parent) {
//			return mActivity.getLayoutInflater().inflate(R.layout.list_item_ring_with_header, parent, false);
//		}
//	}