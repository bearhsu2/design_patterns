package com.kuma.strategy;

public class Gun implements Weapon {

    @Override
    public String kill() {
        return "Killed with gun.";
    }
}