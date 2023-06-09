package com.test;

import com.bean.Emp;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test02 {
    @Test
    public void testUserAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Application01.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Application02.xml");

        Emp emp = context.getBean("emp", Emp.class);

        emp.empAdd();
    }
}
