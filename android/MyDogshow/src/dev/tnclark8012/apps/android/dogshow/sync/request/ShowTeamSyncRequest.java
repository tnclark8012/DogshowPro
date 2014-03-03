package dev.tnclark8012.apps.android.dogshow.sync.request;

import dev.tnclark8012.apps.android.dogshow.model.ShowTeam;

public class ShowTeamSyncRequest {
	public long lastSync;
	public String userIdentifier;
	public String[] allTeamIds;
	public ShowTeam[] teams;
}
