package com.gbs.staging.config.mvc;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * 自定义视图解析器
 */
public class MyViewResolver implements ViewResolver {


    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return null;
    }
}
