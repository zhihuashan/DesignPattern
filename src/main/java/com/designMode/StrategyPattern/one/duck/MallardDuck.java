package com.designMode.StrategyPattern.one.duck;

import com.designMode.StrategyPattern.one.behavior.FlyNoWay;
import com.designMode.StrategyPattern.one.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior =  new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard duck");
    }
}
