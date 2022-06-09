package com.kuma.playground.magneto_effect;

import java.awt.*;

public class MagnetoEffect {
    private Point anchor;

    public Point check(Point point) {

        if (anchor == null) {
            return point;
        } else {
            return anchor;
        }

    }

    public void addAnchor(Point point) {
        this.anchor = point;
    }
}
