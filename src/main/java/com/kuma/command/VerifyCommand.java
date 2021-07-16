package com.kuma.command;

public class VerifyCommand implements Command {
    public VerifyCommand() {
    }

    public void execute(Patient patient) {
        patient.setVerified(true);
    }
}