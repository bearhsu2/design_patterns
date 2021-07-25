package com.kuma.playground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class IntStackTest {

    // isEmpty
    // push
    //// add to top
    // pop
    //// empty => exception
    //// otherwise => return top element


    @Test
    void create_then_is_empty() {
        IntStack stack = new IntStack();

        assertEquals(true, stack.isEmpty());
    }

    @Test
    void create_and_push_1_then_is_NOT_empty() {
        IntStack stack = new IntStack();

        stack.push(1);

        assertEquals(false, stack.isEmpty());
    }


    @Test
    void create_and_push_1_2_and_pop_then_is_NOT_empty() throws IntStack.StackEmptyException {
        IntStack stack = new IntStack();

        stack.push(1);
        stack.push(2);
        int actual = stack.pop();

        assertEquals(2, actual);
        assertEquals(false, stack.isEmpty());
    }

    @Test
    void create_and_push_1_and_pop_then_is_empty() throws IntStack.StackEmptyException {
        IntStack stack = new IntStack();

        stack.push(1);
        int actual = stack.pop();

        assertEquals(true, stack.isEmpty());
        assertEquals(1, actual);
    }

    @Test
    void pop_on_empty() {
        IntStack stack = new IntStack();

        try {
            stack.pop();
            fail("should throw exception");
        } catch (Exception e) {
            Assertions.assertTrue(e instanceof IntStack.StackEmptyException);
        }

    }


}