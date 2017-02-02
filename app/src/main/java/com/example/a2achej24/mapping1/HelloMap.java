package com.example.a2achej24.mapping1;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class HelloMap extends Activity
    implements View.OnClickListener {

    MapView mv;


    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this line tells OpenStreetMap about our app.
        // If you miss this out, you might get banned from OSM servers
        Configuration.getInstance().load
                (this, PreferenceManager.getDefaultSharedPreferences(this));

        mv = (MapView) findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.getController().setZoom(14);
        mv.getController().setCenter(new GeoPoint(40.1, -22.5));

        Button SubmitButton = (Button) findViewById(R.id.SubmitButton);
        SubmitButton.setOnClickListener(this);
    }

    public void onClick(View v) {

        //retrieve the latitude
        EditText LatitudeEditText = (EditText) findViewById(R.id.latitudeEditText);
        double latitude = Double.parseDouble(LatitudeEditText.getText().toString());

        // retrieve the longitude
        EditText LongitudeEditText = (EditText) findViewById(R.id.LongitudeEditText);
        double longitude = Double.parseDouble(LatitudeEditText.getText().toString());

        // set the map to the new latitude and longitude


    }
}




