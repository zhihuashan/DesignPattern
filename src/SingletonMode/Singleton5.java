package SingletonMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 9:42
 * @Version 1.0
 */

// 单例模式
//    一个类只有一个实例，且该类能自行创建这个实例的一种模式
public class Singleton5 {
    private Singleton5(){

    }
    private static  class  InstanceHolder{
        // 静态变量
        private static  Singleton5 instance = new Singleton5();
    }
    public  static Singleton5 getInstance(){
        return InstanceHolder.instance;
    }
}