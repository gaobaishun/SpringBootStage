package com.gbs.staging.config.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class TestLoginHandleInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {



        HttpSession session = request.getSession();
        String enableLoginCheck = request.getParameter("enableLoginCheck");
        String loginUser = (String)session.getAttribute("loginUser");
        if(enableLoginCheck!=null&&loginUser==null){
            request.setAttribute("message","请先登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }
        return true;
    }
}
