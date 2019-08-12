package com.shsxt.controller;


import com.shsxt.po.Phone;
import com.shsxt.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    @ResponseBody
    public String login(User user, HttpSession session){
        /***
         * 存session
         * */
        System.out.println(user);
        session.setAttribute("user", user);// 登陆状态
        return "登陆成功";
    }

    @RequestMapping("queryUser")
    @ResponseBody
    public User queryUser(){
        User user = new User();
        user.setName("abc");
        user.setAge(18);
        Phone phone = new Phone();
        phone.setNum(12345);
        user.setPhone(phone);
        return user;
    }


}
