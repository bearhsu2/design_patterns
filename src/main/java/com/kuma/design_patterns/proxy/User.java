package com.kuma.design_patterns.proxy;

public class User {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int age) {
        this.age = age;
    }
}
