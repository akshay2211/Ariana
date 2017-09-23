package com.fxn.ariana;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.widget.TextView;

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
        return drawable(colorBoxes, position, GradientAngle.LEFT_TOP_TO_RIGHT_BOTTOM);
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
        return drawable(colorBoxes, GradientAngle.LEFT_TOP_TO_RIGHT_BOTTOM);
    }

    //for texts

    public static void setGradient(TextView textView, final int[] colorBoxes, final float[] position, final GradientAngle gradientAngle) {
        AngleCoordinate ac = AngleCoordinate.getAngleCoordinate(gradientAngle, textView.getWidth(), textView.getHeight());
        LinearGradient linearGradient = new LinearGradient(ac.x1, ac.y1, ac.x2, ac.y2,
                colorBoxes,
                position,
                Shader.TileMode.REPEAT);
        textView.invalidate();
        textView.getPaint().setShader(linearGradient);
    }

    public static void setGradient(TextView textView, final int[] colorBoxes, final GradientAngle gradientAngle) {
        float[] position = new float[colorBoxes.length];
        for (int i = 0; i < position.length; i++) {
            position[i] = i * ((float) 1) / (position.length - 1);
        }
        position[position.length - 1] = 1;
        setGradient(textView, colorBoxes, position, gradientAngle);
    }

    public static void setGradient(TextView textView, final int[] colorBoxes, float[] position) {
        setGradient(textView, colorBoxes, position, GradientAngle.LEFT_BOTTOM_TO_RIGHT_TOP);
    }

    public static void setGradient(TextView textView, final int[] colorBoxes) {
        setGradient(textView, colorBoxes, GradientAngle.LEFT_BOTTOM_TO_RIGHT_TOP);
    }

}
