package observer;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 23:24
 **/


public class main {
    public static void main(String[] args) {
        Topic topic = new Topic();

        topic.register(new Subscriber("A"));
        topic.register(new Subscriber("B"));
        topic.register(new Subscriber("C"));

        topic.post("anna araki panala gihin");
    }
}
