package dev.tnclark8012.apps.android.dogshow.adapters;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.Arrays;

import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

/**
 * Wrapper for a ring list. Dynamically returns rings based on custom ring judging times.
 * It's not enough to simply sort the list based on ring block start because there may be a  different number of entries before 2 rings that have the same
 * block start time. This class accounts for the number of entries before a particular ring
 */
public class RingListCursorWrapper extends CursorWrapper {

	int[] mOriginalPositions;
	int mCurrentPosition = -1;
	int mSize;
	Pair[] mPairs;
	Cursor mCursor;

	static class Pair implements Comparable<Pair> {
		Long amount;
		int originalIndex;
		String breedCount;

		public Pair(int originalIndex, long amount, String breedCount) {
			this.originalIndex = originalIndex;
			this.amount = amount;
			this.breedCount = breedCount;
		}

		@Override
		public int compareTo(Pair another) {
			return amount.compareTo(another.amount);
		}
	}

	public long getEstimatedStart() {
		return mPairs[mCurrentPosition].amount;
	}

	public String getBreedCount() {
		return mPairs[mCurrentPosition].breedCount;
	}

	public static class RingListCursorWrapperOptions {
		public int countAheadColumnIndex;
		public int firstClassColumnIndex;
		public int ringTypeColumnIndex;
		public int dogCountColumnIndex;
		public int bitchCountColumnIndex;
		public int specialDogCountColumnIndex;
		public int specialBitchCountColumnIndex;
		public int blockStartColumnIndex;
		public long defaultPerDogJudgeMillis;
		public long defaultPerGroupJudgeMillis;
		public int perAheadJudgeMillsColumnIndex;
		public int ringCountColumnIndex;
	}

	public RingListCursorWrapper(Cursor cursor,
			RingListCursorWrapperOptions options) {
		super(cursor);
		mSize = cursor.getCount();
		mOriginalPositions = new int[mSize];
		mPairs = new Pair[mSize];
		int i = 0;
		int countAhead;
		int type;
		int firstClass;
		int currentColumn;
		int[] breedCount;
		long estMillis;
		long perAheadMillis = 0;
		String countString = "";
		while (cursor.moveToNext()) {
			countAhead = cursor.getInt(options.countAheadColumnIndex);
			type = cursor.getInt(options.ringTypeColumnIndex);
			if (type == EnteredRings.TYPE_BREED_RING) {
				breedCount = new int[] {
						cursor.getInt(options.dogCountColumnIndex),
						cursor.getInt(options.bitchCountColumnIndex),
						cursor.getInt(options.specialDogCountColumnIndex),
						cursor.getInt(options.specialBitchCountColumnIndex) };
				firstClass = cursor.getInt(options.firstClassColumnIndex);
				currentColumn = 0;
				// Add the counts of classes before the first entered.
				while (firstClass > 0) {
					countAhead += breedCount[currentColumn];
					currentColumn++;
					firstClass--;
				}
				countString = dev.tnclark8012.apps.android.dogshow.util.Arrays
						.concat("-", breedCount);
				perAheadMillis = Utils.getMaybeNull(cursor,
						options.perAheadJudgeMillsColumnIndex,
						options.defaultPerDogJudgeMillis);
			} else if (type == EnteredRings.TYPE_JUNIORS_RING) {
				countString = String.valueOf(cursor
						.getInt(options.ringCountColumnIndex));
				perAheadMillis = Utils.getMaybeNull(cursor,
						options.perAheadJudgeMillsColumnIndex,
						options.defaultPerDogJudgeMillis);
			}
			else if( type == EnteredRings.TYPE_GROUP_RING)
			{
				perAheadMillis = Utils.getMaybeNull(cursor,
						options.perAheadJudgeMillsColumnIndex,
						options.defaultPerGroupJudgeMillis);
			}
			
			estMillis = Utils
					.estimateBlockStart(countAhead,
							cursor.getLong(options.blockStartColumnIndex),
							perAheadMillis);

			mPairs[i] = new Pair(i, estMillis, countString);
			i++;
		}
		Arrays.sort(mPairs);
		cursor.moveToPosition(-1);
		mCursor = cursor;
	}

	@Override
	public boolean move(int offset) {
		mCurrentPosition += offset;
		if (mCurrentPosition > -1 && mCurrentPosition <= mSize) {
			return mCursor.moveToPosition(mPairs[mCurrentPosition].originalIndex);
		} else {
			if (mCurrentPosition <= -1) {
				mCurrentPosition = -1;
			}
			if (mCurrentPosition > mSize) {
				mCurrentPosition = mSize;
			}
			return mCursor.moveToPosition(mCurrentPosition);
		}
	}

	@Override
	public boolean moveToFirst() {
		mCurrentPosition = 0;
		if (mSize == 0)
			return false;
		return mCursor.moveToPosition(mPairs[0].originalIndex);
	}

	@Override
	public boolean moveToLast() {
		if (mSize == 0)
			return false;
		mCurrentPosition = mSize - 1;
		return mCursor.moveToPosition(mPairs[mSize - 1].originalIndex);
	}

	@Override
	public boolean moveToNext() {
		if (mSize == 0 || mCurrentPosition == mSize - 1)
			return false;
		return mCursor.moveToPosition(mPairs[++mCurrentPosition].originalIndex);
	}

	@Override
	public boolean moveToPosition(int position) {
		if (mSize == 0 || position > mSize - 1)
			return false;
		mCurrentPosition = position;
		return mCursor.moveToPosition(mPairs[mCurrentPosition].originalIndex);
	}

	@Override
	public boolean moveToPrevious() {
		if (mSize == 0)
			return false;
		return mCursor.moveToPosition(mPairs[--mCurrentPosition].originalIndex);
	}
}
