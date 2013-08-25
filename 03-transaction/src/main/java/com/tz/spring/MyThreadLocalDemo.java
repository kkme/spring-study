package com.tz.spring;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-25
 */
public class MyThreadLocalDemo extends Thread{

    ClassA classA = new ClassA();

    @Override
    public void run() {
        MyThreadLocal.set("key", getName());
        classA.run();
    }
}
