package com.kuma.design_patterns.command;

public class ObserveCommand implements Command{
    public ObserveCommand() {
    }

    public void execute(Patient patient) {
        patient.setObserved(true);
    }
}