package com.kuma.playground.console_interaction;

public class ASelectedState implements State {
    private final Module module;
    private final int a;

    public ASelectedState(Module module, int a) {
        this.module = module;
        this.a = a;
    }

    public String print() {
        return "Rectangle side B length?";
    }

    public void input(String answer) {
        try {
            int b = Integer.parseInt(answer);

            module.setState(new BSelectedState(this.module, a, b));
        } catch (NumberFormatException e) {
            // do nothing
        }
    }
}