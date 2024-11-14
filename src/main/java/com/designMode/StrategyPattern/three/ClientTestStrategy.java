package com.designMode.StrategyPattern.three;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 21:52
 * @Version 1.0
 */

public class ClientTestStrategy {
    public static void main(String[] args) {
        Context context;
        // 使用支付逻辑a
        context = new Context(new PayStrategyA());
        context.algorithmInterface();
        // 使用支付逻辑b
        context = new Context(new PayStrategyB());
        context.algorithmInterface();
        // 使用支付逻辑c
        context = new Context(new PayStrategyC());
        context.algorithmInterface();
    }

}
