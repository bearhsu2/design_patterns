package com.kuma.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountDownTest {

    // isStopped
    // start(secs)
    // countDown(secs)


    @Test
    void create_then_stopped() {

        CountDown countDown = new CountDown();

        assertTrue(countDown.isStopped());

    }

    @Test
    void start_1_then_NOT_stopped() {

        CountDown countDown = new CountDown();

        countDown.start(1);

        assertFalse(countDown.isStopped());

    }

    @Test
    void start_0_then_stopped() {

        CountDown countDown = new CountDown();

        countDown.start(0);

        assertTrue(countDown.isStopped());

    }

    @Test
    void start_1_countdown_1_then_stopped() {

        CountDown countDown = new CountDown();

        countDown.start(1);
        countDown.countDown(1);

        assertTrue(countDown.isStopped());

    }
    @Test
    void start_1_countdown_2_then_stopped() {

        CountDown countDown = new CountDown();

        countDown.start(1);
        countDown.countDown(2);

        assertTrue(countDown.isStopped());

    }
}