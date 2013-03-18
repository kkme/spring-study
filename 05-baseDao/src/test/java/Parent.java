import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Child 测试类
 */
public class Parent<T> {

    Class<T> c ;

    public Parent() {
        System.out.println("父类构造方法运行...");
        Class c = getClass();
        System.out.println(c.toString());
        Type type = c.getGenericSuperclass();
        System.out.println(type.toString());
        if(type instanceof ParameterizedType){
            Type[] types = ((ParameterizedType) type).getActualTypeArguments();
//            this.c = types[0].getClass();
            this.c = (Class<T>) types[0];
            System.out.println("========>"+c);
        }
    }

    public void get(){
        System.out.println("方法调用类型应为:"+c);
    }

}
