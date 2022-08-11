package factory_method;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 14:54
 **/


public class main {
    public static void main(String[] args) {
//        String userNType = "";
//        if(userNType=="GG"){
//            new GoogleChatNotifier().send("xx");
//        }

        String configNI = "GCHAT";

        NotifierFactory.createNotifier(NotifierType.valueOf(configNI)).send("hi1");
    }
}
