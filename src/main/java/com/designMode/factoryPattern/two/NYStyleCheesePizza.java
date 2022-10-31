package com.designMode.factoryPattern.two;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        // 名字
        name = "NY style sauce and cheese Pizza";
        // 酱料类型
        dough = "Thin Crust Dough";
        // 佐料
        sauce = "Marinara Sauce";
        toppings.add("Grated Regginao Cheese");
    }


}
