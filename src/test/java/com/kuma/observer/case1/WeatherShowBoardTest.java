package com.kuma.observer.case1;

import com.kuma.observer.case1.Weather;
import com.kuma.observer.case1.WeatherShowBoard;
import org.junit.Test;

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