package observer;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 23:20
 **/


public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void messageReceived(String msg) {
        System.out.println(name + " :: " + msg);
    }
}
