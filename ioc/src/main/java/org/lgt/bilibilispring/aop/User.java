package org.lgt.bilibilispring.aop;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 19:28
 **/
@Component
public class User {
    public void show() {
        System.out.println("enter to User class");
    }
}
