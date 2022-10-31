package com.designMode.factoryPattern.three.test;

import com.designMode.factoryPattern.three.UNYPizzaStore;
import com.designMode.factoryPattern.three.UPizzaStore;

public class test {
    public static void main(String[] args) {
        // 纽约披萨店
        UPizzaStore nyPizzaStore = new UNYPizzaStore();
        // 接受订单
        nyPizzaStore.orderPizza("cheese");

    }


}
