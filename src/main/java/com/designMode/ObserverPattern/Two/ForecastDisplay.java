package com.designMode.ObserverPattern.Two;

import com.designMode.ObserverPattern.One.Display.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;

    private float currentPressure = 29.92f;

    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
    public void display(){
        System.out.println("Current Conditions"+currentPressure +"F degree and" +lastPressure +"pressure");
    }
}
