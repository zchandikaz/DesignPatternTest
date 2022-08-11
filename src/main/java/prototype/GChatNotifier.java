package prototype;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 15:16
 **/


public class GChatNotifier extends ThreadedNotifier{
    public GChatNotifier() {

    }

    public void init(){
        System.out.println("loading gchat notifier data");
    }

    @Override
    public ThreadedNotifierType getType() {
        return ThreadedNotifierType.GCHAT;
    }

    @Override
    public void send(String msg) {
        System.out.println("gc: "+ msg);
    }
}
