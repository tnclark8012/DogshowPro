package dev.tnclark8012.apps.android.dogshow.sync.request;

import dev.tnclark8012.apps.android.dogshow.model.Dog;

public class DogSyncRequest {
	public long lastSync;
	public String userIdentifier;
	public String teamIdentifier;
	public String[] allDogIds;
	public Dog[] dogs;
}
