package com.kuma.playground.console_interaction;

public class RectangleASelectedState implements State {
    private final Module module;

    public RectangleASelectedState(Module module) {
        this.module = module;
    }

    @Override
    public String print() {
        return "Rectangle side B length?";
    }

    @Override
    public void input(String answer) {
        try {
            Integer answerInt = Integer.valueOf(answer);
            module.setB(answerInt);
            module.setStatus(Module.RECTANGLE_B_SELECTED);
        } catch (NumberFormatException e) {
            return;
        }
    }
}