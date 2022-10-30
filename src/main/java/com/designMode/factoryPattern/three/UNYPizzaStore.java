package com.designMode.factoryPattern.three;



public class UNYPizzaStore extends UPizzaStore {
// 纽约地区风味披萨

    @Override
    public UPizza createPizza(String type) {
        UPizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("New York style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
