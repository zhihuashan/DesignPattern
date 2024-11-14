package com.designMode.ObserverPattern.Three;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 10:56
 * @Version 1.0
 */
//抽象目标 添加通知对象，及通知内容
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();
    // 增加观察者
    public  void add(Observer observer){
        observers.add(observer);
    }
    // 删除观察者
    public  void remove(Observer observer){
        observers.remove(observer);
    }
    // 通知观察者
    public  abstract  void notifyObserver();
}
