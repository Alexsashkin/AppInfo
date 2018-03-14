package com.alexsashkin.appinfo;

import android.support.multidex.MultiDexApplication;

import com.alexsashkin.appinfolib.AppInfo;
import com.facebook.stetho.Stetho;

public class AIApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        setupStetho();
        setupAppInfo();
    }

    private void setupStetho() {
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }

    private void setupAppInfo() {
        AppInfo.init(this);
    }
}
