package com.designMode.ObserverPattern.One.Observer;
// 观察者：更新数据
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
