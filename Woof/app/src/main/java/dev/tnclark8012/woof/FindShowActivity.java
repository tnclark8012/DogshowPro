package dev.tnclark8012.woof;

import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.ViewTreeObserver;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dev.tnclark8012.woof.model.Show;
import dev.tnclark8012.woof.ui.widget.FindShowInfoWindowAdapter;
import dev.tnclark8012.woof.util.LogUtils;
import dev.tnclark8012.woof.web.Api;

import static dev.tnclark8012.woof.util.LogUtils.LOGE;

public class FindShowActivity extends FragmentActivity implements GoogleMap.OnInfoWindowClickListener {
    private static LatLngBounds USA = new LatLngBounds(
            new LatLng(24.787382, -80.291890), // NW Tip of Washington
            new LatLng(48.359859, -124.624869));// SE Tip of Florida

    private static String LOG_TAG = LogUtils.makeLogTag(FindShowActivity.class);

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    private HashMap<LatLng, Show> positionShowMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_show);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    public void onInfoWindowClick(Marker marker)
    {
        Show selectedShow = this.positionShowMap.get(marker.getPosition());
        Snackbar.make(findViewById(android.R.id.content), "Entering " + selectedShow.location, Snackbar.LENGTH_LONG)
                .setAction("Undo", null).show();
    }
    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            final SupportMapFragment mapFragment =  ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map));
            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    mMap = googleMap;
                    final ViewTreeObserver mapTreeObserver = mapFragment.getView().getViewTreeObserver();
                    if (mapTreeObserver.isAlive()) {
                        mapTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                            @Override
                            public void onGlobalLayout() {
                                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
                                    mapFragment.getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                } else {
                                    mapFragment.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                }
                                setUpMap();
                            }
                        });
                    }
                }
            });
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.setInfoWindowAdapter(new FindShowInfoWindowAdapter(this));
        mMap.setOnInfoWindowClickListener(this);
        this.positionShowMap = new HashMap<>();
        populateMap();
    }

    private void populateMap() {
        AsyncTask<Void, Void, MarkerOptions[]> asyncTask = new AsyncTask<Void, Void, MarkerOptions[]>() {
            @Override
            protected MarkerOptions[] doInBackground(Void... params) {
                Show[] shows = Api.GetAllShows();
                List<MarkerOptions> markers = new ArrayList<>(shows.length);
                Geocoder geocoder = new Geocoder(FindShowActivity.this);
                List<Address> addresses;
                Address bestMatch;
                LatLng position;
                MarkerOptions marker;
                for (int i = 0; i < shows.length; i++) {
                    try {
                        addresses = geocoder.getFromLocationName(shows[i].location, 1);
                        if (!addresses.isEmpty()) {
                            bestMatch = addresses.get(0);
                            position = new LatLng(bestMatch.getLatitude(), bestMatch.getLongitude());
                            positionShowMap.put(position, shows[i]);
                            marker = new MarkerOptions()
                                    .position(position)
                                    .title(shows[i].location);

                            if(!shows[i].hasSchedule)
                            {
                                marker.snippet(getString(R.string.warning_no_schedule));
                            }
                            markers.add(marker);
                        }
                    } catch (IOException ex) {
                        LOGE(LOG_TAG, "Exception while resolving location " + shows[i].location + ": " + ex);
                    }
                }

                return markers.toArray(new MarkerOptions[markers.size()]);
            }

            @Override
            protected void onPostExecute(MarkerOptions[] markerOptions) {
                LatLngBounds.Builder boundsBuilder = LatLngBounds.builder();

                for(MarkerOptions options : markerOptions)
                {
                    boundsBuilder.include(options.getPosition());
                    mMap.addMarker(options);
                }

                mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(boundsBuilder.build(), 100));
            }
        };
        asyncTask.execute();
    }
}
