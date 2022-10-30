package Proxy.CGLIBDynamicProxy;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 22:56
 * @Version 1.0
 */
// 测试CGLIB动态代理
public class Test {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = (UserDao) cglibProxy.getInstance(new UserDaoImpl());
        userDao.save();
    }
}
