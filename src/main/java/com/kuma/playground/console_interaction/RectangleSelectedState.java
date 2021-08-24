package com.kuma.playground.console_interaction;

public class RectangleSelectedState implements State {
    private final Module module;

    public RectangleSelectedState(Module module) {
        this.module = module;
    }

    public String print() {
        return "Rectangle side A length?";
    }

    public void input(String answer) {
        try {

            module.setState(new ASelectedState(this.module, Integer.parseInt(answer)));
        } catch (NumberFormatException e) {
            // do nothing
        }
    }
}