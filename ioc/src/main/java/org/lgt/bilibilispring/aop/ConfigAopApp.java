package org.lgt.bilibilispring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/12/23 20:55
 **/
@Configuration
@ComponentScan(basePackages = {"org.lgt.bilibilispring.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAopApp {
}
