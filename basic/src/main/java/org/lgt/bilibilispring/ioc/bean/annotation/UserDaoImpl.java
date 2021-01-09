package org.lgt.bilibilispring.ioc.bean.annotation;

import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/2 23:31
 **/

@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("this is dao method");
    }
}
