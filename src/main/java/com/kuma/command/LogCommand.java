package com.kuma.command;

public class LogCommand implements Command{
    public LogCommand() {
    }

    public void execute(Patient patient) {
        patient.setLogged(true);
    }
}