package com.kuma.playground.console_interaction;


public class InitialState implements State {
    private final Module module;

    public InitialState(Module module) {
        this.module = module;
    }

    @Override
    public String print() {
        return "Shape: (C)ircle or (R)ectangle?";
    }

    @Override
    public void input(String answer) {
        if (answer.equals("R")) {
            module.setState(new RectangleSelectedState(this.module));
        } else if (answer.equals("C")) {
            module.setState(new CircleSelectedState(this.module));

        }
    }
}