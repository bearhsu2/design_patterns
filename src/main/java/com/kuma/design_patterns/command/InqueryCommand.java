package com.kuma.design_patterns.command;

public class InqueryCommand implements  Command{
    public InqueryCommand() {
    }

    public void execute(Patient patient) {
        patient.setInqueried(true);
    }
}