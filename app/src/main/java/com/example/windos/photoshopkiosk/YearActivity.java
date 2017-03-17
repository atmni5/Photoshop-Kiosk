package com.example.windos.photoshopkiosk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class YearActivity extends AppCompatActivity {

    public static final String TAG = "Photoshop Kiosk";
    Globals g = Globals.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
    }

    public void dateSet(View v){
        DatePicker date = (DatePicker) findViewById(R.id.datePicker);
        int month = date.getMonth();
        int year = date.getYear();
        int day = date.getDayOfMonth();
        g.setDate(date.getDayOfMonth(), date.getMonth(), date.getYear());
        int[] dateX = g.getDate();
        Log.d(TAG, g.getEvent() + " " + dateX[0] + " " + dateX[1] + " " + dateX[2]);
        startActivity(new Intent(getApplicationContext(), ImagesActivity.class));
    }

}
