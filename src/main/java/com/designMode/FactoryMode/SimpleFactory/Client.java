package com.designMode.FactoryMode.SimpleFactory;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:25
 * @Version 1.0
 */
// 通过使用简单工厂 进行创建对象(根据参数进行创建对象),
public class Client {
    public static void main(String[] args) {
        SimpleFactory sf=new SimpleFactory();
        // 向上转型
        Product p=sf.makeProduct(1);
        p.show();
    }

    final class Const{
        static final int PRODUCT_A=0;
        static final int PRODUCT_B=1;
        static final int PRODUCT_C=2;
    }
}
