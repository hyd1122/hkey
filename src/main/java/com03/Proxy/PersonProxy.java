package com03.Proxy;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PersonProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("吃饭前要洗手。。。。。。");
//        proxy.invokeSuper(obj,args);表示调用原始类的被拦截到的方法。这个方法的前后添加需要的过程。
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("吃饭后我会休息一会。。。。。。");
        return result;
    }
}
