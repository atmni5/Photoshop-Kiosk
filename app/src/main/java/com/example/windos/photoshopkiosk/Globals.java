package com.example.windos.photoshopkiosk;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Windos on 16/03/2017.
 */

public class Globals {
    private static Globals instance;
    private static String event;
    private static int day;
    private static int month;
    private static int year;
    private static ArrayList<String> images;

    private Globals(){};

    public void setEvent(String e){
        Globals.event = e;
    }

    public String getEvent(){
        return Globals.event;
    }

    public void setDate(int d, int m, int y){
        Globals.day = d;
        Globals.month = m;
        Globals.year = y;
    }

    public int[] getDate(){
        int[] date = {Globals.day, Globals.month, Globals.year};
        return date;
    }

    public void setImagePaths(ArrayList<String> files){
        Globals.images = files;
    }

    public ArrayList<String> getImagePaths(){
        return Globals.images;
    }

    public static synchronized Globals getInstance(){
        if(instance == null){
            instance = new Globals();
        }
        return instance;
    }
}
