package com.shsxt.controller;


import com.shsxt.po.Phone;
import com.shsxt.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("json")
public class JsonController {

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
