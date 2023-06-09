package com03;

import com03.Implement.CallbackImplenent;
import com03.Proxy.PersonProxy;
import com03.Proxy.PlayProxy;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

public class TestCGlib {
    public static void main(String[] args) {
        Callback[] callback = {new PersonProxy(),new PlayProxy()};

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
//        设置多个CallBack接口的实例    /setCallback(Callback)设置单个callback实例
        enhancer.setCallbacks(callback);
//        设置方法回调过滤器
        enhancer.setCallbackFilter(new CallbackImplenent());

        Person person = (Person) enhancer.create();

        person.eat();
        System.out.println("--------------------");
        person.play();
    }
}
