package com04aop.Proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)  //在增强类上面添加注解@Order（数字类型值），数字类型值越小优先级越高
public class PersonProxy {
    @Before("execution(* com04aop.User.add(..))")
    public void PersonBefore(){
        System.out.println("Person Before......");
    }
}
