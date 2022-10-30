package com.designMode.factoryPattern.three;

import java.util.ArrayList;
import java.util.List;

public abstract class UPizza {
    // 名字
    String name;
    // 酱料类型
    Dough dough;
    // 佐料
    Sauce sauce;

    Veggies veggies[];

    Cheese cheese;

    Pepperoni pepperoni;

    Clams clam;


    List<String> toppings = new ArrayList<>();
// 收集各种原料
    public abstract void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return null;
    }
}
