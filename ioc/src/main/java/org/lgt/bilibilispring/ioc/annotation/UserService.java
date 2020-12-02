package org.lgt.bilibilispring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/1 23:52
 **/

//@Component(value = "userService")

@Service
public class UserService {
    @Value(value = "lgt")
    private String name;
    @Autowired
    @Qualifier(value = "userDao")
    private UserDao userDao;

    public void show() {
        System.out.println("show method" + name);
        userDao.show();
    }
}
