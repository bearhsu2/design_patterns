package com.kuma.playground.magneto_effect;

import java.awt.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MagnetoEffect {
    private List<Point> anchors = new ArrayList<>();

    public Point check(Point point) {
        Optional<Point> nearestAnchor = findNearestAnchorFor(point);
        return nearestAnchor.orElse(point);
    }

    private Optional<Point> findNearestAnchorFor(Point point) {
        return anchors.stream()
                .map(anchor -> new AbstractMap.SimpleEntry<Point, Double>(anchor, getDistance(anchor, point)))
                .filter(entry -> entry.getValue() < Math.pow(5, 2))
                .min(java.util.Map.Entry.comparingByValue())
                .map(AbstractMap.SimpleEntry::getKey);
    }

    private double getDistance(Point point1, Point point2) {
        return Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2);
    }

    public void addAnchor(Point point) {
        this.anchors.add(point);
    }
}
