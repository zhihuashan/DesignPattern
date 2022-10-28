package com.designMode.ObserverPattern.One.Subject;

import com.designMode.ObserverPattern.One.Observer.Observer;

// 主题
public interface Subject {
    // 注册观察者
    void registerObserver(Observer observer);
    // 注销观察者
    void removeObserver(Observer observer);
    // 通知观察者
    void notifyObserver();

}
