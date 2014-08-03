package dev.tnclark8012.apps.android.dogshow.sync;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class GcmBroadcastReceiver extends BroadcastReceiver {
    // Constants
    // Content provider authority
    public static final String AUTHORITY = DogshowContract.CONTENT_AUTHORITY;
    // Account
    // Incoming Intent key for extended data
    public static final String KEY_SYNC_REQUEST =
            "dev.tnclark8012.apps.android.dogshow.sync.KEY_SYNC_REQUEST";
    
    @Override
    public void onReceive(Context context, Intent intent) {
        // Get a GCM object instance
        GoogleCloudMessaging gcm =
                GoogleCloudMessaging.getInstance(context);
        // Get the type of GCM message
        String messageType = gcm.getMessageType(intent);
        /*
         * Test the message type and examine the message contents.
         * Since GCM is a general-purpose messaging system, you
         * may receive normal messages that don't require a sync
         * adapter run.
         * The following code tests for a a boolean flag indicating
         * that the message is requesting a transfer from the device.
         */
        if (GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE.equals(messageType)
            &&
            intent.getBooleanExtra(KEY_SYNC_REQUEST, false)) {
            /*
             * Signal the framework to run your sync adapter. Assume that
             * app initialization has already created the account.
             */
            ContentResolver.requestSync(AccountUtils.getChosenAccount(context), AUTHORITY, null);
            
        }
        
    }
    
}