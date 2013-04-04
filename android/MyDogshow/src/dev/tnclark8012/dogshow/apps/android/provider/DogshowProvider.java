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
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
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

	private static final int BREED_RINGS = 200;
	private static final int BREED_RINGS_ID = 201;
	private static final int BREED_RINGS_WITH_DOGS = 202;
	private static final int BREED_RINGS_WITH_DOGS_ENTERED = 203;

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
		matcher.addURI(authority, "breedrings", BREED_RINGS);
		matcher.addURI(authority, "breedrings/with_dogs", BREED_RINGS_WITH_DOGS);
		matcher.addURI(authority, "breedrings/with_dogs/entered",
				BREED_RINGS_WITH_DOGS_ENTERED);
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
		case BREED_RINGS:
			return BreedRings.CONTENT_TYPE;
		default:
			throw new UnsupportedOperationException("Unknown uri: " + uri);
		}
	}

	/** {@inheritDoc} */
	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		Log.v(TAG, "query(uri=" + uri + ", proj=" + Arrays.toString(projection)
				+ ")");// TODO DogsFragment seems to make several queries to
						// start
		final SQLiteDatabase db = mOpenHelper.getReadableDatabase();

		final int match = sUriMatcher.match(uri);
		switch (match) {
		case BREED_RINGS_WITH_DOGS:
		case BREED_RINGS_WITH_DOGS_ENTERED: {
			final SelectionBuilder exBuilder = buildExpandedSelection(uri,
					BREED_RINGS_WITH_DOGS_ENTERED);
			String groupBy = Dogs.DOG_BREED;
			return exBuilder.where(selection, selectionArgs).query(db,
					projection, groupBy, null, sortOrder, null);
		}
		// case BREED_RINGS_ENTERED_UPCOMING: {
		// final SelectionBuilder exBuilder = buildExpandedSelection(uri,
		// BREED_RINGS_ENTERED_UPCOMING);
		// return exBuilder.where(selection, selectionArgs).query(db,
		// projection, sortOrder);
		// }
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
		case BREED_RINGS: {
			return builder.table(Tables.BREED_RINGS);
		}
		case DOGS: {
			return builder.table(Tables.DOGS);
		}
		case DOGS_ID:
			final String dogId = Dogs.getDogId(uri);
			return builder.table(Tables.DOGS).where(Dogs._ID + "=?", dogId);
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
			return builder.table(Tables.BREED_RINGS_JOIN_DOGS)
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
}
