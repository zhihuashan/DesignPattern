package com.designMode.StrategyPattern.one.test;

import com.designMode.StrategyPattern.one.duck.Duck;
import com.designMode.StrategyPattern.one.behavior.FlyRocketPowered;
import com.designMode.StrategyPattern.one.duck.MallardDuck;
import com.designMode.StrategyPattern.one.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck  mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println(" 0000");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
