package com.tz.spring;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-25
 */
public class MyThreadLocal {

    //私有静态变量
    private static ThreadLocal<Map<String,Object>> threadLocal = new ThreadLocal<Map<String,Object>>(){
        @Override
        protected Map<String,Object> initialValue()
        {
            return new HashMap<String,Object>();
        }
    };

    public static Object get(String key){
        return threadLocal.get().get(key);
    }

    public static void set(String key, Object value){
        threadLocal.get().put(key, value);
    }

    public static void remove(){
        threadLocal.remove();
    }

}
