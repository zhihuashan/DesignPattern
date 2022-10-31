package com.designMode.ObserverMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 11:04
 * @Version 1.0
 */
//具体观察者
public class ConcreateObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1做出的反应");
    }
}
