package com.kuma.design_patterns.strategy;

public class Knife implements Weapon {


    @Override
    public String kill() {
        return "Killed with knife.";
    }
}
