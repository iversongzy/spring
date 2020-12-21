package org.lgt.bilibilispring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/1 23:52
 **/

@Repository(value = "userService")
public class UserService {

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    public void show() {
        System.out.println("enter show method.");
        userDao.show();
    }
}
