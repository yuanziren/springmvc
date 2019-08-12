package com.shsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("data")
@SessionAttributes({"userName"})//使用这个注解默认将传进来的数据存在session中，前台要想取session中的数据，就要从sessionScope中取
public class DataController {

    // 标准方式
    @RequestMapping("test01")
    public ModelAndView test01(String userName){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");// 返回视图
        mv.addObject("a", "shanghai");// 返回数据
        mv.addObject("userName", userName);// 返回数据
        return mv;
    }

    @RequestMapping("test02")
    public String test02(HttpServletRequest request){
        request.setAttribute("a", "sxt");
        return "hello";
    }

    @RequestMapping("test03")
    public String test03(HttpServletRequest request){
        request.getSession().setAttribute("a", "login");
        return "hello";
    }

    @RequestMapping("test04")
    public String test04(HttpSession session){
        session.setAttribute("a", "login02");
        return "hello";
    }

    @RequestMapping("test05")
    public String test05(Model model){
        model.addAttribute("a", "login03");
        return "hello";
    }

    @RequestMapping("test06")
    public String test06(Map map){
        map.put("a", "login04");
        return "hello";
    }




}
