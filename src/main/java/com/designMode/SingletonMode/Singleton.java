package com.designMode.SingletonMode;

public class Singleton {
    private static Singleton uniqueInstance;
    // 这个构造函数是私有的只能类内调用
    private Singleton(){}

    public static Singleton getInstance(){
        // 判断实例是否存在
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
