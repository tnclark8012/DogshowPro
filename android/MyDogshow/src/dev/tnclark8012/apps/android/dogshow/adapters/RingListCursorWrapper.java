package dev.tnclark8012.apps.android.dogshow.adapters;

import java.util.Arrays;

import android.database.Cursor;
import android.database.CursorWrapper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.RingsQuery;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class RingListCursorWrapper extends CursorWrapper {

	int[] originalPositions;
	int currentPosition = -1;
	int size;
	Pair[] pairs;
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
		return pairs[currentPosition].amount;
	}

	public String getBreedCount() {
		return pairs[currentPosition].breedCount;
	}

	public static class RingListCursorWrapperOptions
	{
		public int countAheadColumnIndex;
		public int firstClassColumnIndex;
		public int ringTypeColumnIndex;
		public int dogCountColumnIndex;
		public int bitchCountColumnIndex;
		public int specialDogCountColumnIndex;
		public int specialBitchCountColumnIndex;
		public int blockStartColumnIndex;
		public float judgeMinutesPerDog;
	}
	public RingListCursorWrapper(Cursor cursor, RingListCursorWrapperOptions options) {

		super(cursor);

		int count = cursor.getCount();
		size = count;
		originalPositions = new int[count];
		pairs = new Pair[count];
		int i = 0;
		int countAhead;
		int type;
		int firstClass;
		int currentColumn;
		int[] breedCount;
		long estMillis;
		while (cursor.moveToNext()) {
			countAhead = cursor.getInt(options.countAheadColumnIndex);
			type = cursor.getInt(options.ringTypeColumnIndex);
			breedCount = null;
			if (type == EnteredRings.TYPE_BREED_RING) {
				breedCount = new int[] { cursor.getInt(options.dogCountColumnIndex), cursor.getInt(options.bitchCountColumnIndex), cursor.getInt(options.specialDogCountColumnIndex), cursor.getInt(options.specialBitchCountColumnIndex) };
				firstClass = cursor.getInt(options.firstClassColumnIndex);
				currentColumn = 0;
				// Add the counts of classes before the first entered.
				while (firstClass > 0) {
					countAhead += breedCount[currentColumn];
					currentColumn++;
					firstClass--;
				}
			}
			estMillis = Utils.estimateBlockStart(countAhead, cursor.getLong(options.blockStartColumnIndex), options.judgeMinutesPerDog);
			pairs[i] = new Pair(i, estMillis, dev.tnclark8012.apps.android.dogshow.util.Arrays.concat("-", breedCount));
			i++;
		}
		Arrays.sort(pairs);
		cursor.moveToPosition(-1);
		mCursor = cursor;
	}

	@Override
	public boolean move(int offset) {
		currentPosition += offset;
		if (currentPosition >= -1 && currentPosition <= size) {
			return mCursor.moveToPosition(pairs[currentPosition].originalIndex);
		} else {
			if (currentPosition < -1)
				currentPosition = -1;
			if (currentPosition > size)
				currentPosition = size + 1;
			return false;
		}
	}

	@Override
	public boolean moveToFirst() {
		currentPosition = 0;
		return mCursor.moveToPosition(pairs[0].originalIndex);
	}

	@Override
	public boolean moveToLast() {
		currentPosition = size - 1;
		return mCursor.moveToPosition(pairs[size - 1].originalIndex);
	}

	@Override
	public boolean moveToNext() {
		return mCursor.moveToPosition(pairs[++currentPosition].originalIndex);
	}

	@Override
	public boolean moveToPosition(int position) {
		currentPosition = position;
		return mCursor.moveToPosition(pairs[currentPosition].originalIndex);
	}

	@Override
	public boolean moveToPrevious() {
		return mCursor.moveToPosition(pairs[--currentPosition].originalIndex);
	}
}
