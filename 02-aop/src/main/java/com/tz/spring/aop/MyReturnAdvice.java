package com.tz.spring.aop;

import org.aspectj.lang.JoinPoint;
/**
 * Return Advice 类
 */
public class MyReturnAdvice {

    void handle(JoinPoint jp , Object result){
        String className = jp.getTarget().getClass().getName();//取类名
        int pos = className.lastIndexOf(".");
        className = className.substring(pos+1);//精简类名
        String methodName = jp.getSignature().getName();//取方法名

        System.out.println("[程序运行结果]"+className+" 的 "+methodName +" 方法，返回值:"+result);
    }
}

