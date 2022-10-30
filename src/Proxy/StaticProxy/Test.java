package Proxy.StaticProxy;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 22:12
 * @Version 1.0
 */
//添加完静态代理的测试类
public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();
    }
}
