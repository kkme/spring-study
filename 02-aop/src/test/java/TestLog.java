import com.tz.spring.entity.Book;
import com.tz.spring.entity.Order;
import com.tz.spring.entity.User;
import com.tz.spring.service.BookService;
import com.tz.spring.service.OrderService;
import com.tz.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLog {


    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService)ac.getBean("userService");
        OrderService orderService = (OrderService)ac.getBean("orderService");
        BookService bookService = (BookService)ac.getBean("bookService");

        userService.save(new User());
		orderService.save(new Order());
		bookService.save(new Book());
    }

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService)ac.getBean("userService");

        String s = userService.getUserName(1);
        System.out.println("最终结果:"+s);
    }
	
}
