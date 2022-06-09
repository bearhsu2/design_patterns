package com.kuma.playground.magneto_effect;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MagnetoEffect {
    private List<Point> anchors = new ArrayList<>();

    public Point check(Point point) {


        double nearestDistance = Double.MAX_VALUE;
        Point nearestAnchor = null;
        for (Point anchor : anchors) {
            double distance = Math.pow(anchor.x - point.x, 2) + Math.pow(anchor.y - point.y, 2);
            if (distance <= Math.pow(5, 2)) {

                if (distance < nearestDistance) {
                    nearestAnchor = anchor;
                    nearestDistance = distance;

                }
            }
        }

        if (nearestAnchor == null) {
            return point;
        } else {
            return nearestAnchor;
        }

    }

    public void addAnchor(Point point) {
        this.anchors.add(point);
    }
}
