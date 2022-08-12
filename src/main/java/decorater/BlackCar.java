package decorater;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 22:51
 **/


public class BlackCar extends Car {
    private Car car;

    public BlackCar(Car car) {
        this.car = car;
    }

    @Override
    public String getName() {
        return "black " + car.getName();
    }
}
