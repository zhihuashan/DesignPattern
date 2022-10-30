package com.designMode.factoryPattern.two;

import com.designMode.factoryPattern.three.UPizza;
import com.designMode.factoryPattern.three.UPizzaStore;

public class NYPizzaStore extends PizzaStore {
// 纽约地区风味披萨

    @Override
    public  Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
