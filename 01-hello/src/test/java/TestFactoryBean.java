import com.tz.spring.Car;
import com.tz.spring.User;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-24
 */
public class TestFactoryBean {

    @Test
    public void testUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-1.xml");
        Car car = (Car)ac.getBean("car");
        System.out.println(car);
        Car car2 = (Car)ac.getBean("car");
        System.out.println(car2);
        Car car3 = (Car)ac.getBean("car");
        System.out.println(car3);
    }

}
