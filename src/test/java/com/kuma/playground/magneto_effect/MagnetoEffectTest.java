package com.kuma.playground.magneto_effect;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagnetoEffectTest {

    @Test
    void no_anchor() {

        MagnetoEffect magnetoEffect = new MagnetoEffect();

        Point after = magnetoEffect.check(point(49, 50));

        assertEquals(point(49, 50), after);

    }

    @Test
    void one_near_anchor() {

        MagnetoEffect magnetoEffect = new MagnetoEffect();
        magnetoEffect.addAnchor(point(50, 50));

        Point after = magnetoEffect.check(point(49, 50));

        assertEquals(point(50, 50), after);

    }

    @Test
    void one_far_anchor() {

        MagnetoEffect magnetoEffect = new MagnetoEffect();
        magnetoEffect.addAnchor(point(0, 0));

        Point after = magnetoEffect.check(point(49, 50));

        assertEquals(point(49, 50), after);

    }

    @Test
    void two_anchors_and_only_one_is_near() {

        MagnetoEffect magnetoEffect = new MagnetoEffect();
        magnetoEffect.addAnchor(point(50, 49));
        magnetoEffect.addAnchor(point(50, 50));

        Point after = magnetoEffect.check(point(49, 50));

        assertEquals(point(50, 50), after);

    }

    private Point point(int x, int y) {
        return new Point(x, y);
    }
}