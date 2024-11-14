package com.designMode.ObserverPattern.Three;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 11:06
 * @Version 1.0
 */

public class ConcreateObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者2做出的反应");
    }
}
