package prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 15:20
 **/


public class NotifierCache {
    private static Map<ThreadedNotifierType,ThreadedNotifier> map = new ConcurrentHashMap<>();

    private NotifierCache() {
    }

    public static ThreadedNotifier newNotifier(ThreadedNotifierType notifierType){
        return (ThreadedNotifier) map.get(notifierType).clone();
    }

    public static void init(){
        GChatNotifier gcNotifier = new GChatNotifier();
        gcNotifier.init();
        map.put(gcNotifier.getType(), gcNotifier);

        MMNotifier mmNotifier = new MMNotifier();
        mmNotifier.init();
        map.put(mmNotifier.getType(), mmNotifier);
    }
}
