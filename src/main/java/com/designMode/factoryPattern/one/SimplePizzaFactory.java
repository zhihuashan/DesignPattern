package com.designMode.factoryPattern.one;

import com.designMode.factoryPattern.two.*;

public class SimplePizzaFactory {
    public Pizza  createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }

    }
}
