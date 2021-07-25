package com.kuma.playground;

import java.util.ArrayList;
import java.util.List;

public class IntStack {

    private final List<Integer> list = new ArrayList<>();

    public void push(int element) {

        this.list.add(0, element);


    }

    public int pop() throws StackEmptyException {

        if (isEmpty()) {
            throw new StackEmptyException();
        }


        return this.list.remove(0);

    }

    public boolean isEmpty() {
        return this.list.isEmpty();

    }

    public static class StackEmptyException extends Exception {
    }

}
