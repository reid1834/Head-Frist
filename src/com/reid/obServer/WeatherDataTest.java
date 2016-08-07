package com.reid.obServer;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class WeatherDataTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Client client1 = new Client1(weatherData);
        Client client2 = new Client2(weatherData);
        Client client3 = new Client3(weatherData);
        weatherData.notification();
        System.out.println("remove client2 ######");
        weatherData.unRegeister(client2);
        weatherData.notification();
    }
}
