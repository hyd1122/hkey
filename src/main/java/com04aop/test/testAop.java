package com04aop.test;

import com04aop.Book;
import com04aop.User;
import com04aop.configAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAop {
    @Test
    public void testAopbefore(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/ApplicationAop.xml");

        User user = context.getBean("user", User.class);

        user.add();
    }

    @Test
    public void testXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Applicationbook.xml");

        Book book = context.getBean("book", Book.class);

        book.buy();

    }

    @Test
    public void testAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(configAop.class);

        User user = context.getBean("user", User.class);

        user.add();
    }
}
