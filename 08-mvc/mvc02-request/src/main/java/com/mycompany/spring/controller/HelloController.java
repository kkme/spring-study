package com.mycompany.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * Date: 13-11-26
 */

@Controller
@RequestMapping("/demo")
public class HelloController {

        @RequestMapping
        public String sayHi(Model model, User user){
            System.out.println(user);
            model.addAttribute("user" , user);
            return "hello";
        }

}
