package com.designMode.factoryPattern.SimpleFactory;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:29
 * @Version 1.0
 */
// 具体产品2
// 工厂创建目标
public class ConcreteProduct2 implements Product{

    @Override
    public void show() {
        System.out.println("具体产品2显示..");
    }
}
