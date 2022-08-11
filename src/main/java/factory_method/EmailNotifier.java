package factory_method;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 14:53
 **/


public class EmailNotifier implements IMessageNotifier{
    @Override
    public void send(String msg) {
        System.out.println("send to email: " + msg);
    }
}
