package com.kuma.observer.case1;

import java.util.Observable;
import java.util.Observer;

public class WeatherShowBoard implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        System.out.println("updated: " + o + " - " + arg);
    }
}
