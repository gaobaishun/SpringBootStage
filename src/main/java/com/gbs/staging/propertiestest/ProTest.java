package com.gbs.staging.propertiestest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

//指定配置文件
@PropertySource(value = "classpath:configtest.properties")
public class ProTest {
    //SPEL 表达式取出配置文件值
    @Value("${name}")
    private String name;



    @Override
    public String toString() {
        return "ProTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
