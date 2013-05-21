import com.tz.spring.entity.Account;
import com.tz.spring.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Account 单元测试类
 */
//指出使用当前项目的哪个主配置文件名称.
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAccount extends AbstractJUnit4SpringContextTests {

    @Resource
    private AccountService accountService;

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

        accountService.save(account);
        accountService.save(account2);
    }

    @Test
    public void test2Transfer(){
        Account account = new Account();
        account.setName("张三");

        String result = accountService.transfer(1, 2, 1000);
        System.out.println(result);
    }

}
