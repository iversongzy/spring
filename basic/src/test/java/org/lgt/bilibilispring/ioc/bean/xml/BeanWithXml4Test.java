package org.lgt.bilibilispring.ioc.bean.xml;

import org.junit.Test;
import org.lgt.bilibilispring.ioc.bean.xml.autowire.Father;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 21:46
 **/
public class BeanWithXml4Test {
    @Test
    public void autoWireTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean4.xml");
        Father father = applicationContext.getBean("father", Father.class);
        System.out.println(father);
    }
}
