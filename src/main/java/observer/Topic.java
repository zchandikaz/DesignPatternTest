package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 23:20
 **/


public class Topic {
    List<Subscriber> subscriberList = new ArrayList<>();

    public void register(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unregister(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void post(String msg){
        subscriberList.forEach(v->v.messageReceived(msg));
    }
}
