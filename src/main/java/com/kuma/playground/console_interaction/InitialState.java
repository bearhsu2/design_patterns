package com.kuma.playground.console_interaction;

public class InitialState {
    private final Module module;

    public InitialState(Module module) {
        this.module = module;
    }

    String printInitial() {
        return "Shape: (C)ircle or (R)ectangle?";
    }

    void inputInitial(String answer) {
        if (answer.equals("R")) {
            module.setStatus(Module.RECTANGLE_SELECTED);
        }
    }
}