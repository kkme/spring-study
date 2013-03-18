import com.tz.spring.dao.UserDao;
import com.tz.spring.entity.User;
import com.tz.spring.service.UserService;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * User 单元测试类
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUser extends AbstractJUnit4SpringContextTests {

    @Resource
    private UserService userService;

    @Test
    public void test1Save(){
        User user = new User();
        user.setName("jack");
        user.setPassword("123");
        user.setAge(25);

        userService.save(user);
    }

    @Test
    public void test2Get(){
        String id = "944fb6a0-2723-443d-b68e-94c61d5b39b4";
        User user = userService.get(id);
        System.out.println(user);
    }

    @Test
    public void test3Login(){
        String name = "jack";
        String password = "1234";
        User user = userService.login(name,password);
        System.out.println(user);
    }

}
