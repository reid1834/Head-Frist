package com.reid.obServer;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class Client1 implements Client {

    public Client1(WeatherData weatherData) {
        weatherData.regeister(this);
    }

    @Override
    public void update() {
        System.out.println("Client1 update!");
    }
}
