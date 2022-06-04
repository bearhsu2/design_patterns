package com.kuma.playground.console_interaction;

public class RectangleASelectedState {
    private final Module module;

    public RectangleASelectedState(Module module) {
        this.module = module;
    }

    String print() {
        return "Rectangle side B length?";
    }

    void input(String answer) {
        try {
            Integer answerInt = Integer.valueOf(answer);
            module.setB(answerInt);
            module.setStatus(Module.RECTANGLE_B_SELECTED);
        } catch (NumberFormatException e) {
            return;
        }
    }
}