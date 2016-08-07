package com.reid.obServer;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class Client3 implements Client {

    public Client3(WeatherData weatherData) {
        weatherData.regeister(this);
    }

    @Override
    public void update() {
        System.out.println("Client3 update!");
    }
}
