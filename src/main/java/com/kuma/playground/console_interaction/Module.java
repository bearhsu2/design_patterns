package com.kuma.playground.console_interaction;

public class Module {

    private State state = new InitialState(this);
    private int a;
    private int b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String print() {
        return this.state.print();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void input(String answer) {
        this.state.input(answer);
    }


}
