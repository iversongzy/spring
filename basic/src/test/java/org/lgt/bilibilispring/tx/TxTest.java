package org.lgt.bilibilispring.tx;

import org.junit.Test;
import org.lgt.bilibilispring.ioc.bean.annotation.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/31 11:09
 **/
public class TxTest {

    @Test
    public void txTest1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-tx.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

    @Test
    public void txTest2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-tx2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

    @Test
    public void txTest3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

}
