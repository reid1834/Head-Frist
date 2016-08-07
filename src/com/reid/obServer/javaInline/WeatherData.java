package com.reid.obServer.javaInline;

import java.util.Observable;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class WeatherData extends Observable {

    private float mTemperature = 20.0f;
    private float mHumidity = 50.0f;

    public WeatherData() {
    }


    public void notificatin() {
        setChanged();
        notifyObservers();
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public void setmTemperature(float mTemperature) {
        this.mTemperature = mTemperature;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(float mHumidity) {
        this.mHumidity = mHumidity;
    }
}
