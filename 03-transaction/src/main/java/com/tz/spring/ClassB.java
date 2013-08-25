package com.tz.spring;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-25
 */
public class ClassB {
    public void run() {
        String s = (String)MyThreadLocal.get("key");
        System.out.println("ClassB:"+s);
    }
}
