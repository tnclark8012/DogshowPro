package dev.tnclark8012.woof.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import dev.tnclark8012.woof.R;

public class FindShowInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private Context context;

    public FindShowInfoWindowAdapter(Context context)
    {
        this.context = context;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.choose_show_marker_window, null);

        if(marker.getSnippet() != null) {
            View noSchedule = view.findViewById(R.id.choose_show_marker_window_snippet);
            noSchedule.setVisibility(View.VISIBLE);
        }

        TextView locationText = (TextView)view.findViewById(R.id.choose_show_marker_window_title);
        locationText.setText(marker.getTitle());

        return view;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }
}