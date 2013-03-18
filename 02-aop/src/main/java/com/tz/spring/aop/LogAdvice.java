package com.tz.spring.aop;

import java.util.Date;
import org.aspectj.lang.JoinPoint;

/**
 * Log Advice 类
 */
public class LogAdvice {

    void log(JoinPoint jp){
        String className = jp.getTarget().getClass().getName();//取类名
        String methodName = jp.getSignature().getName();//取方法名
        System.out.println("[日志] "+new Date().toLocaleString()+" "+className+"的 "+methodName+" 方法运行了...");
    }

}
