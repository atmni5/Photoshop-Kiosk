package com.example.windos.photoshopkiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }

    public void onButtonClick(View v){
        Button button2 = (Button) v;
        startActivity(new Intent(getApplicationContext(), nextScreen.class));
    }

}
