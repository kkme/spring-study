package com.mycompany.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * Date: 13-11-26
 */

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/initAdd" , method = RequestMethod.GET)
    public String initAdd(Model model){
        //init some data here...
        model.addAttribute("user", new User());
        return "userAdd";
    }

    @RequestMapping(value = "add" , method = RequestMethod.POST)
    public String test(Model model, @Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            //model.addAttribute("user", user);
            return "userAdd";
        }
        System.out.println(user);
        System.out.println(bindingResult);
        model.addAttribute("user" , user);
        return "result";
    }

}
