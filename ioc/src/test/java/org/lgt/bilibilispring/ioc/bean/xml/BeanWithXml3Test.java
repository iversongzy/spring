package org.lgt.bilibilispring.ioc.bean.xml;

import org.junit.Test;
import org.lgt.bilibilispring.ioc.bean.xml.lifecycle.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 21:46
 **/
public class BeanWithXml3Test {
    @Test
    public void lifeCycleTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean3.xml");
        Controller controller = context.getBean("controller", Controller.class);
        System.out.println("4th Step");
        context.close();
    }
}
