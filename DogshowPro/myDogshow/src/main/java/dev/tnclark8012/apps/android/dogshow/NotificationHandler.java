package dev.tnclark8012.apps.android.dogshow;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

import com.microsoft.windowsazure.notifications.NotificationsHandler;

import dev.tnclark8012.apps.android.dogshow.ui.phone.HomeActivity;


public class NotificationHandler extends NotificationsHandler {
	@com.google.gson.annotations.SerializedName("handle")
	private static String mHandle;
	public static final int NOTIFICATION_ID = 1;
	private NotificationManager mNotificationManager;
	NotificationCompat.Builder builder;
	Context ctx;

	public static String getHandle() {
	    return mHandle;
	}

	public static void setHandle(String handle) {
	    mHandle = handle;
	}
	
	@Override
	public void onRegistered(Context context, String gcmRegistrationId) {
	    super.onRegistered(context, gcmRegistrationId);
	    setHandle(gcmRegistrationId);
	}
	
	@Override
	public void onReceive(Context context, Bundle bundle) {
	    ctx = context;
	    String nhMessage = bundle.getString("msg");

	    sendNotification(nhMessage);
	}

	private void sendNotification(String msg) {
	    mNotificationManager = (NotificationManager)
	              ctx.getSystemService(Context.NOTIFICATION_SERVICE);

	    PendingIntent contentIntent = PendingIntent.getActivity(ctx, 0,
	          new Intent(ctx, HomeActivity.class), 0);

	    NotificationCompat.Builder mBuilder =
	          new NotificationCompat.Builder(ctx)
	          .setSmallIcon(R.drawable.ic_launcher)
	          .setContentTitle("Sync requested")
	          .setStyle(new NotificationCompat.BigTextStyle()
	                     .bigText(msg))
	          .setContentText(msg);

	     mBuilder.setContentIntent(contentIntent);
	     mNotificationManager.notify(NOTIFICATION_ID, mBuilder.build());
	}
}
