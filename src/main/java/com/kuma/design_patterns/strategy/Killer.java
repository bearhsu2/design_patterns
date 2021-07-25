package com.kuma.design_patterns.strategy;

public class Killer {

  public String kill(String method) {

    return WeaponFactory.getWeapon(method).kill();
  }
}
