package com.shsxt.controller;


import com.shsxt.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
@RequestMapping("param")
public class ParamController {

    // 传统方式
    //http://localhost:8081/springmvc01/param/test01?name=zhangsan&age=19
    @RequestMapping("test01")
    public String test01(HttpServletRequest request){
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name + " : "+age);
        return "hello";
    }

    // 参数绑定方式1
    //http://localhost:8081/springmvc01/param/test02?name=zhangsan&age=18
    @RequestMapping("test02")
    public String test02(String name, Integer age){
        System.out.println(name + " : "+age);
        return "hello";
    }
    // 参数绑定方式2
    //http://localhost:8081/springmvc01/param/test03?name=zhangsan&age=20&phones[0].num=188123&phones[1].num=21321&map[name]=haha&map[age]=11&phone.num=1234
    @RequestMapping("test03")
    public String test03(User user){
        System.out.println(user);
        return "hello";
    }

    //http://localhost:8081/springmvc01/param/test04?ids=2&ids=3
    @RequestMapping("test04")
    public String test04(Integer[] ids){// 数组
        System.out.println(Arrays.toString(ids));
        return "hello";
    }

    //http://localhost:8081/springmvc01/param/test05?pageNum=2&pageSize=10
    @RequestMapping("test05")
    public String test05(@RequestParam(defaultValue = "1") Integer pageNum,
                         @RequestParam(defaultValue = "10") Integer pageSize){

        System.out.println(pageNum +":"+pageSize);
        return "hello";
    }


}
