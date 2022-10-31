package com.designMode.factoryPattern.two.test;

import com.designMode.factoryPattern.two.ChicagoPizzaStore;
import com.designMode.factoryPattern.two.NYPizzaStore;
import com.designMode.factoryPattern.two.Pizza;
import com.designMode.factoryPattern.two.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza  pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
