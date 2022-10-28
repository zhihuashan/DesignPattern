package com.designMode.StrategyPattern.one.duck;

import com.designMode.StrategyPattern.one.behavior.FlyNoWay;
import com.designMode.StrategyPattern.one.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior =  new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I`m a model duck");
    }

}
