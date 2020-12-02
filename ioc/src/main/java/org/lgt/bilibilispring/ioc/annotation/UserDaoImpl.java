package org.lgt.bilibilispring.ioc.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/2 23:31
 **/

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("this is dao method");
    }
}
