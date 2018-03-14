package com.alexsashkin.appinfolib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.alexsashkin.appinfolib.activities.InfoActivity;

public class AppInfo {

    private static Context context;

    public static void init(Context appContext) {
        context = appContext;
    }

    public static void showAppInfo(Activity activity) {
        Intent intent = new Intent(context, InfoActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
