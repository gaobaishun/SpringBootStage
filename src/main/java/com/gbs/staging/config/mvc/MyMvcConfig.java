package com.gbs.staging.config.mvc;

import com.gbs.staging.config.interceptor.TestLoginHandleInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Spring Boot provides auto-configuration for Spring MVC that works well with most applications.
 *
 * The auto-configuration adds the following features on top of Spring’s defaults:
 *
 * Inclusion of ContentNegotiatingViewResolver and BeanNameViewResolver beans.
 * Support for serving static resources, including support for WebJars (see below).
 * Automatic registration of Converter, GenericConverter, Formatter beans.
 * Support for HttpMessageConverters (see below).
 * Automatic registration of MessageCodesResolver (see below).
 * Static index.html support.
 * Custom Favicon support (see below).
 * Automatic use of a ConfigurableWebBindingInitializer bean (see below).
 * If you want to keep Spring Boot MVC features, and you just want to add additional MVC configuration (interceptors, formatters, view controllers etc.) you can add your own @Configuration class of type WebMvcConfigurerAdapter, but without @EnableWebMvc. If you wish to provide custom instances of RequestMappingHandlerMapping, RequestMappingHandlerAdapter or ExceptionHandlerExceptionResolver you can declare a WebMvcRegistrationsAdapter instance providing such components.
 *
 * If you want to take complete control of Spring MVC, you can add your own @Configuration annotated with @EnableWebMvc.
 */

/**
 * 只加了configuration注解表示仍然保持mvc的默认特性
 * 参考官方文档https://docs.spring.io/spring-boot/docs/1.5.12.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResovler();
    }



    /**
     * 视图跳转
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //public和static都可以，优先到static找
        registry.addViewController("/jump").setViewName("/ViewControllerJump.html");
        //registry.addViewController("/loginSuccess.html").setViewName("/ViewControllerJump.html");
        registry.addViewController("/index").setViewName("/index.html");

    }



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
//        //request请求头中设置下参数
//        localeChangeInterceptor.setParamName("i18n_language");
//        //对所有请求拦截
//        registry.addInterceptor(localeChangeInterceptor).addPathPatterns("/**");

        //添加登录拦截器
        registry.addInterceptor(new TestLoginHandleInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/loginSuccess.html");

    }
}
