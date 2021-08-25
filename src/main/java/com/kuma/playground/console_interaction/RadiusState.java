package com.kuma.playground.console_interaction;

public class RadiusState implements State {
    private final Module module;
    private final int r;

    public RadiusState(Module module, int r) {
        this.module = module;
        this.r = r;
    }

    @Override
    public String print() {
        return "Area=" + (r * r * 3) + ", Circumference=" + (2 * r * 3);
    }

    @Override
    public void input(String answer) {

    }
}
