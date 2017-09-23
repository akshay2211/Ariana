package com.fxn.ariana;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import java.util.Arrays;

/**
 * Created by akshay on 22/9/17.
 */

public class ArianaTextListener implements ViewPager.OnPageChangeListener {
    public int[] colorBoxes;
    private TextView textView;
    private ViewPager vp;
    private GradientAngle gradientAngle;
    private float[] position;
    private int state = 0;

    public ArianaTextListener(int[] colorBoxes, TextView textView, ViewPager vp) {
        this.colorBoxes = colorBoxes;
        this.textView = textView;
        this.vp = vp;
        this.gradientAngle = GradientAngle.LEFT_BOTTOM_TO_RIGHT_TOP;
        setposition();
    }


    public ArianaTextListener(int[] colorBoxes, TextView textView, ViewPager vp, GradientAngle gradientAngle) {
        this.colorBoxes = colorBoxes;
        this.textView = textView;
        this.vp = vp;
        this.gradientAngle = gradientAngle;
        setposition();
    }

    private void setposition() {
        position = new float[colorBoxes.length];
        Arrays.fill(position, 1);
        position[0] = 0;
    }

    public void updateposition(int pos) {
        for (int i = 0; i < pos; i++) {
            position[i] = 0;
        }
    }

    /**
     * This method will be invoked when the current page is scrolled, either as part
     * of a programmatically initiated smooth scroll or a user initiated touch scroll.
     *
     * @param position             Position index of the first page currently being displayed.
     *                             Page position+1 will be visible if positionOffset is nonzero.
     * @param positionOffset       Value from [0, 1) indicating the offset from the page at position.
     * @param positionOffsetPixels Value in pixels indicating the offset from position.
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            if (position < vp.getAdapter().getCount() - 1 && position < colorBoxes.length - 2) {
                this.position[position] = -1 * position;
                this.position[position + 1] = 1 - positionOffset;
            }
            Ariana.setGradient(textView, colorBoxes, ArianaTextListener.this.position, gradientAngle);

        }
    }

    /**
     * This method will be invoked when a new page becomes selected. Animation is not
     * necessarily complete.
     *
     * @param position Position index of the new selected page.
     */
    @Override
    public void onPageSelected(int position) {
        updateposition(position);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN && state == 0) {
            if (position < vp.getAdapter().getCount() - 1 && position < colorBoxes.length - 2) {
                this.position[position] = -1 * position;
                this.position[position + 1] = 1;
            }
            Ariana.setGradient(textView, colorBoxes, ArianaTextListener.this.position);
        }
    }

    /**
     * Called when the scroll state changes. Useful for discovering when the user
     * begins dragging, when the pager is automatically settling to the current page,
     * or when it is fully stopped/idle.
     *
     * @param state The new scroll state.
     * @see ViewPager#SCROLL_STATE_IDLE
     * @see ViewPager#SCROLL_STATE_DRAGGING
     * @see ViewPager#SCROLL_STATE_SETTLING
     */
    @Override
    public void onPageScrollStateChanged(int state) {
        this.state = state;
    }


}
