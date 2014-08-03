/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.tnclark8012.apps.android.dogshow.provider;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.RingBlocks;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.GroupRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowDatabase;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowDatabase.Tables;
import dev.tnclark8012.apps.android.dogshow.sync.request.JuniorsRingsRequest;
import dev.tnclark8012.apps.android.dogshow.util.DebugUtils;
import dev.tnclark8012.apps.android.dogshow.util.SelectionBuilder;

public class DogshowProvider extends ContentProvider {
	private static final String TAG = DogshowProvider.class.getSimpleName();

	private DogshowDatabase mOpenHelper;

	private static final UriMatcher sUriMatcher = buildUriMatcher();

	private static final int DOGS = 100;
	private static final int DOGS_ID = 101;
	private static final int DOGS_ENTERED = 102;

	private static final int BREED_RINGS = 200;
	private static final int BREED_RINGS_WITH_DOGS = 202;
	private static final int BREED_RINGS_WITH_DOGS_ENTERED = 203;

	private static final int HANDLERS = 300;
	private static final int HANDLERS_ID = 301;
	private static final int HANDLERS_BY_JUNIORS_CLASS = 302;

	private static final int JUNIORS_RINGS = 400;

	private static final int ALL_RINGS_ENTERED = 500;
	private static final int ALL_RINGS_ENTERED_BLOCKS = 501;
	
	private static final int SHOW_TEAMS = 600;
	private static final int GROUP_RINGS = 700;
	
	private static final int BLOCK_RINGS = 800;

	/**
	 * Build and return a {@link UriMatcher} that catches all {@link Uri}
	 * variations supported by this {@link ContentProvider}.
	 */
	private static UriMatcher buildUriMatcher() {
		final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
		final String authority = DogshowContract.CONTENT_AUTHORITY;

		matcher.addURI(authority, "dogs", DOGS);
		matcher.addURI(authority, "dogs/entered", DOGS_ENTERED);
		matcher.addURI(authority, "dogs/*", DOGS_ID);
		matcher.addURI(authority, "rings/breed", BREED_RINGS);
		matcher.addURI(authority, "rings/group", GROUP_RINGS);
		matcher.addURI(authority, "rings/breed/with_dogs",
				BREED_RINGS_WITH_DOGS);
		matcher.addURI(authority, "rings/breed/with_dogs/entered",
				BREED_RINGS_WITH_DOGS_ENTERED);
		matcher.addURI(authority, "handlers", HANDLERS);
		matcher.addURI(authority, "handlers/juniors/by_class",
				HANDLERS_BY_JUNIORS_CLASS);
		matcher.addURI(authority, "handlers/*", HANDLERS_ID);
		matcher.addURI(authority, "rings/juniors", JUNIORS_RINGS);
		matcher.addURI(authority, "rings/entered", ALL_RINGS_ENTERED);
		matcher.addURI(authority, "rings/entered/blocks", ALL_RINGS_ENTERED_BLOCKS);
		matcher.addURI(authority, "teams", SHOW_TEAMS);
		matcher.addURI(authority, "rings/block", BLOCK_RINGS);

		return matcher;
	}

	@Override
	public boolean onCreate() {
		mOpenHelper = new DogshowDatabase(getContext());
		return true;
	}

	private void deleteDatabase() {
		mOpenHelper.close();
		Context context = getContext();
		DogshowDatabase.deleteDatabase(context);
		mOpenHelper = new DogshowDatabase(getContext());
	}

