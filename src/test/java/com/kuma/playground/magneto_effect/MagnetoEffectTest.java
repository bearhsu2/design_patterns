package com.kuma.playground.magneto_effect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class MagnetoEffectTest {
    @Test
    void no_anchor() {

        MagnetoEffect magnetoEffect = new MagnetoEffect();

        Point before = new Point(49, 50);

        Point after = magnetoEffect.check(before);

        Assertions.assertEquals(new Point(49, 50), after);
    }

    @Test
    void one_near_anchor() {

        MagnetoEffect magnetoEffect = new MagnetoEffect();
        magnetoEffect.addAnchor(new Point(50, 50));

        Point before = new Point(49, 50);

        Point after = magnetoEffect.check(before);

        Assertions.assertEquals(new Point(50, 50), after);
    }
}