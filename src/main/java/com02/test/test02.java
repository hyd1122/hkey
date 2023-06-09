package com02.test;


import com02.autowire.Emp;
import com02.bean.Orders;
import com02.demo02.Book;
import com02.demo02.Stu;
import com02.service.UserService;
import com03.config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test02 {
    @Test
    public void testArradd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Applicationarr.xml");

        Stu stu = context.getBean("stu", Stu.class);

        System.out.println(stu);
        stu.arradd();
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Applicationarr.xml");
    /*
    * 测试单实例和多实例
    * singleton和prototype区别,singleton是单实例，prototype是多实例对象
    * 设置scope值为singleton时候，加载spring配置文件时候就会创建单实例对象
    * 设置scope值为prototype时候，不是在加载spring配置文件的时候创建，而是在调用getBean方法时候创建多实例对象
    * */

        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

        System.out.println(book1);
        System.out.println(book2);
//        book.bookAdd();
    }

    @Test
    public void testClosBean(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("Applicationbean.xml");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("until/Applicationbean.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

//        手动让bean实例销毁
        context.close();
    }

    @Test
    public void testMyBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/ApplicationMyBean.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
        emp.test();
    }

    @Test
    public void testZhuJie(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Application03.xml");

        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
        userService.sysValue();
    }

    @Test
    public void testZhuJie2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
        userService.sysValue();
    }
}
