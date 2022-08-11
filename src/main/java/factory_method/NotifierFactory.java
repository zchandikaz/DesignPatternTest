package factory_method;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 14:55
 **/


public class NotifierFactory {
    private NotifierFactory(){}

    public static IMessageNotifier createNotifier(NotifierType notifierType){
        switch (notifierType){
            case EMAIL:
                return new EmailNotifier();
            case GCHAT:
                return new GoogleChatNotifier();
            case MATTERMOST:
                return new MattermostNotifier();
        }
        throw new NotImplementedException();
    }
}
