package com.designMode.factoryPattern.two;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza() {
        // 名字
        name = "NY style sauce and Clam cheese Pizza";
        // 酱料类型
        dough = "Thin Crust Dough";
        // 佐料
        sauce = "Marinara Sauce";
        toppings.add("Grated Regginao Cheese");
    }


}
