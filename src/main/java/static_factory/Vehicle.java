package static_factory;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 22:20
 **/


public class Vehicle  {

    /**
     * DON'T USE THIS USE {@link Vehicle#newInstance(String)}
     * @param color
     */
    @Deprecated
    public Vehicle(String color){}

    public static Vehicle newInstance(String color){
        return new Vehicle(color);
    }
}
