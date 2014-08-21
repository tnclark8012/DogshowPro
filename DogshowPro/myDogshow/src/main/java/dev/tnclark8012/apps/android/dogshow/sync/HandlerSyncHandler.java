package dev.tnclark8012.apps.android.dogshow.sync;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;

import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.model.Handler;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.HandlerSyncQuery;
import dev.tnclark8012.apps.android.dogshow.sync.response.HandlerSyncResponse;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class HandlerSyncHandler {
	private static final String TAG = HandlerSyncHandler.class.getSimpleName();
	Context mContext;
	IApiAccessor mAccessor;

	public HandlerSyncHandler(Context ctx, IApiAccessor accessor) {
		mContext = ctx;
		mAccessor = accessor;
	}

	public void sync(ContentResolver resolver, long lastSync, int flags) {
		// TODO test if two queries are faster, or if selection should be
		// applied manually.

		String[] currentHandlerIds = null;
		Handler[] locallyUpdatedHandlers = null;
		boolean overwritting = (flags & SyncHelper.FLAG_SYNC_LOCAL) == 0;
		// If we're doing local sync, we need to send our current dogs and those
		// we've updated
		// TODO can we just send them all along with their updated stamp?
		if (!overwritting) {
			Cursor currentHandlersIdCursor = resolver.query(
					Handlers.CONTENT_URI, new String[] { Handlers.HANDLER_ID },
					null, null, Handlers.DEFAULT_SORT);
			currentHandlerIds = new String[currentHandlersIdCursor.getCount()];
			int i = 0;
			while (currentHandlersIdCursor.moveToNext()) {
				currentHandlerIds[i++] = currentHandlersIdCursor.getString(0);
			}
			String selection = Handlers.UPDATED + " > ? ";
			String[] selectionArgs = new String[] { String.valueOf(lastSync) };
			Cursor locallyUpdated = resolver.query(Handlers.CONTENT_URI,
					Query.HandlerSyncQuery.PROJECTION, selection,
					selectionArgs, Handlers.DEFAULT_SORT);
			locallyUpdatedHandlers = new Handler[locallyUpdated.getCount()];
			Handler handler;
			i = 0;
			while (locallyUpdated.moveToNext()) {
				handler = new Handler();
				
				handler.identifier = locallyUpdated.getString(HandlerSyncQuery.HANDLER_IDENTIFIER);
				handler.isShowing = locallyUpdated.getInt(HandlerSyncQuery.HANDLER_IS_SHOWING);
				handler.isShowingJuniors = locallyUpdated.getInt(HandlerSyncQuery.HANDLER_IS_SHOWING_JUNIORS);
				handler.juniorsClassString = locallyUpdated.getString(HandlerSyncQuery.HANDLER_JUNIOR_CLASS);
				handler.name = locallyUpdated.getString(HandlerSyncQuery.HANDLER_NAME);
				handler.modifiedTimeUtc = locallyUpdated.getLong(HandlerSyncQuery.HANDLER_UPDATED);//TODO times should be longs in SQL
				locallyUpdatedHandlers[i++] = handler;
				// Create json entities and post to server with current sync and
				// last sync time.
				// Response from server should contain handlers which have changed
				// since the last sync.
			}
		}

		// Push my dogs and get back those that need updating locally
		HandlerSyncResponse[] actionable = mAccessor.syncHandlers(
				AccountUtils.getUserIdentifier(mContext),
				Prefs.getCurrentTeamIdentifier(mContext),
				SyncHelper.getLastSync(mContext), locallyUpdatedHandlers,
				currentHandlerIds);
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		if (overwritting) {
			batch.add(ContentProviderOperation.newDelete(
					DogshowContract
							.addCallerIsSyncAdapterParameter(Handlers.CONTENT_URI))
					.build());
		}
		if (actionable != null) {
			Builder builder = null;
			Log.d(TAG, "Taking sync action on " + actionable.length + " dogs.");
			for (HandlerSyncResponse response : actionable) {
				switch (response.action) {
				case HandlerSyncResponse.ACTION_ADD:
					builder = ContentProviderOperation
							.newInsert(DogshowContract
									.addCallerIsSyncAdapterParameter(Handlers.CONTENT_URI));
					builder.withValues(getHandlerContentValues(response.handler));
					batch.add(builder.build());
					break;
				case HandlerSyncResponse.ACTION_UPDATE:
					builder = ContentProviderOperation
							.newUpdate(DogshowContract
									.addCallerIsSyncAdapterParameter(Handlers.CONTENT_URI));
					builder.withSelection(Handlers.HANDLER_ID + "=?",
							new String[] { response.handler.identifier });
					builder.withValues(getHandlerContentValues(response.handler));
					batch.add(builder.build());
					break;
				case HandlerSyncResponse.ACTION_DELETE:
					builder = ContentProviderOperation
							.newDelete(DogshowContract
									.addCallerIsSyncAdapterParameter(Handlers.CONTENT_URI));
					builder.withSelection(Handlers.HANDLER_ID + "=?",
							new String[] { response.handler.identifier });
					batch.add(builder.build());
					break;
				}
			}
			try {
				resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
			} catch (RemoteException e) {
				Log.w(TAG, "Error sycing handlers");
				e.printStackTrace();
			} catch (OperationApplicationException e) {
				e.printStackTrace();
			}
		}
	}

	public ContentValues getHandlerContentValues(Handler handler) {
		ContentValues values = new ContentValues(12);
		values.put(Handlers.HANDLER_ID, handler.identifier);
		values.put(Handlers.HANDLER_IS_SHOWING, handler.isShowing);
		values.put(Handlers.HANDLER_IS_SHOWING_JUNIORS, handler.isShowingJuniors);
		values.put(Handlers.HANDLER_JUNIOR_CLASS, handler.juniorsClassString);
		values.put(Handlers.HANDLER_NAME, handler.name);
		values.put(Handlers.UPDATED, handler.modifiedTimeUtc);
		return values;
	}
}
