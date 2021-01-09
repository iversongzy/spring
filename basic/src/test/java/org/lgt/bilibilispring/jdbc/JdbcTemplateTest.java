package org.lgt.bilibilispring.jdbc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/26 22:59
 **/
public class JdbcTemplateTest {
    @Test
    public void add() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-jdbc.xml");
        BookService service = context.getBean("bookService", BookService.class);
        Order order = new Order();
        order.setId("10086");
        order.setDate("2020-12-26 00:00:00");
        order.setNum("10243185");
        service.addOrder(order);
    }

    @Test
    public void find() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-jdbc.xml");
        BookService service = context.getBean("bookService", BookService.class);
        System.out.println(service.find("10243185"));
    }

    @Test
    public void update() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-jdbc.xml");
        BookService service = context.getBean("bookService", BookService.class);
        Order order = new Order();
        order.setId("10243185");
        order.setDate("222");
        order.setNum("775");
        service.update(order);
    }

    @Test
    public void delete() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-jdbc.xml");
        BookService service = context.getBean("bookService", BookService.class);
        service.delete("1");
    }

    @Test
    public void findAll() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-jdbc.xml");
        BookService service = context.getBean("bookService", BookService.class);
        service.findAll();
    }
}
