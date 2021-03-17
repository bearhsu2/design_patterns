package com.kuma.strategy;

public class WeaponFactory {
    static Weapon getWeapon(String method) {


        if (method.equals("knife")) {
            return new Knife();
        }

        return new Gun();

    }
}