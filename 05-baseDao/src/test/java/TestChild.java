import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 13-3-18
 * Time: 下午2:41
 * To change this template use File | Settings | File Templates.
 */
public class TestChild {

    @Test
    public void test1(){
        Parent parent = new Parent();
        System.out.println("==========");
        Child child = new Child();
        child.get();
        System.out.println(child.getClass().getName());
    }

}
