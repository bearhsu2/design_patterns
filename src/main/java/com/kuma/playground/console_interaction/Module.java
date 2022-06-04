package com.kuma.playground.console_interaction;

public class Module {
    public static final String INITIAL = "Initial";
    public static final String RECTANGLE_A_SELECTED = "RectangleASelected";
    public static final String RECTANGLE_B_SELECTED = "RectangleBSelected";
    public static final String RECTANGLE_SELECTED = "RectangleSelected";
    private final State initialState = new InitialState(this);
    private final State rectangleSelectedState = new RectangleSelectedState(this);
    private final State rectangleASelectedState = new RectangleASelectedState(this);
    private final State rectangleBSelectedState = new RectangleBSelectedState(this);
    private String status = INITIAL;
    private int a;
    private int b;


    public void setStatus(String status) {
        this.status = status;
    }

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
        if (this.status.equals(INITIAL)) {
            return initialState.print();
        }
        if (this.status.equals(RECTANGLE_SELECTED)) {
            return rectangleSelectedState.print();
        }
        if (this.status.equals(RECTANGLE_A_SELECTED)) {
            return rectangleASelectedState.print();
        }
        if (this.status.equals(RECTANGLE_B_SELECTED)) {
            return rectangleBSelectedState.print();
        }
        return "";
    }

    public void input(String answer) {
        if (this.status.equals(INITIAL)) {
            initialState.input(answer);
        } else if (this.status.equals(RECTANGLE_SELECTED)) {
            rectangleSelectedState.input(answer);
        } else if (this.status.equals(RECTANGLE_A_SELECTED)) {
            rectangleASelectedState.input(answer);
        } else if (this.status.equals(RECTANGLE_B_SELECTED)) {
            rectangleBSelectedState.input(answer);
        }

    }


}
