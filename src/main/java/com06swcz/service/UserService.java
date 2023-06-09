package com06swcz.service;

import com06swcz.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false,timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ) //这个注解可以添加到类上面，也可以添加到方法上面
public class UserService {
    @Autowired
    private UserDao userDao;


    public void accountMoney(){
        userDao.reduceMoney();

        int i = 10/0;

        userDao.addMoney();
    }
}
