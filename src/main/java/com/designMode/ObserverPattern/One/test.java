package com.designMode.ObserverPattern.One;

import com.designMode.ObserverPattern.One.Observer.CurrentConditionsDisplay;
import com.designMode.ObserverPattern.One.Observer.ForecastDisplay;
import com.designMode.ObserverPattern.One.Observer.StatisticsDisplay;
import com.designMode.ObserverPattern.One.Subject.WeatherData;

public class test {
    public static void main(String[] args) {
        WeatherData weatherData =  new WeatherData();
        CurrentConditionsDisplay current  = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay  statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.notifyObserver();
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.notifyObserver();
        weatherData.setMeasurements(78,90,29.2f);
        weatherData.notifyObserver();
    }
}
