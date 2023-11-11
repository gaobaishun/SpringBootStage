package com.gbs.staging.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.customizers.OpenApiHateoasLinksCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import java.util.HashMap;

//访问http://localhost:8080/swagger-ui/index.html
//或者http://localhost:8080/swagger-ui.html
@Configuration
//
public class SwaggerConfig {


    @Bean
    public OpenAPI openAPI(Environment environment){
        Profiles profiles=Profiles.of("dev");

        //判断当前环境时是否是测试或者生产环境
        boolean b = environment.acceptsProfiles(profiles);
        System.out.println(profiles);
        return new OpenAPI().info(new Info()
                .title("测试title") // Api接口文档标题
                .description("测试description") // Api接口文档描述
                .version("测试version") // Api接口版本
                .termsOfService("https://example.com/") //Api接口的服务条款地址
                .license(swaggerLicense()) //授权许可
                .contact(swaggerContact()) //作者信息


        );
    }

    private License swaggerLicense(){
        return new License()
                .name("Apache 2.0")                         // 授权名称
                .url("http://springdoc.org")    // 授权信息
                .identifier("Apache-2.0")                   // 标识授权许可
                .extensions(new HashMap<String, Object>());// 使用Map配置信息（如key为"name","url","identifier"）
    }

    private Contact swaggerContact(){
        return new Contact()
                .name("gbs")                             // 作者名称
                .email("gaobaishun@foxmail.com")                   // 作者邮箱
                .url("https://www.cnblogs.com/gbs/")  // 介绍作者的URL地址
                .extensions(new HashMap<String, Object>()); // 使用Map配置信息（如key为"name","email","url"）
    }
}
