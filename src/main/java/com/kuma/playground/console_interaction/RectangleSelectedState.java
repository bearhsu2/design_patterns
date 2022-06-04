package com.kuma.playground.console_interaction;

public class RectangleSelectedState implements State {
    private final Module module;

    public RectangleSelectedState(Module module) {
        this.module = module;
    }

    @Override
    public String print() {
        return "Rectangle side A length?";
    }

    @Override
    public void input(String answer) {
        try {
            Integer answerInt = Integer.valueOf(answer);
            module.setA(answerInt);

            module.setState(new RectangleASelectedState(this.module));
        } catch (NumberFormatException e) {
            return;
        }
    }
}