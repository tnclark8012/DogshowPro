package dev.tnclark8012.apps.android.dogshow.sync.request;

import dev.tnclark8012.apps.android.dogshow.model.Handler;

public class HandlerSyncRequest {
	public long lastSync;
	public String userIdentifier;
	public String teamIdentifier;
	public String[] allHandlerIds;
	public Handler[] handlers;
}
