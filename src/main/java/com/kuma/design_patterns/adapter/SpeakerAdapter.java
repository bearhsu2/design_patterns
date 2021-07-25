package com.kuma.design_patterns.adapter;

import java.util.List;

public class SpeakerAdapter extends Speaker {
    private final Megaphone megaphone;
    private final List<Student> students;

    public SpeakerAdapter(Megaphone megaphone, List<Student> students) {
        super(students);
        this.students = students;
        this.megaphone = megaphone;
    }

    @Override
    public void speak() {
        megaphone.talkTo(this.students);

    }
}
