package dev.tnclark8012.dogshow.shared.driver;

import com.google.gson.annotations.SerializedName;

public class BreedRingsResponse {
	@SerializedName("breedRing")
    public BreedRing[] breedRings;
}
