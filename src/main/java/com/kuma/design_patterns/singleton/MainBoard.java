package com.kuma.design_patterns.singleton;

public class MainBoard {
    private MainBoard() {
    }

    private static MainBoard instance = new MainBoard();

    public static MainBoard getInstance() {
        return instance;
    }
}
