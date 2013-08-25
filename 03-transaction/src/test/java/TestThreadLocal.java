import com.tz.spring.MyThreadLocalDemo;
import org.junit.Test;

/**
 * User: Hu Jing Ling
 * Date: 2013-08-25
 */
public class TestThreadLocal {

    @Test
    public void test1(){
        MyThreadLocalDemo demo1 = new MyThreadLocalDemo();
        demo1.start();

        MyThreadLocalDemo demo2 = new MyThreadLocalDemo();
        demo2.start();
    }

}
