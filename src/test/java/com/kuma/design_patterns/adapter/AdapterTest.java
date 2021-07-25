package com.kuma.design_patterns.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class AdapterTest {
    @Test
    void megaphone() {


        Megaphone megaphone = new Megaphone();

        List<Student> students = Arrays.asList(new Student(), new Student());

        megaphone.talkTo(students);


        for (Student student : students) {
            Assertions.assertEquals(true, student.isNotified());
        }

    }

    @Test
    void broadcast_system() {

        List<Student> students = Arrays.asList(new Student(), new Student());


        Speaker speaker = new SpeakerAdapter(new Megaphone(), students);
        BroadcastSystem broadcastSystem
                = new BroadcastSystem(speaker);

        broadcastSystem.broadcast();

        for (Student student : students) {
            Assertions.assertEquals(true, student.isNotified());
        }


    }
}