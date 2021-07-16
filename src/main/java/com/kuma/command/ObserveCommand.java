package com.kuma.command;

public class ObserveCommand implements Command{
    public ObserveCommand() {
    }

    public void execute(Patient patient) {
        patient.setObserved(true);
    }
}