	/** {@inheritDoc} */
	@Override
	public String getType(Uri uri) {
		final int match = sUriMatcher.match(uri);
		switch (match) {
		case DOGS:
			return Dogs.CONTENT_TYPE;
		case DOGS_ID:
			return Dogs.CONTENT_ITEM_TYPE;
		case BREED_RINGS:
			return BreedRings.CONTENT_TYPE;
		case GROUP_RINGS:
			return GroupRings.CONTENT_TYPE;
		case BLOCK_RINGS:
			return RingBlocks.CONTENT_TYPE;
		case HANDLERS:
			return Handlers.CONTENT_TYPE;
		case HANDLERS_ID:
			return Handlers.CONTENT_ITEM_TYPE;
		case JUNIORS_RINGS:
			return JuniorsRings.CONTENT_TYPE;
		case ALL_RINGS_ENTERED:
			return EnteredRings.CONTENT_TYPE;
		case ALL_RINGS_ENTERED_BLOCKS:
			return EnteredRings.CONTENT_TYPE;
		default:
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
	}

	/** {@inheritDoc} */
	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		Log.v(TAG, "query(uri=" + uri + ", proj=" + Arrays.toString(projection)
				+ ")");// TODO FIXME DogsFragment seems to make several queries
						// to
						// start
		final SQLiteDatabase db = mOpenHelper.getReadableDatabase();

		final int match = sUriMatcher.match(uri);
		switch (match) {
		case BREED_RINGS_WITH_DOGS:
		case BREED_RINGS_WITH_DOGS_ENTERED: {
			final SelectionBuilder exBuilder = buildExpandedSelection(uri,
					BREED_RINGS_WITH_DOGS_ENTERED);
			return exBuilder.where(selection, selectionArgs).query(db,
					projection, null, null, sortOrder, null);
		}
		case DOGS_ENTERED: {
			final SelectionBuilder exBuilder = buildSimpleSelection(uri);
			String groupBy = Dogs.DOG_BREED + "," + Dogs.DOG_IS_VETERAN + ","
					+ Dogs.DOG_IS_SHOWING_SWEEPSTAKES;
			exBuilder.where(Dogs.DOG_IS_SHOWING + "=?", String.valueOf(1));
			return exBuilder.where(selection, selectionArgs).query(db,
					projection, groupBy, null, sortOrder, null);
		}
		case HANDLERS_BY_JUNIORS_CLASS: {
			final SelectionBuilder exBuilder = buildSimpleSelection(uri);
			String groupBy = Handlers.HANDLER_JUNIOR_CLASS;
			return exBuilder.where(selection, selectionArgs).query(db,
					projection, groupBy, null, sortOrder, null);
		}
		case ALL_RINGS_ENTERED_BLOCKS:
		{
			final SelectionBuilder exBuilder = buildSimpleSelection(uri);
			String groupBy = EnteredRings.RING_BLOCK_START + ", " + EnteredRings.RING_NUMBER;
			return exBuilder.where(selection, selectionArgs).query(db,
					projection, groupBy, null, sortOrder, null);
		}
		default: {
			// Most cases are handled with simple SelectionBuilder
			final SelectionBuilder builder = buildSimpleSelection(uri);
			return builder.where(selection, selectionArgs).query(db,
					projection, sortOrder);
		}
		}
	}

