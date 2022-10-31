package com.designMode.factoryPattern.three;

public abstract class UPizzaStore {
    public UPizza orderPizza(String type){
        //
        UPizza pizza;
        // 根据类型创建不同类型的披萨
        // 由各个子类来负责创建正确种类的披萨 实现解耦
        pizza = createPizza(type);
        // 负责制作披萨的过程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    // 根据不同的产地创建不同的地区风味的披萨
    // 将不断变化的地方进行抽象出来
    // 从而实现了解耦
    // orderPizza并不知道真正创建的是哪一种比萨，只知道这是一个比萨，能够被准备
    //被烘烤、被切片、被装盒，然后提供给Joel和Ethan。
    public abstract UPizza createPizza(String type);

}
