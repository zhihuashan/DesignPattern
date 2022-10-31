package com.designMode.factoryPattern.two;

public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza() {
        // 名字
        name = "NY style sauce and Pepperoni cheese Pizza";
        // 酱料类型
        dough = "Thin Crust Dough";
        // 佐料
        sauce = "Marinara Sauce";
        toppings.add("Grated Regginao Cheese");
    }


}
