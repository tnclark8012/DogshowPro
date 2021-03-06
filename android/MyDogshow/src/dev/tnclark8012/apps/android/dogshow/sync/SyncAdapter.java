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

package dev.tnclark8012.apps.android.dogshow.sync;

import java.io.IOException;
import java.util.regex.Pattern;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.BuildConfig;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

/**
 * Sync adapter for dog show
 */
public class SyncAdapter extends AbstractThreadedSyncAdapter {

    private static final String TAG = SyncAdapter.class.getSimpleName();

    private static final Pattern sSanitizeAccountNamePattern = Pattern.compile("(.).*?(.?)@");

    private final Context mContext;
    private SyncHelper mSyncHelper;
    public static final String SYNC_EXTRAS_FLAGS = "flags";

    public SyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);
        mContext = context;

        //noinspection ConstantConditions,PointlessBooleanExpression
        if (!BuildConfig.DEBUG) {
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread thread, Throwable throwable) {
                    Log.e(TAG, "Uncaught sync exception, suppressing UI in release build.",
                            throwable);
                }
            });
        }
    }

    @Override
    public void onPerformSync(final Account account, Bundle extras, String authority,
            final ContentProviderClient provider, final SyncResult syncResult) {
        final boolean uploadOnly = extras.getBoolean(ContentResolver.SYNC_EXTRAS_UPLOAD, false);
        final boolean manualSync = extras.getBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, false);
        final boolean initialize = extras.getBoolean(ContentResolver.SYNC_EXTRAS_INITIALIZE, false);
        final int flags = extras.getInt(SYNC_EXTRAS_FLAGS, SyncHelper.FLAG_SYNC_LOCAL | SyncHelper.FLAG_SYNC_REMOTE);
        final String logSanitizedAccountName = sSanitizeAccountNamePattern
                .matcher(account.name).replaceAll("$1...$2@");

        if (uploadOnly) {
            return;
        }

        Log.i(TAG, "Beginning sync for account " + logSanitizedAccountName + "," +
                " uploadOnly=" + uploadOnly +
                " manualSync=" + manualSync +
                " initialize=" + initialize);

        String chosenAccountName = AccountUtils.getChosenAccountName(mContext);
        boolean isAccountSet = !TextUtils.isEmpty(chosenAccountName);
        boolean isChosenAccount = isAccountSet && chosenAccountName.equals(account.name);
        if (isAccountSet) {
            ContentResolver.setIsSyncable(account, authority, isChosenAccount ? 1 : 0);
        }
        if (!isChosenAccount) {
            Log.w(TAG, "Tried to sync account " + logSanitizedAccountName + " but the chosen " +
                    "account is actually " + chosenAccountName);
            ++syncResult.stats.numAuthExceptions;
            return;
        }

        // Perform a sync using SyncHelper
        if (mSyncHelper == null) {
            mSyncHelper = new SyncHelper(mContext);
        }

        try {
            mSyncHelper.performSync(syncResult,
                    flags);

        } catch (IOException e) {
            ++syncResult.stats.numIoExceptions;
            Log.e(TAG, "Error syncing data for Dog Show Pro.", e);
        }
    }
}
