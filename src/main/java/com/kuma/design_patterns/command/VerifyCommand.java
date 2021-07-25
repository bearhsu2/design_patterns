package com.kuma.design_patterns.command;

public class VerifyCommand implements Command {
    public VerifyCommand() {
    }

    public void execute(Patient patient) {
        patient.setVerified(true);
    }
}