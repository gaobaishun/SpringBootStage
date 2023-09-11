package com.gbs.staging.config.mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

public class MyLocaleResovler implements LocaleResolver {

    private Locale defaultLocale = Locale.getDefault();

    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        String i18n_language = request.getParameter("i18n_language");

        if(i18n_language!=null&&!i18n_language.isEmpty()&&!i18n_language.isBlank()){
            //如果没有设置对应参数使用默认的
            defaultLocale = StringUtils.parseLocale(i18n_language);
        }
        return defaultLocale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
