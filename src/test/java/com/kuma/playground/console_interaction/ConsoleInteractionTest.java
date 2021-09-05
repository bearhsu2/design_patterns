package com.kuma.playground.console_interaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//Example 1
//Program prints "Shape: (C)ircle or (R)ectangle?", and the user answers "R".
//Then the program prints "Rectangle side A length?".
//The user answers "5".
//Then the program prints "Rectangle side B length?".
//The user answers "10".
//Then the program prints "Area=50".
//And then "Circumference=30".
class ConsoleInteractionTest {
    @Test
    void initial_and_print() {


        Module module = new Module();

        String printed = module.print();

        Assertions.assertEquals("Shape: (C)ircle or (R)ectangle?", printed);


    }

    @Test
    void initial_and_R() {

        Module module = new Module();

        module.input("R");

        String printed = module.print();

        Assertions.assertEquals("Rectangle side A length?", printed);


    }

    @Test
    void initial_and_A() {

        Module module = new Module();

        module.input("A");

        String printed = module.print();

        Assertions.assertEquals("Shape: (C)ircle or (R)ectangle?", printed);


    }

    @Test
    void initial_and_R_5() {

        Module module = new Module();

        module.input("R");

        module.input("5");

        String printed = module.print();

        Assertions.assertEquals("Rectangle side B length?", printed);


    }

    @Test
    void initial_and_R_6() {

        Module module = new Module();

        module.input("R");

        module.input("6");

        String printed = module.print();

        Assertions.assertEquals("Rectangle side B length?", printed);


    }

    @Test
    void initial_and_R_5_10() {

        Module module = new Module();

        module.input("R");

        module.input("5");
        module.input("10");

        String printed = module.print();

        Assertions.assertEquals("Area=50, Circumference=30", printed);


    }

    @Test
    void initial_and_R_7_10() {

        Module module = new Module();

        module.input("R");

        module.input("7");
        module.input("10");

        String printed = module.print();

        Assertions.assertEquals("Area=70, Circumference=34", printed);


    }

    @Test
    void initial_and_R_Z() {

        Module module = new Module();

        module.input("R");

        module.input("Z");

        String printed = module.print();

        Assertions.assertEquals("Rectangle side A length?", printed);


    }

    @Test
    void initial_and_C() {

        Module module = new Module();

        module.input("C");

        String printed = module.print();

        Assertions.assertEquals("Circle radius?", printed);

    }

    @Test
    void initial_and_C_10() {

        Module module = new Module();

        module.input("C");
        module.input("10");

        String printed = module.print();


        Assertions.assertEquals("Area=300, Circumference=60", printed);

    }

    @Test
    void initial_and_C_100() {

        Module module = new Module();

        module.input("C");
        module.input("100");

        String printed = module.print();


        Assertions.assertEquals("Area=30000, Circumference=600", printed);

    }

}
