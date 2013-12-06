package com.mycompany.spring.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Date: 13-11-26
 */

@Controller
@RequestMapping("/demo")
public class HelloController {

        @RequestMapping(value = "/xml", method = RequestMethod.GET, produces = "text/xml")
        @ResponseBody
        public User getXmlUser(){
            User user = new User();
            user.setName("jack");
            user.setPassword("123");
            return user;
        }

        @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
        @ResponseBody
        public User getJsonUser(){
            User user = new User();
            user.setName("mike");
            user.setPassword("456");
            return user;
        }

        @RequestMapping(value = "/html", method = RequestMethod.GET, produces = "text/html")
        public String getHtml(Model model){
            User user = new User();
            user.setName("mike");
            user.setPassword("456");
            model.addAttribute("user" , user);
            return "user";
        }

        @RequestMapping(value = "/file.xls", method = RequestMethod.GET)
        public void getFile(HttpServletRequest request, HttpServletResponse response){
            ServletContext application = request.getSession().getServletContext();
            String realPath = application.getRealPath("files");
            String fullPath = realPath + File.separator + "test.xls";

            response.setContentType("application/vnd.ms-excel");
            try {
                File downloadFile = new File(fullPath);
                FileInputStream inputStream = new FileInputStream(downloadFile);
                IOUtils.copy(inputStream, response.getOutputStream());
                response.flushBuffer();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
