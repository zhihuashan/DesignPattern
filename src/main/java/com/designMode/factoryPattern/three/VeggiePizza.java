package com.designMode.factoryPattern.three;


public class VeggiePizza extends UPizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    // 制作披萨，需要提供原料
    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    // 创建芝士比萨需要原料时，就和工厂要。
    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.CreateSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
