package org.lgt.bilibilispring.ioc.bean.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 21:46
 **/
public class BeanWithXml2Test {
    @Test
    public void userServiceTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean2.xml");
        UserService userService = applicationContext.getBean("userService2", UserService.class);
        userService.add();
    }

    @Test
    public void dependencyTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean2.xml");
        Dependency dependency = applicationContext.getBean("dependency", Dependency.class);
        dependency.show();
    }

    @Test
    public void factorybeanTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean2.xml");
        Book book1 = applicationContext.getBean("myFactoryBean", Book.class);
        Book book2 = applicationContext.getBean("myFactoryBean", Book.class);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
