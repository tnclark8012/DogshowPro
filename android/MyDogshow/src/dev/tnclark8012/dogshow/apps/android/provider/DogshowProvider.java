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

package dev.tnclark8012.dogshow.apps.android.provider;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
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
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowDatabase;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowDatabase.Tables;
import dev.tnclark8012.dogshow.apps.android.util.SelectionBuilder;

/**
 * Provider that stores {@link ScheduleContract} data. Data is usually inserted
 * by {@link com.google.android.apps.iosched.sync.SyncHelper}, and queried by
 * various {@link Activity} instances.
 */
public class DogshowProvider extends ContentProvider {
	private static final String TAG = DogshowProvider.class.getSimpleName();

	private DogshowDatabase mOpenHelper;

	private static final UriMatcher sUriMatcher = buildUriMatcher();

	private static final int DOGS = 100;
	private static final int DOGS_ID = 101;

	private static final String MIME_XML = "text/xml";

	/**
	 * Build and return a {@link UriMatcher} that catches all {@link Uri}
	 * variations supported by this {@link ContentProvider}.
	 */
	private static UriMatcher buildUriMatcher() {
		final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
		final String authority = DogshowContract.CONTENT_AUTHORITY;

		matcher.addURI(authority, "dogs", DOGS);
		matcher.addURI(authority, "dogs/*", DOGS_ID);
		return matcher;
	}

	@Override
	public boolean onCreate() {
		mOpenHelper = new DogshowDatabase(getContext());
		return true;
	}

	private void deleteDatabase() {
		// TODO: wait for content provider operations to finish, then tear down
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
		default:
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
	}

	/** {@inheritDoc} */
	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		Log.v(TAG, "query(uri=" + uri + ", proj=" + Arrays.toString(projection)
				+ ")");
		final SQLiteDatabase db = mOpenHelper.getReadableDatabase();

