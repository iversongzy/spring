package org.lgt.spring.ioc.dependency;

import org.lgt.spring.ioc.domain.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2021/1/9 21:08
 **/
public class Inject {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/ioc-dependency-inject.xml");
        UserRepository repository = beanFactory.getBean("userRepository", UserRepository.class);
        System.out.println(repository.getUsers());
        System.out.println(repository.getBeanFactory());
        System.out.println(repository.getObjectFactory());
        System.out.println(repository.getObjectFactory().getObject() == beanFactory);
    }
}
