package com.gbs.staging.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {
    
    @RequestMapping({"/router","/router/index"})
    public String routerIndex(){
        return "redirect:view/index.html";
    }

    @RequestMapping({"/router/index2"})
    public String routerIndex2(){
        return "index";
    }

    @RequestMapping({"/router/{id}"})
    public String routerIndex3(@PathVariable("id") int id){
        return "index";
    }
}
