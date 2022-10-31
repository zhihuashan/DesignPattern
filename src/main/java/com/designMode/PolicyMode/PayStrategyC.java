package com.designMode.PolicyMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 21:50
 * @Version 1.0
 */

public class PayStrategyC extends PayStrategy {
    @Override
    void algorithmInterface() {
        System.out.println("银联支付");
    }
}
