package com.gbs.staging.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * restcontroller只能返回字符串，所以在restcontroller中redirect无效
 */
@Controller
public class TestController2 {

    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession httpSession
                        ){
        System.out.println(userName);
        System.out.println(password);
        if("gao".equals(userName)){
            httpSession.setAttribute("loginUser",userName);
            return "redirect:/loginSuccess.html";
            //return "loginSuccess";
        }else{
            return "index";
        }
    }
}
