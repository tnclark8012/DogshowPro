package dev.tnclark8012.apps.android.dogshow.sync.response;

import dev.tnclark8012.apps.android.dogshow.model.Handler;

public class HandlerSyncResponse {
	public static final int ACTION_ADD = 1;
	public static final int ACTION_UPDATE = 0;
	public static final int ACTION_DELETE = -1;
	public int action;
	public Handler handler;
}