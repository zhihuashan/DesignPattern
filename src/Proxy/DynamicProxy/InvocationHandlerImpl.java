package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 22:23
 * @Version 1.0
 */
// 可以重复使用
// 每次生成动态代理类对象时,实现了InvocationHandler接口的调用处理器对象
public class InvocationHandlerImpl implements InvocationHandler {
    // 业务实现类,用来调用具体的方法
    private Object target;

    // 通过构造函数传入目标对象
    public InvocationHandlerImpl(Object target) {
        this.target = target;
    }
    // 动态代理实际运行的代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用开始处理");
        //通过反射的方式创建对象
        // 第一个参数是要创建的对象，第二个是构造方法的参数决定创建对象使用那个构造函数
        Object  result = method.invoke(target,args);
        System.out.println("调用结束处理");
        return result;
    }
}
