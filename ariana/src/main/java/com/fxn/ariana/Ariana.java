package com.fxn.ariana;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/**
 * Created by akshay on 22/9/17.
 */

public class Ariana {

    public static Drawable drawable(final int[] colorBoxes, final float[] position, final GradientAngle gradientAngle) {
        ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory() {
            @Override
            public Shader resize(int width, int height) {
                AngleCoordinate ac = AngleCoordinate.getAngleCoordinate(gradientAngle, width, height);
                LinearGradient linearGradient = new LinearGradient(ac.x1, ac.y1, ac.x2, ac.y2,
                        colorBoxes,
                        position,
                        Shader.TileMode.REPEAT);
                return linearGradient;
            }
        };
        PaintDrawable paint = new PaintDrawable();
        paint.setShape(new RectShape());
        paint.setShaderFactory(shaderFactory);
        return paint;
    }

    public static Drawable drawable(final int[] colorBoxes, final float[] position) {
        return drawable(colorBoxes, position, GradientAngle.RIGHT_BOTTOM_TO_LEFT_TOP);
    }

    public static Drawable drawable(final int[] colorBoxes, final GradientAngle gradientAngle) {
        float[] position = new float[colorBoxes.length];
        for (int i = 0; i < position.length; i++) {
            position[i] = i * ((float) 1) / (position.length - 1);
        }
        position[position.length - 1] = 1;
        return drawable(colorBoxes, position, gradientAngle);
    }

    public static Drawable drawable(final int[] colorBoxes) {
        return drawable(colorBoxes, GradientAngle.LEFT_BOTTOM_TO_RIGHT_TOP);
    }
}