	/** {@inheritDoc} */
	@Override
	public Uri insert(Uri uri, ContentValues values) {
		Log.v(TAG, "insert(uri=" + uri + ", values=" + values.toString() + ")");
		final SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		final int match = sUriMatcher.match(uri);
		boolean syncToNetwork = !DogshowContract
				.hasCallerIsSyncAdapterParameter(uri);
		switch (match) {
		case DOGS: {
			db.insertOrThrow(Tables.DOGS, null, values);
			getContext().getContentResolver().notifyChange(uri, null,
					syncToNetwork);
			return Dogs.buildDogUri(values.getAsString(Dogs._ID));
		}
		case BREED_RINGS: {
			db.insertOrThrow(Tables.BREED_RINGS, null, values);
			getContext().getContentResolver().notifyChange(uri, null,
					syncToNetwork);
			return BreedRings.buildRingUri(values.getAsString(BreedRings._ID));
		}
		case GROUP_RINGS: {
			db.insertOrThrow(Tables.GROUP_RINGS, null, values);
			getContext().getContentResolver().notifyChange(uri, null,
					syncToNetwork);
			return GroupRings.buildRingUri(values.getAsString(GroupRings._ID));
		}
		case BLOCK_RINGS: {
			db.insertOrThrow(Tables.BLOCK_RINGS, null, values);
			getContext().getContentResolver().notifyChange(uri, null,
					syncToNetwork);
			return RingBlocks.buildRingUri(values.getAsString(RingBlocks._ID));
		}
		case HANDLERS: {
			db.insertOrThrow(Tables.HANDLERS, null, values);
			getContext().getContentResolver().notifyChange(uri, null,
					syncToNetwork);
			return Handlers.buildHandlerUri(values.getAsString(Handlers._ID));
		}
		case JUNIORS_RINGS: {
			db.insertOrThrow(Tables.JUNIORS_RINGS, null, values);
			getContext().getContentResolver().notifyChange(uri, null,
					syncToNetwork);
			return JuniorsRings.buildRingUri(values
					.getAsString(JuniorsRings._ID));
		}
		case SHOW_TEAMS: {
			db.insertOrThrow(Tables.SHOW_TEAMS, null, values);
			getContext().getContentResolver().notifyChange(uri, null,
					syncToNetwork);
			return ShowTeams
					.buildShowTeamUri(values.getAsString(ShowTeams._ID));
		}
		default: {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		}
	}

	/** {@inheritDoc} */
	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		Log.v(TAG, "update(uri=" + uri + ", values=" + values.toString()
				+ ") selection " + selection + ", selectionArgs: "
				+ selectionArgs[0]);
		final SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		final SelectionBuilder builder = buildSimpleSelection(uri);
		int retVal = builder.where(selection, selectionArgs).update(db, values);
		Log.v(TAG, retVal + " row affected.");
		boolean syncToNetwork = !DogshowContract
				.hasCallerIsSyncAdapterParameter(uri);
		getContext().getContentResolver()
				.notifyChange(uri, null, syncToNetwork);
		Log.d(TAG, "return val of update: " + retVal);
		return retVal;
	}

