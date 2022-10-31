package com.designMode.ObserverMode.SchoolBell;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 15:34
 * @Version 1.0
 */

public class BellEventTest {
    public static void main(String[] args) {
        BellEventSource bell =new BellEventSource(); // 铃声
        bell.addPersonListener(new TeachEventListener()); // 注册监听老师
        bell.addPersonListener(new StuEventListener()); // 注册监听学生
        bell.ring(true);// 打铃上课
        System.out.println("----");
        bell.ring(false); // 打铃下课
    }
}
