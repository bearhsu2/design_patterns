package com.kuma.builder;

import org.junit.Assert;
import org.junit.Test;

public class PatientTest {
  @Test
  public void younger() {

    Patient p1 = PatientBuilder.aPatient().withAge(20).build();
    Patient p2 = PatientBuilder.aPatient().withAge(30).build();

    boolean actual = p1.isYoungerThan(p2);

    Assert.assertTrue(actual);
  }
}
