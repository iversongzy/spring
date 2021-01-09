package org.lgt.bilibilispring.ioc.bean.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/2 23:26
 **/
//使用Configuration注解作为配置类，代替xml配置文件
@Configuration
@ComponentScan(basePackages = {"org.lgt.bilibilispring.ioc"})
public class SpringConfig {

}
