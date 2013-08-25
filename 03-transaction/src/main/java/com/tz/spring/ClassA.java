package com.tz.spring;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-25
 */
public class ClassA {

    ClassB classB = new ClassB();

    void run(){
        String s = (String)MyThreadLocal.get("key");
        System.out.println("ClassA:"+s);
        MyThreadLocal.set("key", s + "_" + Math.random());
        classB.run();
    }


}
