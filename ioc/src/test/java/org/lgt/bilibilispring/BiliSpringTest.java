package org.lgt.bilibilispring;

import org.junit.Test;
import org.lgt.bilibilispring.ioc.*;
import org.lgt.bilibilispring.ioc.autowire.Father;
import org.lgt.bilibilispring.ioc.lifecycle.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/25 23:24
 **/
public class BiliSpringTest {

    @Test
    public void userTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean.xml");
        User user = context.getBean("user", User.class);
        user.hello();
    }

    @Test
    public void bookTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean.xml");
        Book book = context.getBean("book", Book.class);
        book.show();
    }

    @Test
    public void orderTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean.xml");
        Order order = context.getBean("order", Order.class);
        order.show();
    }

    @Test
    public void pbookTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean.xml");
        Book book = context.getBean("pbook", Book.class);
        book.show();
    }

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

    @Test
    public void lifeCycleTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean3.xml");
        Controller controller = context.getBean("controller", Controller.class);
        System.out.println("4th Step");
        context.close();
    }

    @Test
    public void autoWireTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean4.xml");
        Father father = applicationContext.getBean("father", Father.class);
        System.out.println(father);

    }



}