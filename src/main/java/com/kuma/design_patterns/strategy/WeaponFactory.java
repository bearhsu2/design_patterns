package com.kuma.design_patterns.strategy;

public class WeaponFactory {
    static Weapon getWeapon(String method) {


        if (method.equals("knife")) {
            return new Knife();
        }

        return new Gun();

    }
}