package com.kuma.design_patterns.command;

public class LogCommand implements Command{
    public LogCommand() {
    }

    public void execute(Patient patient) {
        patient.setLogged(true);
    }
}