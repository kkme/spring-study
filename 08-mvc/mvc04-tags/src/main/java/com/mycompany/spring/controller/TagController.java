package com.mycompany.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Date: 13-11-26
 */

@Controller
@RequestMapping("/demo")
public class TagController {

    @RequestMapping(value = "/initAdd" , method = RequestMethod.GET)
    public String initAdd(Model model){
        //初始化 表单数据
        Map<String,String> genderMap = new LinkedHashMap<String,String>();
        genderMap.put("M", "男");
        genderMap.put("F", "女");

        Map<String,String> cityMap = new LinkedHashMap<String,String>();
        cityMap.put("beijing","北京");
        cityMap.put("shanghai","上海");
        cityMap.put("guangzhou","广州");

        Map<String,String> hobbyMap = new LinkedHashMap<String,String>();
        hobbyMap.put("swim" , "游泳");
        hobbyMap.put("football" , "足球");
        hobbyMap.put("game" , "游戏");
        hobbyMap.put("film" , "电影");

        //初始化 user 填充信息
        model.addAttribute("user", new User());
        model.addAttribute("genderMap", genderMap);
        model.addAttribute("cityMap", cityMap);
        model.addAttribute("hobbyMap", hobbyMap);
        return "userAdd";
    }

    @RequestMapping(value = "add" , method = RequestMethod.POST)
    public String test(Model model, User user){
        System.out.println(user);
        model.addAttribute("user" , user);
        return "result";
    }

}
