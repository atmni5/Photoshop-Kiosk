package com.example.windos.photoshopkiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EventsActivity extends AppCompatActivity {
    public static final String TAG = "Photoshop Kiosk";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }

    public void onEventClick(View v){
        ImageButton event = (ImageButton) v;
        Log.d(TAG, "Hello " + getResources().getResourceEntryName(event.getId()) + " Yo Whaddup");
        startActivity(new Intent(getApplicationContext(), YearActivity.class));
    }

}
