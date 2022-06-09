package com.kuma.playground.magneto_effect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class MagnetoEffectTest {

    private final MagnetoEffect magnetoEffect = new MagnetoEffect();
    private Point before;
    private Point after;

    @Test
    void no_anchor() {
        given_mouse_was_at(49, 50);
        when_check();
        then_mouse_new_position_is(49, 50);
    }

    private void given_mouse_was_at(int x, int y) {
        before = new Point(x, y);
    }

    private void when_check() {
        after = magnetoEffect.check(before);
    }

    private void then_mouse_new_position_is(int x, int y) {
        Assertions.assertEquals(new Point(x, y), after);
    }

    @Test
    void one_near_anchor() {
        given_anchor_is(50, 50);
        given_mouse_was_at(49, 50);
        when_check();
        then_mouse_new_position_is(50, 50);
    }

    private void given_anchor_is(int x, int y) {
        magnetoEffect.addAnchor(new Point(x, y));
    }

    @Test
    void one_far_anchor() {
        given_anchor_is(0, 0);
        given_mouse_was_at(49, 50);
        when_check();
        then_mouse_new_position_is(49, 50);
    }
}