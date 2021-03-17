package com.kuma.strategy;

import java.util.HashMap;
import java.util.Map;

public class Killer {

  private static final Map<String, Weapon> weapons = new HashMap<>();

  static {
    weapons.put("gun", new Gun());
    weapons.put("knife", new Knife());
  }

  public String kill(String method) {

    return weapons.get(method).kill();
  }
}
