package com.alexsashkin.appinfo.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alexsashkin.appinfo.R;
import com.alexsashkin.appinfo.databinding.ActivityMainBinding;
import com.alexsashkin.appinfolib.AppInfo;
import com.jakewharton.rxbinding2.view.RxView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = DataBindingUtil.setContentView(this, R.layout.activity_main);

        RxView.clicks(layout.root).subscribe(v ->
                layout.root.setBackgroundColor(getResources().getColor(R.color.colorAccent)));
        RxView.clicks(layout.showAppinfo).subscribe(v -> AppInfo.showAppInfo(this));
    }
}
