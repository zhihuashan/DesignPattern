package com.designMode.Proxy.StaticProxy;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 22:13
 * @Version 1.0
 */

// 代理类
public class UserDaoProxy extends UserDao{
    private UserDao userDao;

    public UserDaoProxy(UserDao userDao){
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("开启事务..");
        userDao.save();
        System.out.println("关闭事务..");
    }
}
