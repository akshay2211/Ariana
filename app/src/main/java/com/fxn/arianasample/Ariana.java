package com.fxn.arianasample;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by akshay on 23/9/17.
 */

public class Ariana extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/pacifico.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
