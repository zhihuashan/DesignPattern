package com.designMode.factoryPattern.one;

import com.designMode.factoryPattern.two.Pizza;

public abstract class PizzStore {
    SimplePizzaFactory factory;

    public PizzStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza OrderPizza(String type){
        Pizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