	/** {@inheritDoc} */
	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		Log.v(TAG, "delete(uri=" + uri + ")");
		if (uri == DogshowContract.BASE_CONTENT_URI) {
			// Handle whole database deletes (e.g. when signing out)
			deleteDatabase();
			getContext().getContentResolver().notifyChange(uri, null, false);
			return 1;
		}
		final SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		final SelectionBuilder builder = buildSimpleSelection(uri);
		int retVal = builder.where(selection, selectionArgs).delete(db);
		getContext().getContentResolver().notifyChange(uri, null,
				!DogshowContract.hasCallerIsSyncAdapterParameter(uri));
		return retVal;
	}

	/**
	 * Apply the given set of {@link ContentProviderOperation}, executing inside
	 * a {@link SQLiteDatabase} transaction. All changes will be rolled back if
	 * any single one fails.
	 */
	@Override
	public ContentProviderResult[] applyBatch(
			ArrayList<ContentProviderOperation> operations)
			throws OperationApplicationException {
		final SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		db.beginTransaction();
		try {
			final int numOperations = operations.size();
			final ContentProviderResult[] results = new ContentProviderResult[numOperations];
			for (int i = 0; i < numOperations; i++) {
				results[i] = operations.get(i).apply(this, results, i);
			}
			db.setTransactionSuccessful();
			return results;
		} finally {
			db.endTransaction();
		}
	}

	/**
	 * Build a simple {@link SelectionBuilder} to match the requested
	 * {@link Uri}. This is usually enough to support {@link #insert},
	 * {@link #update}, and {@link #delete} operations.
	 */
	private SelectionBuilder buildSimpleSelection(Uri uri) {
		final SelectionBuilder builder = new SelectionBuilder();
		final int match = sUriMatcher.match(uri);
		switch (match) {
		case BREED_RINGS: {
			return builder.table(Tables.BREED_RINGS);
		}
		case GROUP_RINGS: {
			return builder.table(Tables.GROUP_RINGS);
		}
		case BLOCK_RINGS:
			return builder.table(Tables.BLOCK_RINGS);
		case DOGS: {
			return builder.table(Tables.DOGS);
		}
		case DOGS_ENTERED: {
			return builder.table(Tables.DOGS);
		}
		case DOGS_ID:
			final String dogId = String.valueOf(Dogs.getDogId(uri));
			return builder.table(Tables.DOGS).where(Dogs._ID + "=?", dogId);
		case HANDLERS:
			return builder.table(Tables.HANDLERS);
		case HANDLERS_ID:
			final String handlerId = String.valueOf(Handlers.getHandlerId(uri));
			return builder.table(Tables.HANDLERS).where(Handlers._ID + "=?",
					handlerId);
		case HANDLERS_BY_JUNIORS_CLASS:
			return builder.table(Tables.HANDLERS);
		case JUNIORS_RINGS:
			return builder.table(Tables.JUNIORS_RINGS);
		case ALL_RINGS_ENTERED:
			return builder.table(Tables.ALL_ENTERED_RINGS);// TODO FIXME this
															// should be
															// Tables.All_Rings
		case ALL_RINGS_ENTERED_BLOCKS:
			return builder.table(Tables.ALL_ENTERED_RINGS);
		case SHOW_TEAMS:
			return builder.table(Tables.SHOW_TEAMS);
		default: {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		}
	}

	/**
	 * Build an advanced {@link SelectionBuilder} to match the requested
	 * {@link Uri}. This is usually only used by {@link #query}, since it
	 * performs table joins useful for {@link Cursor} data.
	 */
	private SelectionBuilder buildExpandedSelection(Uri uri, int match) {
		final SelectionBuilder builder = new SelectionBuilder();
		switch (match) {
		case BREED_RINGS_WITH_DOGS_ENTERED: {
			return builder.table(Tables.ENTERED_BREED_RINGS_JOIN_DOGS)
					.mapToTable(BreedRings._ID, Tables.BREED_RINGS)
					.where(BreedRings.ENTERED_BREED_RINGS);
		}
		default: {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		}
	}

	@Override
	public ParcelFileDescriptor openFile(Uri uri, String mode)
			throws FileNotFoundException {
		final int match = sUriMatcher.match(uri);
		switch (match) {
		default: {
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
		}
	}

	public interface Qualified {
		public static final String BREED_RINGS_RING_BREED = Tables.BREED_RINGS
				+ "." + BreedRings.RING_BREED;
		public static final String DOG_CALL_NAME = Tables.DOGS + "."
				+ Dogs.DOG_CALL_NAME;
		public static final String JUNIORS_RINGS_ID = Tables.JUNIORS_RINGS
				+ "." + JuniorsRings._ID;
		public static final String GROUP_RINGS_ID = Tables.GROUP_RINGS + "."
				+ GroupRings._ID;
		public static final String BREED_RINGS_ID = Tables.BREED_RINGS + "."
				+ BreedRings._ID;
		public static final String BREED_RINGS_IS_VETERAN = Tables.BREED_RINGS
				+ "." + BreedRings.RING_BREED_IS_VETERAN;
		public static final String BREED_RINGS_IS_SWEEPSTAKES = Tables.BREED_RINGS
				+ "." + BreedRings.RING_BREED_IS_SWEEPSTAKES;
	}

	public interface Subquery {
		public static final String BREED_RING_OVERVIEW = "SELECT "
				+ Qualified.BREED_RINGS_ID
				+ ", "
				+ "CAST("
				+ EnteredRings.TYPE_BREED_RING
				+ " as INTEGER )"
				+ " as ring_type, "
				+ BreedRings.RING_NUMBER + ", " 
				+ BreedRings.RING_TITLE + " as "
				+ EnteredRings.ENTERED_RINGS_TITLE + ","
				+ Dogs.ENTERED_DOGS_NAMES + " as "
				+ EnteredRings.ENTERED_RINGS_SUBTITLE + ", "
				+ BreedRings.RING_BLOCK_START + ", "
				+ BreedRings.RING_COUNT_AHEAD + ", "
				+ BreedRings.RING_BREED_COUNT + " as "
				+ EnteredRings.ENTERED_RINGS_RING_COUNT + ","
				+ BreedRings.RING_JUDGE_TIME + "," + Dogs.DOG_IMAGE_PATH
				+ " as image_path, " + Dogs.ENTERED_DOGS_FIRST_CLASS + " as "
				+ EnteredRings.ENTERED_RINGS_FIRST_CLASS + ","
				+ BreedRings.RING_DOG_COUNT + " as "
				+ EnteredRings.ENTERED_RINGS_DOG_COUNT + ","
				+ BreedRings.RING_BITCH_COUNT + " as "
				+ EnteredRings.ENTERED_RINGS_BITCH_COUNT + ","
				+ BreedRings.RING_SPECIAL_DOG_COUNT + " as "
				+ EnteredRings.ENTERED_RINGS_SPECIAL_DOG_COUNT + ","
				+ BreedRings.RING_SPECIAL_BITCH_COUNT + " as "
				+ EnteredRings.ENTERED_RINGS_SPECIAL_BITCH_COUNT + " FROM ( "
				+ Tables.ENTERED_BREED_RINGS_JOIN_DOGS + " )";
		public static final String JUNIOR_RING_OVERVIEW = "SELECT "
				+ Qualified.JUNIORS_RINGS_ID + ", " + "CAST("
				+ EnteredRings.TYPE_JUNIORS_RING + " as INTEGER )" + " as "
				+ EnteredRings.ENTERED_RINGS_TYPE + ", "
				+ JuniorsRings.RING_NUMBER + ", " + JuniorsRings.RING_TITLE
				+ " || IFNULL(" + JuniorsRings.RING_JUNIOR_BREED + ", '')"
				+ "," + Handlers.ENTERED_JUNIOR_HANDLER_NAMES + ", "
				+ JuniorsRings.RING_BLOCK_START + ", "
				+ JuniorsRings.RING_COUNT_AHEAD + ", "
				+ JuniorsRings.RING_JUNIOR_COUNT + ","
				+ JuniorsRings.RING_JUDGE_TIME + ", " + "NULL" + "," + // image
																		// path
				"NULL" + "," + // first class
				"NULL" + "," + // dog
				"NULL" + "," + // bitch
				"NULL" + "," + // s. dog
				"NULL" + // s. bitch
				" FROM " + Tables.ENTERED_JUNIORS_RINGS;
		public static final String GROUP_RING_OVERVIEW = "SELECT "
				+ Qualified.GROUP_RINGS_ID + ", " + "CAST("
				+ EnteredRings.TYPE_GROUP_RING + " as INTEGER )" + " as "
				+ EnteredRings.ENTERED_RINGS_TYPE + ", "
				+ GroupRings.RING_NUMBER + ", " + GroupRings.RING_GROUP + ","
				+ GroupRings.RING_JUDGE + "," + GroupRings.RING_BLOCK_START
				+ ", " + GroupRings.RING_COUNT_AHEAD + ", " // Count Ahead
				+ "0," + GroupRings.RING_JUDGE_TIME + ", " + "NULL" + "," + // image
																			// path
				"NULL" + "," + // first class
				"NULL" + "," + // dog
				"NULL" + "," + // bitch
				"NULL" + "," + // s. dog
				"NULL" + // s. bitch
				" FROM " + Tables.GROUP_RINGS;
		public static final String ENTERED_JUNIOR_HANDLERS = "(SELECT *,group_concat("
				+ Handlers.HANDLER_NAME
				+ ", \", \" ) as "
				+ Handlers.ENTERED_JUNIOR_HANDLER_NAMES
				+ " FROM "
				+ Tables.HANDLERS
				+ " AS handlerTable "
				+ " WHERE "
				+ Handlers.HANDLER_IS_SHOWING_JUNIORS
				+ "=1 AND "
				+ Handlers.HANDLER_JUNIOR_CLASS
				+ " IS NOT NULL "
				+ " GROUP BY " + Handlers.HANDLER_JUNIOR_CLASS + ")";
	}
}
