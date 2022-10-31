package com.designMode.ObserverMode;


/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 10:52
 * @Version 1.0
 */
// 观察者模式
public class ObserverPattern {
    public static void main(String[] args) {
        Subject  subject = new ConcreateSubject();
        // 向上转型
        Observer  obs1 = new ConcreateObserver1();
        Observer  obs2 = new ConcreateObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
