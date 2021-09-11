package com.kuma.playground.magneto_effect;


import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MagnetoEffect {

    private List<Point> anchors = new ArrayList<>();

    public Point check(Point point) {

        return findNearAnchor(point).orElse(point);


    }

    private Optional<Point> findNearAnchor(Point point) {

        return anchors.stream()
                .filter(anchor -> isNear(anchor, point))
                .min(Comparator.comparing(anchor -> distance(anchor, point)));

    }

    private boolean isNear(Point anchor, Point point) {
        return distance(anchor, point) <= 25;
    }

    private double distance(Point anchor, Point point) {
        return Math.pow(point.x - anchor.x, 2) + Math.pow(point.y - anchor.y, 2);
    }

    public void addAnchor(Point anchor) {

        this.anchors.add(anchor);

    }
}
