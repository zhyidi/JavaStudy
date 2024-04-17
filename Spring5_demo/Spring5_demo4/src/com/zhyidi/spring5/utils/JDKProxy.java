package com.zhyidi.spring5.utils;

import com.zhyidi.spring5.Dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 21:05
 * @Version 1.0
 */
//JDK原生动态代理
public class JDKProxy {
    public static Object getProxy(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),new UserDaoProxy(obj));
    }
}

class UserDaoProxy implements InvocationHandler{

    private Object obj;

    public UserDaoProxy() {
    }

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //调用代理对象时全部调用这个invoke方法，所以对于不同的方法想要增强就需要判断
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在方法之前执行。。。。");
        Object returnValue = method.invoke(obj, args);
        System.out.println("在方法之后执行。。。。");
        return returnValue;
    }
}
