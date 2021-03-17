package com.kuma.singleton;

public class MainBoard {
    private MainBoard() {
    }

    private static MainBoard instance = new MainBoard();

    public static MainBoard getInstance() {
        return instance;
    }
}
