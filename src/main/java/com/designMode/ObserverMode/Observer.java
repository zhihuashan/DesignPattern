package com.designMode.ObserverMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 11:02
 * @Version 1.0
 */
// 抽象观察者 当接到具体的通知之后进行相应
public interface Observer {
    // 反应
    void response();
}
