package com.kuma.playground.console_interaction;

public class RectangleBSelectedState {
    private final Module module;

    public RectangleBSelectedState(Module module) {
        this.module = module;
    }

    String print() {
        return "Area=" + (module.getA() * module.getB()) + ", Circumference=" + (2 * (module.getA() + module.getB()));
    }

    void input(String answer) {
        // do nothing
        System.out.println("");
    }
}