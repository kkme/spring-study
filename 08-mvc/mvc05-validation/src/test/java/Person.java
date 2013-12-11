import javax.validation.Valid;

/**
 * User: Administrator
 * Date: 13-12-10
 */
public class Person {

    private String name;

    //Therefore the validation of a Person will fail if the car field is invalid.
    @Valid
    private Car car;

    public Person() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
