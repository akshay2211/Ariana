package com.fxn.arianasample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by akshay on 23/9/17.
 */

class Utils {

    public static void hideStatusbar(Activity context) {
        if (Build.VERSION.SDK_INT < 16) {
            context.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            View decorView = context.getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    public static int[] getColors() {
        return new int[]{
                Color.parseColor("#2E3192"),
                Color.parseColor("#1BFFFF"),
                Color.parseColor("#D4145A"),
                Color.parseColor("#FBB03B"),
                Color.parseColor("#FCEE21"),
                Color.parseColor("#009245"),
                Color.parseColor("#FFFF96"),
                Color.parseColor("#D4145A"),
        };
    }
}
