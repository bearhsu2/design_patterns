package com.kuma.playground.console_interaction;

public class Module {
    private State state = new InitialState(this);

    public String print() {
        return this.state.print();
    }

    public void input(String answer) {
        this.state.input(answer);
    }

    public void setState(State state) {
        this.state = state;
    }
}
