package com.designMode.decoratePattern.one.test;

import com.designMode.decoratePattern.one.*;
import com.designMode.decoratePattern.one.Decorator.Mocha;
import com.designMode.decoratePattern.one.Decorator.Soy;
import com.designMode.decoratePattern.one.Decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
//        订一杯中杯浓缩咖啡不需要调料
        Beverage beverage = new Espresso(Bev.TALL);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
// DarkRoast  订大杯双摩卡咖啡
        Beverage beverage1 = new DarkRoast(Bev.GRANDE);
        beverage1 = new Mocha(beverage1); // 摩卡装饰
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() +" $" + beverage1.cost());

        //再来一杯调料为豆浆、摩卡、奶泡的HouseBlend咖啡
        Beverage beverage2 = new HouseBlend(Bev.VENTI);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
