package com.kuma.strategy;

public class Killer {

  public String kill(String method) {

    return WeaponFactory.getWeapon(method).kill();
  }
}
