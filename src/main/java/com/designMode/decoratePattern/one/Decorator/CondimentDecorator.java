package com.designMode.decoratePattern.one.Decorator;

import com.designMode.decoratePattern.one.Beverage;


// 装饰器 调料管理
public abstract class CondimentDecorator extends Beverage {
    // 重写getDescription
    public abstract String getDescription();
}

