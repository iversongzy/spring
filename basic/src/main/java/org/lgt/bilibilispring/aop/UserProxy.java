package org.lgt.bilibilispring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 19:29
 *
 **/
@Component
@Aspect
public class UserProxy {

    @Pointcut(value = "execution(* org.lgt.bilibilispring.aop.User.show(..))")
    public void pointcut() {

    }

    @Before(value = "pointcut()")
    @Order(2)
    public void before() {
        System.out.println("enter to UserProxy before method");
    }

    @After(value = "pointcut()")
    public void after() {
        System.out.println("enter to UserProxy after method");
    }

    @AfterReturning(value = "pointcut()")
    public void afterReturning() {
        System.out.println("enter to UserProxy afterReturning method");
    }

    @AfterThrowing(value = "pointcut()")
    public void afterThrowing() {
        System.out.println("enter to UserProxy afterThrowing method");
    }

    @Around(value = "pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before");
        proceedingJoinPoint.proceed();
        System.out.println("after");
    }
}
