package FactoryMode.FactoryMethod;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:44
 * @Version 1.0
 */
//抽象工厂：提供了厂品的生成方法
public interface AbstractFactory {
    public Product newProduct();
}
