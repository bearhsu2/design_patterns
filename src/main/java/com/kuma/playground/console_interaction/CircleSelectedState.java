package com.kuma.playground.console_interaction;

public class CircleSelectedState implements State {
    private final Module module;

    public CircleSelectedState(Module module) {
        this.module = module;
    }

    @Override
    public String print() {
        return "Circle radius?";
    }

    @Override
    public void input(String answer) {

        try {
            int r = Integer.parseInt(answer);

            module.setState(new RadiusState(this.module, r));
        } catch (NumberFormatException e) {
            // do nothing

        }
    }
}
