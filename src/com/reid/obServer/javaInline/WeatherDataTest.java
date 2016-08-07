package com.reid.obServer.javaInline;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class WeatherDataTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Client1 client1 = new Client1(weatherData);
        Client2 client2 = new Client2(weatherData);

        weatherData.setmTemperature(28.0f);
        weatherData.setmHumidity(60.0f);
        weatherData.notificatin();
        client1.display();
        client2.display();

        System.out.println("$$$$$$$$$$$");

        weatherData.setmTemperature(38.0f);
        weatherData.setmHumidity(70.0f);
        weatherData.notificatin();
        client1.display();
        client2.display();
    }
}
