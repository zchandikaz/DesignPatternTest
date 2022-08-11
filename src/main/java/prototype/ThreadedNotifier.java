package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 15:11
 **/


public abstract class ThreadedNotifier implements Cloneable {

    public abstract ThreadedNotifierType getType();

    public abstract void send(String msg);

    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            Logger.getLogger("ThreadedNotifier").log(Level.SEVERE, "error while clone", e);
        }
        return null;
    }
}
