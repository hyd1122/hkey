package com02.demo02;

import org.springframework.beans.factory.FactoryBean;
//工厂bean：在配置文件定义bean类型可以和返回类型不一样
//创建类，实现接口FactoryBean，让这个类作为工厂bean
//实现接口里面的方法，在实现的方法中定义返回的bean类型
public class MyBean implements FactoryBean<Course> {
//    定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("aaaaa");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
