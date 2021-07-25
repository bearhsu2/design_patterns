package com.kuma.design_patterns.command;

public class VaccinateCommand implements  Command{
    public VaccinateCommand() {
    }

    public void execute(Patient patient) {
        patient.setVaccinated(true);
    }
}