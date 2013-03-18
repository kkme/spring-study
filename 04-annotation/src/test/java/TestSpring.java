import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestSpring {

    @Test
    public void testDataSource(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource ds = (DataSource)ac.getBean("dataSource");
        if(ds != null){
            System.out.println("dataSource 实例化完成");
        }else{
            System.out.println("dataSource 实例化失败");
        }
    }

    @Test
    public void testSessionFactory(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory)ac.getBean("sessionFactory");

        if(sessionFactory != null){
            System.out.println("sessionFactory 实例化完成");
        }else{
            System.out.println("sessionFactory 实例化失败");
        }
    }

}