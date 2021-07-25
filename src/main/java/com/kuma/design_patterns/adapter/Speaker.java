package com.kuma.design_patterns.adapter;

import java.util.List;

public class Speaker {
    private final List<Student> students;

    public Speaker(List<Student> students) {

        this.students = students;
    }

    public void speak() {

    }
}
