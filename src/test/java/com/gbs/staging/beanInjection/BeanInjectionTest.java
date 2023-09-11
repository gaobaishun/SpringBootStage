package com.gbs.staging.beanInjection;

import com.gbs.staging.test.beanInjectionTest.xml.XmlBeanInjectionSet;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
public class BeanInjectionTest {

    /**
     * 测试xml注入
     */
    @Test
    public void testXmlBeanInjection() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:beanInjectionTest/XmlBeanInjectionDemo.xml");
        XmlBeanInjectionSet xmlBeanInjectionSet = classPathXmlApplicationContext.getBean(XmlBeanInjectionSet.class);
        System.out.println("测试开始");
        System.out.println(xmlBeanInjectionSet);
    }

}
