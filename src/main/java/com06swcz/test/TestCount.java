package com06swcz.test;

import com06swcz.Config;
import com06swcz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCount {
    @Test
    public void testAccunt(){
        ApplicationContext context = new ClassPathXmlApplicationContext("until/Applicationswcl.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
