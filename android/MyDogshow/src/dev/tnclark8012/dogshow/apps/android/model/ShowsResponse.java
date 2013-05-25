package dev.tnclark8012.dogshow.apps.android.model;

import com.google.gson.annotations.SerializedName;

public class ShowsResponse {
	@SerializedName("show")
    public Show[] shows;
}
