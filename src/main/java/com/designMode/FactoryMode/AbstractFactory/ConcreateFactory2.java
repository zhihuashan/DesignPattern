package com.designMode.FactoryMode.AbstractFactory;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 13:35
 * @Version 1.0
 */

public class ConcreateFactory2 implements AbstractFactory{
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂 2 生成-->具体产品 12...");
        return new ConcreateProduct12();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂 2 生成-->具体产品 22...");
        return new ConcreateProduct22();
    }
}
