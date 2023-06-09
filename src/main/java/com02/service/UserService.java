package com02.service;

import com02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;


@Component(value = "userService")
public class UserService {
    @Value(value = "你好啊")
    private String name;
//定义dao属性
//    @Autowired:根据属性类型进行自动装配
//    @Qualifier:根据名称进行注入且需要和@Autowired一起使用
//    @Resource:既可以根据名称也可以根据属性类型装配
//    @Value:注入普通类型属性

//    @Autowired
//    @Qualifier(value = "userDaoImpl1")
//    @Resource(name = "userDaoImpl1")
    @Resource
    private UserDao userDao;
    public void add(){
        System.out.println("service add........");
        userDao.add();
    }

    public void sysValue(){
        System.out.println(name);
    }
}
