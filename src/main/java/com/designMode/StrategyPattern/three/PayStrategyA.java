package com.designMode.StrategyPattern.three;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 21:49
 * @Version 1.0
 */

public class PayStrategyA extends PayStrategy{
    @Override
    void algorithmInterface() {
        System.out.println("微信支付");
    }
}
