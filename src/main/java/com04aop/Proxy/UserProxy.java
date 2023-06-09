package com04aop.Proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

//    相同切入点抽取
    @Pointcut(value = "execution(* com04aop.User.add(..))")
    public void pointdemo(){

    }

//    前置通知
    @Before("execution(* com04aop.User.add(..))")
    public void before(){
        System.out.println("before......");
    }

    @After("execution(* com04aop.User.add(..))")
    public void after(){
        System.out.println("after......");
    }

    @AfterThrowing("execution(* com04aop.User.add(..))")
    public void AfterThrow(){
        System.out.println("AfterThrow......");
    }

    @AfterReturning("execution(* com04aop.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning......");
    }

    @Around("execution(* com04aop.User.add(..))")
    public void aroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前。。。。。。。");

        proceedingJoinPoint.proceed();

        System.out.println("环绕之后。。。。。。。");
    }
}
