package com03.Proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PlayProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("我准备出去玩一会");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("我玩完回来了");
        return result;
    }
}
