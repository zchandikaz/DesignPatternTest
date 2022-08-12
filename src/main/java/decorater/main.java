package decorater;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 22:52
 **/


public class main {
    public static void main(String[] args) {
        Car c = new Car();
        Car car = new BlackCar(c);

        System.out.println(c.getName());
        System.out.println(car.getName());
    }
}
