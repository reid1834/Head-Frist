package com.reid.obServer;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class Client2 implements Client {

    public Client2(WeatherData weatherData) {
        weatherData.regeister(this);
    }

    @Override
    public void update() {
        System.out.println("Client2 update!");
    }
}
