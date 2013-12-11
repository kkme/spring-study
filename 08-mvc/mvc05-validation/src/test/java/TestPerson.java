import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * User: Administrator
 * Date: 13-12-10
 */
public class TestPerson {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void test1() {
        Car car = new Car(null, "DD-AB-123", 4);
        Person person = new Person();
        person.setCar(car);

        Set<ConstraintViolation<Person>> constraintViolations =
                validator.validate(person);

        Assert.assertEquals(1, constraintViolations.size());
        Assert.assertEquals("不能为null" ,  constraintViolations.iterator().next().getMessage());
    }

}
