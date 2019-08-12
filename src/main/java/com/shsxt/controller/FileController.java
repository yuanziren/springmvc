package com.shsxt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileController {

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(HttpServletRequest request){
        MultipartHttpServletRequest mr=(MultipartHttpServletRequest) request;
        MultipartFile file = mr.getFile("file");// 获取上传文件

        String path=request.getSession().getServletContext().getRealPath("upload");
        System.out.println(path);

        if(null!=file && !file.isEmpty()){
            // 获取上传文件名
            String filename = file.getOriginalFilename();
            // 上传
            try {
                file.transferTo(new File(path, filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }
}
