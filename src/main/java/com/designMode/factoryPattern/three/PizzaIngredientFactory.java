package com.designMode.factoryPattern.three;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce CreateSauce();
    public Cheese createCheese();
    public Veggies[] CreateVeggies();
    public Pepperoni CreatePepperoni();
    public Clams createClams();

}
