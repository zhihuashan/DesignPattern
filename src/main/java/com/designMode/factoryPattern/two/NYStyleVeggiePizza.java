package com.designMode.factoryPattern.two;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza() {
        // 名字
        name = "NY style sauce and Veggie cheese Pizza";
        // 酱料类型
        dough = "Thin Crust Dough";
        // 佐料
        sauce = "Marinara Sauce";
        toppings.add("Grated Regginao Cheese");
    }


}
