package com.designMode.factoryPattern.FactoryMethod;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:45
 * @Version 1.0
 */
//具体工厂1：实现了厂品的生成方法
public class ConcreateFactory1 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成->具体产品1");
        return new ConcreateProduct1();
    }
}
