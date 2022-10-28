package com.designMode.ObserverPattern.One.Subject;

import com.designMode.ObserverPattern.One.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> Observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        Observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        Observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (Observers.indexOf(observer) > 1) {
            Observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        Observers.forEach(x -> x.update(temperature, humidity, pressure));
    }

    // 数据更新时，通知观察者
    public  void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
