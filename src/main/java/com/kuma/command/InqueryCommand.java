package com.kuma.command;

public class InqueryCommand implements  Command{
    public InqueryCommand() {
    }

    public void execute(Patient patient) {
        patient.setInqueried(true);
    }
}