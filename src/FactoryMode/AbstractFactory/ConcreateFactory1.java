package FactoryMode.AbstractFactory;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 13:07
 * @Version 1.0
 */

public class ConcreateFactory1 implements AbstractFactory{
    public Product1 newProduct1() {
        System.out.println("具体工厂 1 生成-->具体产品 11...");
        return new ConcreateProduct11();
    }
    public Product2 newProduct2() {
        System.out.println("具体工厂 1 生成-->具体产品 21...");
        return new ConcreateProduct21();
    }
}
