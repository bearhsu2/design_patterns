package com.kuma.design_patterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatientTest {
  @Test
  public void younger() {

    Patient p1 = PatientBuilder.aPatient().withAge(20).build();
    Patient p2 = PatientBuilder.aPatient().withAge(30).build();

    boolean actual = p1.isYoungerThan(p2);

    assertTrue(actual);
  }
}
