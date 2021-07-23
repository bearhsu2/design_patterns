package com.kuma.adapter;

public class BroadcastSystem {
    private final Speaker speaker;

    public BroadcastSystem(Speaker speaker) {

        this.speaker = speaker;
    }

    public void broadcast() {
        speaker.speak();
    }
}
