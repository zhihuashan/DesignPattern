package com.designMode.SingletonMode;

public class Singleton2 {
    // 双重检错机制
    private volatile static Singleton2 uniqueInstance;

    public Singleton2() {
        System.out.println("创建实例");
    }

    public static Singleton2 getUniqueInstance() {
        // 检查实例 如果不存在，进入同步区块
        // 为了代码提高代码执行效率，由于单例模式只要一次创建实例即可，
        // 所以当创建了一个实例之后，再次调用getInstance方法就不必要进入同步代码块，不用竞争锁。直接返回前面创建的实例即可
        if(uniqueInstance == null){
            synchronized (Singleton2.class){
                // 第二次校验是防止二次创建实例
                if(uniqueInstance == null ){
                    uniqueInstance = new Singleton2();
                }
            }
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton2 s1= Singleton2.getUniqueInstance();
        Singleton2 s2 = Singleton2.getUniqueInstance();
        if(s1 == s2 ){
            System.out.println("true");
        }

    }
}
