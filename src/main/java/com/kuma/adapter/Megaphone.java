package com.kuma.adapter;

import java.util.List;

public class Megaphone {
    public void talkTo(List<Student> students) {


        for (Student student : students) {
            student.setNotified(true);
        }

    }
}
