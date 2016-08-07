package com.reid.obServer.javaInline;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class Client1 implements Observer, Display {

    private Observable mObservable;
    private float mTemperature;
    private float mHumidity;

    public Client1(Observable observable) {
        mObservable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            mTemperature = weatherData.getmTemperature();
            mHumidity = weatherData.getmHumidity();
        }
    }

    @Override
    public void display() {
        System.out.println("Client1 Temperature: " + mTemperature + ", Humidity: " + mHumidity);
    }
}
