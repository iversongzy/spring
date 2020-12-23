package org.lgt.bilibilispring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/22 22:16
 **/
public class UserOperationProxy implements InvocationHandler {

    private Object userOperation;

    public UserOperationProxy(Object userOperation) {
        this.userOperation = userOperation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before process method " + method.getName() + "parameter is " + Arrays.toString(args));
        Object res = method.invoke(userOperation, args);
        System.out.println("after process method " + method.getName());
        return res;
    }
}
