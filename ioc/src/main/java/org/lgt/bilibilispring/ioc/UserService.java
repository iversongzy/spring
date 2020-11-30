package org.lgt.bilibilispring.ioc;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/30 20:34
 **/
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("enter service add method");
        userDao.update();
    }
}
