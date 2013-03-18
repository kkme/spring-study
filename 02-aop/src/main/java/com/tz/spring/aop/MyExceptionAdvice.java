package com.tz.spring.aop;

import org.aspectj.lang.JoinPoint;
/**
 * 异常 Advice 类
 */
public class MyExceptionAdvice {

    void handle(JoinPoint jp, Throwable e){
        String className = jp.getTarget().getClass().getName();//取类名
        int pos = className.lastIndexOf(".");
        className = className.substring(pos+1);//精简类名
        String methodName = jp.getSignature().getName();//取方法名

        //可能的异常处理方式：
        //1.打印到控制台
        System.out.println("[程序运行异常]"+className+" 的 "+methodName +" 方法："+e.getMessage());

        //2.保存到数据库
        //3.发送邮件给项目负责人(JavaMail API)
        //4.发送短信给项目负责人(SMS API，android etc...)
        //.....
    }

}
