package com.shsxt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("test01")
    public String test01(){
        return "redirect:v1.jsp?a=1&b=中国";//会出现中问乱码，前台取数据适合通过param来取
    }

    @RequestMapping("test02")
    public String test02(RedirectAttributes attr){//解决了中文乱码
        attr.addAttribute("a", "1");
        attr.addAttribute("b", "中国");
        return "redirect:v1.jsp";
    }

    @RequestMapping("test03")
    public String test03(){
        System.out.println("test03...");
        return "redirect:test04";
    }

    @RequestMapping("test04")
    public String test04(){
        System.out.println("test04...");
        return "hello";
    }


    @RequestMapping("test05")
    public String test05(){
        System.out.println("test05...");
        return "forward:test06";
    }

    @RequestMapping("test06")
    public String test06(){
        System.out.println("test06...");
        return "hello";
    }



}
