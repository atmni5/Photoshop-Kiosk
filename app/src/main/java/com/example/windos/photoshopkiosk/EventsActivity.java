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
    Globals g = Globals.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }

    public void onEventClick(View v){
        ImageButton event = (ImageButton) v;
        String eventButton = getResources().getResourceEntryName(event.getId());
        if (eventButton.compareTo("dolphinBtn") == 0){
            Log.d(TAG, "Dolphin");
            g.setEvent("Dolphin");
        }
        else if(eventButton.compareTo("desertBtn") == 0){
            Log.d(TAG, "Desert");
            g.setEvent("Desert");
        }
        else{
            Log.d(TAG, "Quad");
            g.setEvent("Quad");
        }
        startActivity(new Intent(getApplicationContext(), YearActivity.class));
    }

}
