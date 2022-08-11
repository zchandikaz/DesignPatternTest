package prototype;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 15:25
 **/


public class main {
    public static void main(String[] args) {
        NotifierCache.init();

        NotifierCache.newNotifier(ThreadedNotifierType.MM).send("hi1");
        NotifierCache.newNotifier(ThreadedNotifierType.GCHAT).send("hi2");

        NotifierCache.newNotifier(ThreadedNotifierType.MM).send("hi11");
        NotifierCache.newNotifier(ThreadedNotifierType.GCHAT).send("hi22");
    }
}
