package com.shsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("hello") //    /hello
    public String hello(){
        return "hello";
    }

    @RequestMapping("world") //    /world
    public String aa(){
        return "world";
    }

}
