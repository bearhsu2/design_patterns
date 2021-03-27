package com.kuma.builder;

public final class PatientBuilder {
  private String name = "Fake";
  private int age = 18;
  private int height = 170;
  private int weight = 70;
  private int id = 1;

  private PatientBuilder() {}

  public static PatientBuilder aPatient() {
    return new PatientBuilder();
  }

  public PatientBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public PatientBuilder withAge(int age) {
    this.age = age;
    return this;
  }

  public PatientBuilder withHeight(int height) {
    this.height = height;
    return this;
  }

  public PatientBuilder withWeight(int weight) {
    this.weight = weight;
    return this;
  }

  public PatientBuilder withId(int id) {
    this.id = id;
    return this;
  }

  public Patient build() {
    return new Patient(name, age, height, weight, id);
  }
}
