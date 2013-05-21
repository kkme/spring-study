import com.tz.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class TestSpring {

    @Test
    public void testUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-1.xml");
        //1.实例化容器
        System.out.println("=============分割线=============");
        //2.从容器中获取 bean
        User user = (User)ac.getBean("user");
        //3.输出测试信息
        System.out.println(user.hashCode());
        System.out.println(user);
    }

    @Test
    public void testString(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-2.xml");
        String str = (String)ac.getBean("string");
        System.out.println("str:"+str);

        String s = new String("我也是字符串");
        System.out.println(s);
    }

    @Test
    public void testInt(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-2.xml");
        Integer i = (Integer)ac.getBean("int");
        System.out.println("i:"+i);

        Integer i2 = new Integer(200);
        System.out.println("i2:"+i2);
    }

    @Test
    public void testList(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-3.xml");
        List list = (List)ac.getBean("list");
        System.out.println("list size:"+list.size());
        for(Object obj : list){
            System.out.println("迭代list元素:"+obj);
            System.out.println("元素类型:"+obj.getClass().toString());
        }
    }

    @Test
    public void testSet(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-3.xml");
        Set set = (Set)ac.getBean("set");
        System.out.println("set size:"+set.size());
        for(Object obj : set){
            System.out.println("迭代元素:"+obj);
            System.out.println("元素类型:"+obj.getClass().toString());
        }
    }

    @Test
    public void testMap(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-3.xml");
        Map<String,String> map = (Map<String,String>)ac.getBean("map");
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>)iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+", value:"+value);
        }
    }

    @Test
    public void testProps(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-3.xml");
        Properties props = (Properties)ac.getBean("props");
        System.out.println(props.getProperty("key1"));
        System.out.println(props.getProperty("key2"));
        System.out.println(props.getProperty("key3"));
    }

}
