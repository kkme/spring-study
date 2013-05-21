
import com.tz.spring.User;

import java.util.HashMap;
import java.util.Map;

public class TestReflect {

    public static void main(String[] args) {

        //模拟 spring 容器
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            try {
                //模拟初始化 bean
                Object obj = Class.forName("com.tz.spring.User").newInstance();
                //将 bean 保存到容器
                map.put("user", obj);

                //ac.getBean("user")
                User user = (User)map.get("user");
                System.out.println(user);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
	
}
