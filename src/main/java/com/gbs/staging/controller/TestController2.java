package com.gbs.staging.controller;

import com.gbs.staging.service.TestService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * restcontroller只能返回字符串，所以在restcontroller中redirect无效
 */
@RestController
public class TestController2 {

    private TestService testService;

    @Autowired
    public void setTestServive(TestService testService){
        this.testService=testService;
    };

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

    @RequestMapping("asyncTest")
    public String asyncTest(){
        testService.testAsync();
        return "success";
    }

}
