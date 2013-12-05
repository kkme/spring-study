package com.mycompany.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Date: 13-11-26
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

        @RequestMapping(method = RequestMethod.GET)
        public String sayHi(ModelMap modelMap){
        modelMap.addAttribute("message" , "Hello World!");
        return "hello";
    }

}
