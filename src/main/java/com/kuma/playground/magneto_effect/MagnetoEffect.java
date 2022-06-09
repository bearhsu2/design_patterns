package com.kuma.playground.magneto_effect;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MagnetoEffect {
    private List<Point> anchors = new ArrayList<>();

    public Point check(Point point) {

        if (anchors.isEmpty()) {
            return point;
        }

        Point nearAnchor = null;
        for (Point anchor : anchors) {
            double distance = Math.pow(anchor.x - point.x, 2) + Math.pow(anchor.y - point.y, 2);
            if (distance <= Math.pow(5, 2)) {
                nearAnchor = anchor;
            }
        }

        if (nearAnchor == null) {
            return point;
        } else {
            return nearAnchor;
        }

    }

    public void addAnchor(Point point) {
        this.anchors.add(point);
    }
}
