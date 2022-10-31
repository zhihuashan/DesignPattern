package com.designMode.ObserverPattern.One.Observer;

import com.designMode.ObserverPattern.One.Display.DisplayElement;
import com.designMode.ObserverPattern.One.Subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;
    // 为注销注册做准备
    private Subject weatherData;

    @Override
    public void display() {

        System.out.println("Statistics : " +temp+ "F degrees and " + humidity + "% humidity");
    }

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();

    }
}
