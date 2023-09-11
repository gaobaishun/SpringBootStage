package com.gbs.staging.config.beanInjection;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


//classpath：只会到你的class路径中查找找文件;
//classpath*：不仅包含class路径，还包括jar文件中(class路径)进行查找。

/**
 * 将配置文件中的bean加载到容器中去
 */
@Configuration
@ImportResource({"classpath:beanInjectionTest/XmlBeanInjectionDemo.xml"})
public class XmlBeanInjectionConfig {

}
