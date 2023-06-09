package com03.Implement;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

//CallbackFilter可以实现不同的方法使用不同的回调方法。CallbackFilter中的accept方法，
// 根据不同的method返回不同的值，这个值是在callback中的顺序，就是调用了callbacks[i]
public class CallbackImplenent implements CallbackFilter {
    @Override
    public int accept(Method method) {
        if (method.getName().equals("play"))
            return 1;
        else {
            return 0;
        }
    }
}
