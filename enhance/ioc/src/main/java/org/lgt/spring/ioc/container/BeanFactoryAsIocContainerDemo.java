package org.lgt.spring.ioc.container;

import org.lgt.spring.ioc.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Description
 * @Author liuguotai
 * @Date2021/1/11 23:48
 **/
public class BeanFactoryAsIocContainerDemo {
    public static void main(String[] args) {
        //BeanFactory factory = new ClassPathXmlApplicationContext("classpath:/META-INF/ioc-container-overview.xml");
        //创建BeanFactory容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // XML 配置文件 ClassPath 路径
        String location = "classpath:/META-INF/ioc-container-overview.xml";
        // 加载配置
        int beanDefinitionsCount = reader.loadBeanDefinitions(location);
        System.out.println("Bean 定义加载的数量：" + beanDefinitionsCount);
        //依赖查找
        lookupByNameRealTime(beanFactory);
    }

    public static void lookupByNameRealTime(BeanFactory beanFactory) {
        User user = (User) beanFactory.getBean("user");
        System.out.println(user);
    }
}
