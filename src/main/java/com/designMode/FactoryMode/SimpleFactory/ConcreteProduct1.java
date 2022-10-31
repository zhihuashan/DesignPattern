package com.designMode.FactoryMode.SimpleFactory;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:28
 * @Version 1.0
 */
// 具体产品1
// 工厂创建目标
public class ConcreteProduct1 implements Product{

    @Override
    public void show() {
        System.out.println("具体产品1显示..");
    }
}
