package org.lgt.spring.ioc.dependency;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2021/1/9 15:43
 **/
public class LookUpCaseTest {

    @Test
    public void dependencyLookUpCase1() {
        BeanFactory factory = new ClassPathXmlApplicationContext("classpath:/META-INF/ioc-container-overview.xml");
        LookUpCase.lookupByNameRealTime(factory);
        LookUpCase.lookupByNameLazyTime(factory);
        LookUpCase.lookupByType(factory);
        LookUpCase.lookupByTypeAndName(factory);
        LookUpCase.lookupCollectionByType(factory);
        LookUpCase.lookupByAnnotationType(factory);

    }


}