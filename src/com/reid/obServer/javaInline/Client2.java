package com.reid.obServer.javaInline;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class Client2 implements Observer, Display {

    private Observable mObservable;
    private float mTemperature;
    private float mHumidity;

    public Client2(Observable mObservable) {
        this.mObservable = mObservable;
        mObservable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Client2 Temperature: " + mTemperature + ", Humidity: " + mHumidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            mTemperature = weatherData.getmTemperature();
            mHumidity = weatherData.getmHumidity();
        }
    }
}
