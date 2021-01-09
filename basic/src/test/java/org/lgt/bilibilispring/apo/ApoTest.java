package org.lgt.bilibilispring.apo;

import org.junit.Test;
import org.lgt.bilibilispring.aop.ConfigAopApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/25 23:24
 **/
public class ApoTest {

    @Test
    public void aopAspectTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-aop.xml");
        org.lgt.bilibilispring.aop.User user = context.getBean("user", org.lgt.bilibilispring.aop.User.class);
        user.show();
    }

    @Test
    public void aopAspectTest2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAopApp.class);
        org.lgt.bilibilispring.aop.User user = context.getBean("user", org.lgt.bilibilispring.aop.User.class);
        user.show();
    }

    @Test
    public void aopAspectTest3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-aop2.xml");
        org.lgt.bilibilispring.aop.User user = context.getBean("user", org.lgt.bilibilispring.aop.User.class);
        user.show();
    }


}