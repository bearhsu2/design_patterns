package com.kuma.strategy;

public class Knife implements Weapon {


    @Override
    public String kill() {
        return "Killed with knife.";
    }
}
