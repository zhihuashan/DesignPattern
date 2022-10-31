package com.designMode.TemplateMethodMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:21
 * @Version 1.0
 */
// 模板方法
public  abstract  class RestaurantTemplate {
    // 1.看菜单
    public void menu(){
        System.out.println("看菜单");
    }

    // 2.点菜
    abstract void spotMenu();

    //3.吃饭
    public void havingDinner(){
        System.out.println("吃饭");
    }

    // 4付款
    abstract void payment();

    // 5 走
    public void GoR(){
        System.out.println("走人");
    }

    // 通用结构
    public  void process(){
        menu();
        spotMenu();
        havingDinner();
        payment();
        GoR();
    }
}
