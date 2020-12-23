package org.lgt.bilibilispring.ioc.bean.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 21:46
 **/
public class BeanWithXmlTest {
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
}
