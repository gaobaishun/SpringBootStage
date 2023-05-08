package com.gbs.staging.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    /**
     * http://localhost:8080/hello 测试
     *
     */
    @RequestMapping("/hello")
    public String hello(){

        return "hello,world14";
    }
}
