package Proxy.DynamicProxy;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 22:22
 * @Version 1.0
 */
//接口实现类
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
