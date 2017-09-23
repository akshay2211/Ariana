package com.fxn.ariana;

/**
 * Created by akshay on 22/9/17.
 */

public class AngleCoordinate {
    float x1, y1, x2, y2;

    public static AngleCoordinate getAngleCoordinate(GradientAngle gradientAngle, float width, float height) {
        AngleCoordinate angleCoordinate = new AngleCoordinate();
        switch (gradientAngle) {
            case LEFT_TO_RIGHT:
                angleCoordinate.x2 = width;
                break;
            case RIGHT_TO_LEFT:
                angleCoordinate.x1 = width;
                break;
            case TOP_TO_BOTTOM:
                angleCoordinate.y2 = height;
                break;
            case BOTTOM_TO_TOP:
                angleCoordinate.y1 = height;
                break;
            case LEFT_TOP_TO_RIGHT_BOTTOM:
                angleCoordinate.x2 = width;
                angleCoordinate.y2 = height;
                break;
            case RIGHT_BOTTOM_TO_LEFT_TOP:
                angleCoordinate.x1 = width;
                angleCoordinate.y1 = height;
                break;
            case LEFT_BOTTOM_TO_RIGHT_TOP:
                angleCoordinate.x2 = width;
                angleCoordinate.y1 = height;
                break;
            case RIGHT_TOP_TO_LEFT_BOTTOM:
                angleCoordinate.x1 = width;
                angleCoordinate.y2 = height;
                break;
        }
        return angleCoordinate;
    }
}
