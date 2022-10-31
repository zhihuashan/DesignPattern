package com.designMode.FactoryMode.FactoryMethod;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:47
 * @Version 1.0
 */

public class FactoryMethodTest {
    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();
            a.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
