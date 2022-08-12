package static_factory;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 22:22
 **/


public class main {
    public static void main(String[] args) {
        String x = String.valueOf(5);

        Vehicle v1 = new Vehicle("red");

        Vehicle v2 = Vehicle.newInstance("xx");
    }
}
