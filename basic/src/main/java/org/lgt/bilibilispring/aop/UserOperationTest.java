package org.lgt.bilibilispring.aop;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/22 22:11
 **/
public class UserOperationTest {
    public static void main(String[] args) {
       UserOperation userOperation = new UserOperationImpl();

       Class[] clazz = {UserOperation.class};
        UserOperation o = (UserOperation)Proxy.newProxyInstance(UserOperationTest.class.getClassLoader(), clazz, new UserOperationProxy(userOperation));
        System.out.println(o.add(1,2));
    }
}
