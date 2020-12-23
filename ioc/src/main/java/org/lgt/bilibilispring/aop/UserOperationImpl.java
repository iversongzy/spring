package org.lgt.bilibilispring.aop;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/22 22:10
 **/
public class UserOperationImpl implements UserOperation {
    @Override
    public int add(int a, int b) {
        System.out.println("enter to UserOperationImpl method");
        return a + b;
    }
}
