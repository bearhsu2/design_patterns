package com.kuma.observer;

import javafx.beans.binding.When;
import org.junit.Test;

import static org.junit.Assert.*;

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