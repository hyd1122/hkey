package com.test;

import com.springtest01.Book;
import com.springtest01.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void testAdd(){
//       1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Application.xml");

//        2、获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    };

    @Test
    public void testSetBook(){
//       1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Application.xml");

//        2、获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();
    };
}
