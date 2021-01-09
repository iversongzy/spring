package org.lgt.bilibilispring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 20:52
 **/
@Component
@Aspect
public class PersonProxy {

    @Before(value = "execution(* org.lgt.bilibilispring.aop.User.show(..))")
    @Order(1)
    public void before() {
        System.out.println("enter to personProxy method");
    }
}
