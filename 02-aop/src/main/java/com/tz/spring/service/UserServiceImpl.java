package com.tz.spring.service;

import com.tz.spring.entity.User;
import java.util.List;
import java.util.ArrayList;

public class UserServiceImpl implements UserService {

    @Override
    public List<Object> save(User user) {
        System.out.println("保存了 user..");
        List<Object> list = new ArrayList<Object>();
        list.add("s");
        list.add(1);
        list.add(true);
        list.add(user);

//        if(true){
//            throw new RuntimeException("随机异常!");
//        }

        return list;
    }

    @Override
    public String getUserName(int id) {
        return "我是敏感词";
    }

}
