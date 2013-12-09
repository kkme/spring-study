package com.mycompany.spring.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * Date: 13-11-26
 */

@Controller
@RequestMapping("/demo")
public class HelloController {

        @RequestMapping("/test1")
        public String test1(Model model, User user){
            System.out.println(user);
            model.addAttribute("user" , user);
            return "result";
        }

        @RequestMapping("/test2")
        public String test2(Model model, UserListTo userListTo){
            System.out.println(userListTo);
            if(userListTo != null && userListTo.getUsers().size()>0){
                for(User user : userListTo.getUsers()){
                    System.out.println(user);
                }
            }
            model.addAttribute("users" , userListTo.getUsers());
            return "result2";
        }

        @RequestMapping("/test3")
        public String test3(Model model, @RequestParam("file") MultipartFile multipartFile
                    , HttpServletRequest request) throws IOException {
            //获得原来文件名(含后缀名)
            String originalFilename = multipartFile.getOriginalFilename();
            int pos = originalFilename.lastIndexOf(".");
            //原文件后缀名
            String suffix = originalFilename.substring(pos);
            //保存文件
            ServletContext application = request.getSession().getServletContext();
            String realPath = application.getRealPath("uploadFiles");
            //产生一个uuid随机文件名
            String uuid = UUID.randomUUID().toString();
            String fullPath = realPath + File.separator + uuid + suffix;
            System.out.println("fullPath:"+fullPath);
            FileUtils.copyInputStreamToFile(multipartFile.getInputStream(), new File(fullPath));
            model.addAttribute("originalFilename" , originalFilename);
            model.addAttribute("fullPath" , fullPath);
            return "result3";
        }



}
