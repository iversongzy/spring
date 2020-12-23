package org.lgt.bilibilispring.ioc.bean.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 23:29
 **/
public class BeanWithAnnotationTest {
    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean5.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.show();
    }

    @Test
    public void absAnnotationTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.show();
    }
}
