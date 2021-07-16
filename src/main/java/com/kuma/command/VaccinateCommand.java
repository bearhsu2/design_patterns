package com.kuma.command;

public class VaccinateCommand implements  Command{
    public VaccinateCommand() {
    }

    public void execute(Patient patient) {
        patient.setVaccinated(true);
    }
}