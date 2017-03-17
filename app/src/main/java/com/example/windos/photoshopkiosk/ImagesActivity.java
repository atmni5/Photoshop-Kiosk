package com.example.windos.photoshopkiosk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;
import java.util.ArrayList;

public class ImagesActivity extends AppCompatActivity {

    public static final String TAG = "Photoshop Kiosk";
    Globals g = Globals.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        ImageView[] images = new ImageView[3];
        images = getImagesFromSDCard();
    }

    public ImageView[] getImagesFromSDCard(){
        ArrayList<String> files = new ArrayList<String>();
        File[] listFile;
        File file = new File(android.os.Environment.getExternalStorageDirectory(), "Photoshop Images");

        if(file.isDirectory()){
            listFile = file.listFiles();

            for (int i = 0; i < listFile.length; ++i){
                files.add(listFile[i].getAbsolutePath());
            }
        }

        g.setImagePaths(files);

        return ;
    }
}
