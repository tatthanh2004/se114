package com.example.bt2;

import android.content.Context;
import android.content.SharedPreferences;

public class Storage {
    private static final String PREFS_NAME = "storage";

    public static void saveData(Context context, String name, String description) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        prefs.edit().putString("name", name).putString("description", description).apply();
    }

    public static String getName(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getString("name", "");
    }

    public static String getDescription(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getString("description", "");
    }
}