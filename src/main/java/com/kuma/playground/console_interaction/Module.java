package com.kuma.playground.console_interaction;

public class Module {
    private final String INITIAL = "Initial";
    private final String RECTANGLE_A_SELECTED = "RectangleASelected";
    private final String RECTANGLE_B_SELECTED = "RectangleBSelected";
    private final String RECTANGLE_SELECTED = "RectangleSelected";


    private String status = INITIAL;
    private int a;
    private int b;

    public String print() {
        if (this.status.equals(INITIAL)) {
            return "Shape: (C)ircle or (R)ectangle?";
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

    public void input(String answer) {
        if (this.status.equals(INITIAL) && answer.equals("R")) {
            this.status = RECTANGLE_SELECTED;
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
}
