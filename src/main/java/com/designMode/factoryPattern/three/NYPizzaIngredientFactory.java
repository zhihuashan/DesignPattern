package com.designMode.factoryPattern.three;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce CreateSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] CreateVeggies() {
        Veggies[] veggies = { new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni CreatePepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
