package com.kuma.observer.case1;

import org.junit.jupiter.api.Test;

public class WeatherShowBoardTest {

    @Test
    public void name() {
        Weather weather = new Weather();
        WeatherShowBoard observer = new WeatherShowBoard();

        weather.addObserver(observer);

        weather.setHumidity(30);
        weather.notifyObservers("aaa");

        weather.setTemperature(22);
        weather.notifyObservers("bbb");


    }
}