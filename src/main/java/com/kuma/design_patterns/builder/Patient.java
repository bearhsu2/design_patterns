package com.kuma.design_patterns.builder;

public class Patient {

  private String name;
  private int age;
  private int height;
  private int weight;
  private int id;

  public Patient(String name, int age, int height, int weight, int id) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isYoungerThan(Patient anther) {

    return this.age < anther.getAge();
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
