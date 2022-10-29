package com.designMode.decoratePattern.one.Decorator;

import com.designMode.decoratePattern.one.Bev;
import com.designMode.decoratePattern.one.Beverage;

// 摩卡装饰者
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public Bev getBev() {
        return beverage.getBev();
    }
    @Override
    public double cost() {
        if(beverage.getBev() == Bev.GRANDE){
            return 0.3 + beverage.cost();
        }else if (beverage.getBev() == Bev.TALL){
            return 0.2 + beverage.cost();
        }else  if(beverage.getBev() == Bev.VENTI){
            return 0.1 + beverage.cost();
        }
        return 0.0+beverage.cost();
    }
//    实例化一个饮料对象，然后用各种调料（装饰者）包装它

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Mocha";
    }
}
