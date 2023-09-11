package com.gbs.staging.controller;

import com.gbs.outRangeBean.OutRangeBean;
import com.gbs.staging.test.beanInjectionTest.xml.XmlBeanInjectionSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.logging.XMLFormatter;

@RestController
public class TestController {

    private XmlBeanInjectionSet xmlBeanInjectionSet;

    private OutRangeBean outRangeBean;

    @Autowired
    public void setXmlBeanInjectionSet(XmlBeanInjectionSet xmlBeanInjectionSet) {
        this.xmlBeanInjectionSet = xmlBeanInjectionSet;
    }

    @Autowired
    public void setOutRangeBean(OutRangeBean outRangeBean) {
        this.outRangeBean = outRangeBean;
    }

    @Autowired
    MessageSource messageSource;


    /**
     * http://localhost:8080/hello 测试
     *
     */
    @RequestMapping("/hello")
    public String hello(){

        return "hello,world10";
    }

    //国际化
    @RequestMapping("/i18nTest")
    public String i18nTest(){
        Locale locale = LocaleContextHolder.getLocale();

        Object[] s={};
        String test = messageSource.getMessage("test", s, locale);
        return test;
    }

    @RequestMapping("/xmlBeanInjection")
    public String testXmlBeanInjection(){

        return xmlBeanInjectionSet.toString();
    }


    @RequestMapping("/annotationBeanInjection")
    public String testAnnotationBeanInjection(){

        return outRangeBean.toString();
    }


}
