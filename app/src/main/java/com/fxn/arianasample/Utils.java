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
                Color.parseColor("#1BFFFF"),
                Color.parseColor("#2E3192"),
                Color.parseColor("#ED1E79"),
                Color.parseColor("#009E00"),
                Color.parseColor("#FBB03B"),
                Color.parseColor("#D4145A"),
                Color.parseColor("#3AA17E"),
                Color.parseColor("#00537E"),
        };
    }

    public static String[] getTexts() {
        return new String[]{
                "Relax, its only ONES and ZEROS !",
                "Hardware: The parts of a computer system that can be kicked.",
                "Computer dating is fine, if you're a computer.",
                "Better to be a geek than an idiot.",
                "If you don't want to be replaced by a computer, don't act like one.",
                "I'm not anti-social; I'm just not user friendly",
                "Those who can't write programs, write help files.",
                "The more I C, the less I see.  "
        };
    }
}
