package SingletonMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/27 10:03
 * @Version 1.0
 */
// 静态内部类
public class Demo3 {
    public Demo3(){
        System.out.println("私有demo构造参数化");
    }
    public static class SingletonClassInstance{
        private static final Demo3 DEMO_3 = new Demo3();
    }

    // 方法没有同步
    public static Demo3 getInstance(){
        return SingletonClassInstance.DEMO_3;
    }

    public static void main(String[] args) {
        Demo3 s1 = Demo3.getInstance();
        Demo3 s2 = Demo3.getInstance();
        System.out.println(s1 == s2);
    }
}
