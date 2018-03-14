package com.alexsashkin.appinfolib.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.alexsashkin.appinfolib.R;
import com.alexsashkin.appinfolib.databinding.ActivityInfoBinding;
import com.jakewharton.rxbinding2.view.RxView;

public class InfoActivity extends AppCompatActivity {

    private ActivityInfoBinding layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        layout = DataBindingUtil.setContentView(this, R.layout.activity_info);

        setupClickListener();
    }

    private void setupClickListener() {
        RxView.clicks(layout.info).subscribe(v -> layout.info.setText(R.string.test));
        RxView.clicks(layout.close).subscribe(v -> finish());
    }
}
