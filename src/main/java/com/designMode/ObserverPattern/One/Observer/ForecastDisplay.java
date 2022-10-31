package com.designMode.ObserverPattern.One.Observer;

import com.designMode.ObserverPattern.One.Display.DisplayElement;
import com.designMode.ObserverPattern.One.Subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {


    private float pressure;
    // 为注销注册做准备
    private Subject weatherData;

    @Override
    public void display() {

        System.out.println("Statistics : " +pressure+ "F");
    }

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();

    }
}
