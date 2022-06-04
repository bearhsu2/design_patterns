package com.kuma.playground.console_interaction;

public class RectangleSelectedState {
    private final Module module;

    public RectangleSelectedState(Module module) {
        this.module = module;
    }

    String print() {
        return "Rectangle side A length?";
    }

    void input(String answer) {
        try {
            Integer answerInt = Integer.valueOf(answer);
            module.setA(answerInt);
            module.setStatus(Module.RECTANGLE_A_SELECTED);
        } catch (NumberFormatException e) {
            return;
        }
    }
}