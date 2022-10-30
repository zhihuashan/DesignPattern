package FactoryMode.SimpleFactory;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:31
 * @Version 1.0
 */

public class SimpleFactory {
    public static  Product makeProduct(int kind){
        switch (kind){
            case Client.Const.PRODUCT_A:
                return new ConcreteProduct1();
            case Client.Const.PRODUCT_B:
                return new ConcreteProduct2();
        }
        return null;
    }
}
