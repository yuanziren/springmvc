package com.shsxt.interceptor;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptorAdapter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /**
         * 1. 判断session中是否有登陆信息
         * */

        Object user = request.getSession().getAttribute("user");
        if(null!=user){// 登陆过
            return true;
        }else{
            System.out.println("goto login...");
            return false;
        }
    }

}
