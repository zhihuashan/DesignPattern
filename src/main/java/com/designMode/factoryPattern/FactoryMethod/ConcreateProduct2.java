package com.designMode.factoryPattern.FactoryMethod;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:43
 * @Version 1.0
 */

public class ConcreateProduct2 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品2显示。。");
    }
}
