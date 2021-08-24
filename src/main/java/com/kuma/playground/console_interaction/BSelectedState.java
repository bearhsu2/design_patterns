package com.kuma.playground.console_interaction;

public class BSelectedState implements State {
    private final Module module;
    private final int a;
    private final int b;

    public BSelectedState(Module module, int a, int b) {
        this.module = module;
        this.a = a;
        this.b = b;
    }

    @Override
    public String print() {
        return "Area=" + (a * b) + ", Circumference=" + (2 * (a + b));
    }

    @Override
    public void input(String answer) {
        // do nothing
    }
}