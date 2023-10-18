package com.saradabar.setupwarning;

import android.app.Activity;
import android.os.Bundle;

import static android.view.View.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getWindow().getDecorView().setSystemUiVisibility(
            SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                + SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                + SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                + SYSTEM_UI_FLAG_HIDE_NAVIGATION
                + SYSTEM_UI_FLAG_FULLSCREEN
        );
    }

    @Override
    public void onBackPressed() {
    }

    @Override
    public void onPause() {
        super.onPause();
        finishAndRemoveTask();
    }
}