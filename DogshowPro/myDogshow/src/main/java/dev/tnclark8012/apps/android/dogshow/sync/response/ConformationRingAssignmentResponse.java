package dev.tnclark8012.apps.android.dogshow.sync.response;

import dev.tnclark8012.apps.android.dogshow.model.BreedRing;

/**
 * Created by Taylor on 8/7/2014.
 * This class represents a breed (conformation) ring assignment. It contains the show ring and all dogs that will be showing in it
 */
public class ConformationRingAssignmentResponse {
    public String[] dogIdentifiers;
    public BreedRing ring;
}
