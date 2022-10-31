package com.designMode.Proxy.CGLIBDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 22:44
 * @Version 1.0
 */
// 引入jar包
// Project Structure…->Libraries->+For Maven->输入:cglib:cglib:3.2.2
// 代理主要类
public class CglibProxy implements MethodInterceptor {
    // 代理对象
    private  Object targetObject;

    //代理目标是Object 可以代理任意一种参数作为代理类
    public Object getInstance(Object target){
        // 设置需要创建子类的类
        this.targetObject = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    // 实际代理方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        Object result = methodProxy.invoke(targetObject,objects);
        System.out.println("关闭事务");
        // 返回代理对象
        return result;
    }
}
