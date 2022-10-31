package com.designMode.PolicyMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 21:50
 * @Version 1.0
 */

public class PayStrategyB extends PayStrategy {
    @Override
    void algorithmInterface() {
        System.out.println("支付宝支付");
    }
}
