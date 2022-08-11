package prototype;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 15:16
 **/


public class MMNotifier extends ThreadedNotifier{
    public MMNotifier() {

    }

    public void init(){
        System.out.println("loading mm notifier data");
    }

    @Override
    public ThreadedNotifierType getType() {
        return ThreadedNotifierType.MM;
    }

    @Override
    public void send(String msg) {
        System.out.println("mm: "+ msg);
    }
}
