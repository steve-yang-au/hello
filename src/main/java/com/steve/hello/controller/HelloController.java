package com.steve.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        //noinspection SpringMVCViewInspection
        return "hello world!";
    }
}
