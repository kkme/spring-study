import com.tz.spring.entity.Account;
import com.tz.spring.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Account 单元测试类
 */
public class TestAccount {

    @Test
    public void test1InitData(){
        Account account = new Account();
        account.setName("user1");
        account.setPassword("pass1");
        account.setBank("ICBC");
        account.setBalance(6000);

        Account account2 = new Account();
        account2.setName("user2");
        account2.setPassword("pass2");
        account2.setBank("ICBC");
        account2.setBalance(4000);

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService)ac.getBean("accountService");
        accountService.save(account);
        accountService.save(account2);
    }

    @Test
    public void test2Transfer(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService)ac.getBean("accountService");
        accountService.transfer(1, 2, 1000);
    }

}
