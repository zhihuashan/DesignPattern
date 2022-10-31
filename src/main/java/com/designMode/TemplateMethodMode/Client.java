package com.designMode.TemplateMethodMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:28
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        // 调用第一个模板实例
        RestaurantTemplate rt = new RestaurantGinsengImpl();
        rt.process();
    }
}
