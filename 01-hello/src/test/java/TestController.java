import com.tz.spring.User;
import com.tz.spring.controller.UserController;
import com.tz.spring.dao.UserDao;
import com.tz.spring.dao.UserDaoImpl;
import com.tz.spring.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {

    @Test
    public void testController(){
        //拟造一个User
        User user = new User();
        user.setName("张三");
        user.setAge(40);

        //实例化容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext-4.xml");
        //从容器中获得Controller
        UserController userController = (UserController)ac.getBean("userController");
        //调用方法
        userController.save(user);
    }

    @Test
    public void testController2(){
        //拟造一个User
        User user = new User();
        user.setName("张三");
        user.setAge(40);

        //传统方式创建对象，维护对象之间关系
        UserController userController = new UserController();
        UserDao userDao = new UserDaoImpl();
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao);
        userController.setUserService(userService);

        //调用方法
        userController.save(user);
    }
	
}
