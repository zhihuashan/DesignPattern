package com.designMode.factoryPattern.FactoryMethod;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:46
 * @Version 1.0
 */
//具体工厂2：实现了厂品的生成方法
public class ConcreateFactory2 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成->具体产品2");
        return new ConcreateProduct2();
    }
}
