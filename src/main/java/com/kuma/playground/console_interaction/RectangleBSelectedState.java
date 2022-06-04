package com.kuma.playground.console_interaction;

public class RectangleBSelectedState implements State {
    private final Module module;

    public RectangleBSelectedState(Module module) {
        this.module = module;
    }

    @Override
    public String print() {
        return "Area=" + (module.getA() * module.getB()) + ", Circumference=" + (2 * (module.getA() + module.getB()));
    }

    @Override
    public void input(String answer) {
        // do nothing
    }
}