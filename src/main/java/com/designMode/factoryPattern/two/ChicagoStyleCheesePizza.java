package com.designMode.factoryPattern.two;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        // 名字
        name = "Chicago style sauce and cheese Pizza";
        // 酱料类型
        dough = "Extra Thick Dough";
        // 佐料
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    // 覆盖cut()方法
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }


}
