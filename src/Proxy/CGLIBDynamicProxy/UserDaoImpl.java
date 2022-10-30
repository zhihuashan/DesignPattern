package Proxy.CGLIBDynamicProxy;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 22:43
 * @Version 1.0
 */

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("保存数据方法");
    }
}
