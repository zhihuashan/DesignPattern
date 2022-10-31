package com.designMode.TemplateMethodMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:26
 * @Version 1.0
 */
// 顾客1
public class RestaurantGinsengImpl extends RestaurantTemplate{
    @Override
    void spotMenu() {
        System.out.println("人参");
    }

    @Override
    void payment() {
        System.out.println("5块");
    }
}
