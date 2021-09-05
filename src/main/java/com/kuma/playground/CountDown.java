package com.kuma.playground;

public class CountDown {

    private int remaining = 0;

    public boolean isStopped() {
        return remaining <= 0;
    }

    public void start(int seconds) {
        this.remaining = seconds;
    }

    public void countDown(int seconds) {
        this.remaining -= seconds;
    }
}
