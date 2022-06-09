package com.kuma.playground.magneto_effect;

import java.awt.*;

public class MagnetoEffect {
    private Point anchor;

    public Point check(Point point) {

        if (anchor == null) {
            return point;
        }

        if (isFarFromAnchor(point)) {
            return point;
        }

        return anchor;

    }

    private boolean isFarFromAnchor(Point point) {
        return Math.pow(anchor.x - point.x, 2) + Math.pow(anchor.y - point.y, 2) > Math.pow(5, 2);
    }

    public void addAnchor(Point point) {
        this.anchor = point;
    }
}
