package com.tz.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Around Advice 类
 */
public class MyAroundAdvice {

    Object handle(ProceedingJoinPoint pjp){
        Object obj = null;
        System.out.println("运行前进行处理..."+obj);
        try {
            obj = pjp.proceed();//让原调用方法执行
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("程序运行出错!"+e.getMessage());
        }
        System.out.println("运行后进行处理..."+obj);
        //模拟:替换返回值中可能存在的敏感词
        if(obj instanceof String){
            String s = (String)obj;
            if(s.contains("敏感词")){
                s = s.replaceAll("敏感词", "***");
                obj = s;
            }
        }
        return obj;
    }

}

