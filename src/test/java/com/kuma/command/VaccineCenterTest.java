package com.kuma.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VaccineCenterTest {

    @Test
    void simplified_process() {

        VaccineCenter vaccineCenter = new VaccineCenter(
                new VerifyCommand(),
                new VaccinateCommand(),
                new LogCommand()
        );

        Patient patient = new Patient();

        vaccineCenter.serve(patient);


        assertEquals(true, patient.isVerified());
        assertEquals(false, patient.isInqueried());
        assertEquals(true, patient.isVaccinated());
        assertEquals(false, patient.isObserved());
        assertEquals(true, patient.isLogged());


    }

    @Test
    void normal_process() {

        VaccineCenter vaccineCenter = new VaccineCenter(
                new VerifyCommand(),
                new InqueryCommand(),
                new VaccinateCommand(),
                new ObserveCommand(),
                new LogCommand()
        );

        Patient patient = new Patient();

        vaccineCenter.serve(patient);


        assertEquals(true, patient.isVerified());
        assertEquals(true, patient.isInqueried());
        assertEquals(true, patient.isVaccinated());
        assertEquals(true, patient.isObserved());
        assertEquals(true, patient.isLogged());


    }
}