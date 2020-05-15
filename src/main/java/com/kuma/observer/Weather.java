package com.kuma.observer;

import java.util.Observable;

public class Weather extends Observable {

    int temperature;
    int humidity;
    String type;


    public int getTemperature() {
        return temperature;
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        setChanged();
    }


    public int getHumidity() {
        return humidity;
    }


    public void setHumidity(int humidity) {
        this.humidity = humidity;
        setChanged();
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
        setChanged();
    }


    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", type='" + type + '\'' +
                '}';
    }


    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
        clearChanged();
    }
}
