package com.designMode.SingletonMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 9:56
 * @Version 1.0
 */
// 懒汉式
public class Demo2 {
    // 类初始化时不会初始化该对象，只有当真正需要使用时才会创建对象
    private  static Demo2 demo2;

    public Demo2() {
        System.out.println("私有Demo2构造参数初始化");
    }
    // synchronized进行同步保证多线下数据的实例不唯一的问题。
    // 但将大大降低性能
    public synchronized static Demo2 getInstance(){
        if(demo2 == null){
            demo2 = new Demo2();
        }
        return demo2;
    }

    public static void main(String[] args) {
        Demo2 s1 = Demo2.getInstance();
        Demo2 s2 = Demo2.getInstance();
        System.out.println(s1==s2);
    }
}
