package com.designMode.SingletonMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 9:50
 * @Version 1.0
 */
// 饿汉式
public class Demo1 {
    // 类初始化时，会立即加载对象，线程安全，调用效率高
    private static Demo1 demo1 = new Demo1();

    public Demo1() {
        System.out.println("私有Demo1构造参数初始化");
    }

    public static Demo1 getInstance(){
        return demo1;
    }

    public static void main(String[] args) {
        Demo1 s1 = Demo1.getInstance();
        Demo1 s2 = Demo1.getInstance();
        // == 比较地址
        System.out.println(s1==s2);
    }
}
