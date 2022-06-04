package com.kuma.playground.console_interaction;

public class Module {
    public static final String INITIAL = "Initial";
    public static final String RECTANGLE_A_SELECTED = "RectangleASelected";
    public static final String RECTANGLE_B_SELECTED = "RectangleBSelected";
    public static final String RECTANGLE_SELECTED = "RectangleSelected";
    private final InitialState initialState = new InitialState(this);
    private String status = INITIAL;
    private int a;
    private int b;

    public String getStatus() {
        return status;
    }

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
            return initialState.printInitial();
        }
        if (this.status.equals(RECTANGLE_SELECTED)) {
            return "Rectangle side A length?";
        }
        if (this.status.equals(RECTANGLE_A_SELECTED)) {
            return "Rectangle side B length?";
        }
        if (this.status.equals(RECTANGLE_B_SELECTED)) {
            return "Area=" + (a * b) + ", Circumference=" + (2 * (a + b));
        }
        return "";
    }

    private String printInitial() {
        return initialState.printInitial();
    }

    public void input(String answer) {
        if (this.status.equals(INITIAL)) {
            initialState.inputInitial(answer);
        } else if (this.status.equals(RECTANGLE_SELECTED)) {

            try {
                Integer answerInt = Integer.valueOf(answer);
                this.a = answerInt;
                this.status = RECTANGLE_A_SELECTED;
            } catch (NumberFormatException e) {
                return;
            }

        } else if (this.status.equals(RECTANGLE_A_SELECTED)) {

            try {
                Integer answerInt = Integer.valueOf(answer);
                this.b = answerInt;
                this.status = RECTANGLE_B_SELECTED;
            } catch (NumberFormatException e) {
                return;
            }
        } else if (this.status.equals(RECTANGLE_B_SELECTED)) {
            // do nothing
        }

    }

    private void inputInitial(String answer) {
        initialState.inputInitial(answer);
    }
}