		final int match = sUriMatcher.match(uri);
		switch (match) {
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
			return Dogs.buildDogUri(values.getAsString(Dogs.DOG_ID));
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
		Log.v(TAG, "update(uri=" + uri + ", values=" + values.toString() + ")");
		final SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		final SelectionBuilder builder = buildSimpleSelection(uri);
		int retVal = builder.where(selection, selectionArgs).update(db, values);
		boolean syncToNetwork = !DogshowContract
				.hasCallerIsSyncAdapterParameter(uri);
		getContext().getContentResolver()
				.notifyChange(uri, null, syncToNetwork);
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
		case DOGS: {
			return builder.table(Tables.DOGS);
		}
		case DOGS_ID:
			final String dogId = Dogs.getDogId(uri);
			return builder.table(Tables.DOGS).where(Dogs.DOG_ID + "=?", dogId);
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
		case DOGS: {
			return builder.table(Tables.DOGS)
					.mapToTable(Dogs._ID, Tables.DOGS)
//					.mapToTable(Dogs..BLOCK_ID, Tables.SESSIONS)
					;
			
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

	// private interface Subquery {
	// String BLOCK_SESSIONS_COUNT = "(SELECT COUNT(" +
	// Qualified.SESSIONS_SESSION_ID + ") FROM "
	// + Tables.SESSIONS + " WHERE " + Qualified.SESSIONS_BLOCK_ID + "="
	// + Qualified.BLOCKS_BLOCK_ID + ")";
	//
	// String BLOCK_NUM_STARRED_SESSIONS = "(SELECT COUNT(1) FROM "
	// + Tables.SESSIONS + " WHERE " + Qualified.SESSIONS_BLOCK_ID + "="
	// + Qualified.BLOCKS_BLOCK_ID + " AND " + Qualified.SESSIONS_STARRED +
	// "=1)";
	//
	// String BLOCK_STARRED_SESSION_ID = "(SELECT " +
	// Qualified.SESSIONS_SESSION_ID + " FROM "
	// + Tables.SESSIONS + " WHERE " + Qualified.SESSIONS_BLOCK_ID + "="
	// + Qualified.BLOCKS_BLOCK_ID + " AND " + Qualified.SESSIONS_STARRED +
	// "=1 "
	// + "ORDER BY " + Qualified.SESSIONS_TITLE + ")";
	//
	// String BLOCK_STARRED_SESSION_TITLE = "(SELECT " +
	// Qualified.SESSIONS_TITLE + " FROM "
	// + Tables.SESSIONS + " WHERE " + Qualified.SESSIONS_BLOCK_ID + "="
	// + Qualified.BLOCKS_BLOCK_ID + " AND " + Qualified.SESSIONS_STARRED +
	// "=1 "
	// + "ORDER BY " + Qualified.SESSIONS_TITLE + ")";
	//
	// String BLOCK_STARRED_SESSION_HASHTAGS = "(SELECT " +
	// Qualified.SESSIONS_HASHTAGS + " FROM "
	// + Tables.SESSIONS + " WHERE " + Qualified.SESSIONS_BLOCK_ID + "="
	// + Qualified.BLOCKS_BLOCK_ID + " AND " + Qualified.SESSIONS_STARRED +
	// "=1 "
	// + "ORDER BY " + Qualified.SESSIONS_TITLE + ")";
	//
	// String BLOCK_STARRED_SESSION_URL = "(SELECT " + Qualified.SESSIONS_URL +
	// " FROM "
	// + Tables.SESSIONS + " WHERE " + Qualified.SESSIONS_BLOCK_ID + "="
	// + Qualified.BLOCKS_BLOCK_ID + " AND " + Qualified.SESSIONS_STARRED +
	// "=1 "
	// + "ORDER BY " + Qualified.SESSIONS_TITLE + ")";
	//
	// String BLOCK_STARRED_SESSION_LIVESTREAM_URL = "(SELECT "
	// + Qualified.SESSIONS_LIVESTREAM_URL
	// + " FROM "
	// + Tables.SESSIONS + " WHERE " + Qualified.SESSIONS_BLOCK_ID + "="
	// + Qualified.BLOCKS_BLOCK_ID + " AND " + Qualified.SESSIONS_STARRED +
	// "=1 "
	// + "ORDER BY " + Qualified.SESSIONS_TITLE + ")";
	//
	// String BLOCK_STARRED_SESSION_ROOM_NAME = "(SELECT " +
	// Qualified.ROOMS_ROOM_NAME + " FROM "
	// + Tables.SESSIONS_JOIN_ROOMS + " WHERE " + Qualified.SESSIONS_BLOCK_ID +
	// "="
	// + Qualified.BLOCKS_BLOCK_ID + " AND " + Qualified.SESSIONS_STARRED +
	// "=1 "
	// + "ORDER BY " + Qualified.SESSIONS_TITLE + ")";
	//
	// String BLOCK_STARRED_SESSION_ROOM_ID = "(SELECT " +
	// Qualified.ROOMS_ROOM_ID + " FROM "
	// + Tables.SESSIONS_JOIN_ROOMS + " WHERE " + Qualified.SESSIONS_BLOCK_ID +
	// "="
	// + Qualified.BLOCKS_BLOCK_ID + " AND " + Qualified.SESSIONS_STARRED +
	// "=1 "
	// + "ORDER BY " + Qualified.SESSIONS_TITLE + ")";
	//
	// String TRACK_SESSIONS_COUNT = "(SELECT COUNT(" +
	// Qualified.SESSIONS_TRACKS_SESSION_ID
	// + ") FROM " + Tables.SESSIONS_TRACKS + " WHERE "
	// + Qualified.SESSIONS_TRACKS_TRACK_ID + "=" + Qualified.TRACKS_TRACK_ID +
	// ")";
	//
	// String TRACK_VENDORS_COUNT = "(SELECT COUNT(" +
	// Qualified.VENDORS_VENDOR_ID + ") FROM "
	// + Tables.VENDORS + " WHERE " + Qualified.VENDORS_TRACK_ID + "="
	// + Qualified.TRACKS_TRACK_ID + ")";
	//
	// String SESSIONS_SNIPPET = "snippet(" + Tables.SESSIONS_SEARCH +
	// ",'{','}','\u2026')";
	// }
	//
	// /**
	// * {@link ScheduleContract} fields that are fully qualified with a
	// specific
	// * parent {@link Tables}. Used when needed to work around SQL ambiguity.
	// */
	// private interface Qualified {
	// String SESSIONS_SESSION_ID = Tables.SESSIONS + "." + Sessions.SESSION_ID;
	// String SESSIONS_BLOCK_ID = Tables.SESSIONS + "." + Sessions.BLOCK_ID;
	// String SESSIONS_ROOM_ID = Tables.SESSIONS + "." + Sessions.ROOM_ID;
	//
	// String SESSIONS_TRACKS_SESSION_ID = Tables.SESSIONS_TRACKS + "."
	// + SessionsTracks.SESSION_ID;
	// String SESSIONS_TRACKS_TRACK_ID = Tables.SESSIONS_TRACKS + "."
	// + SessionsTracks.TRACK_ID;
	//
	// String SESSIONS_SPEAKERS_SESSION_ID = Tables.SESSIONS_SPEAKERS + "."
	// + SessionsSpeakers.SESSION_ID;
	// String SESSIONS_SPEAKERS_SPEAKER_ID = Tables.SESSIONS_SPEAKERS + "."
	// + SessionsSpeakers.SPEAKER_ID;
	//
	// String VENDORS_VENDOR_ID = Tables.VENDORS + "." + Vendors.VENDOR_ID;
	// String VENDORS_TRACK_ID = Tables.VENDORS + "." + Vendors.TRACK_ID;
	//
	// String SESSIONS_STARRED = Tables.SESSIONS + "." +
	// Sessions.SESSION_STARRED;
	// String SESSIONS_TITLE = Tables.SESSIONS + "." + Sessions.SESSION_TITLE;
	// String SESSIONS_HASHTAGS = Tables.SESSIONS + "." +
	// Sessions.SESSION_HASHTAGS;
	// String SESSIONS_URL = Tables.SESSIONS + "." + Sessions.SESSION_URL;
	//
	// String SESSIONS_LIVESTREAM_URL = Tables.SESSIONS + "." +
	// Sessions.SESSION_LIVESTREAM_URL;
	//
	// String ROOMS_ROOM_NAME = Tables.ROOMS + "." + Rooms.ROOM_NAME;
	// String ROOMS_ROOM_ID = Tables.ROOMS + "." + Rooms.ROOM_ID;
	//
	// String TRACKS_TRACK_ID = Tables.TRACKS + "." + Tracks.TRACK_ID;
	// String BLOCKS_BLOCK_ID = Tables.BLOCKS + "." + Blocks.BLOCK_ID;
	// }
}
