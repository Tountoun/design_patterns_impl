package behavioural.observer;

import java.util.List;

public interface Observable {
    public void register(Observer observer);
    public void register(List<Observer> observers);
    public void unregister(Observer observer);
    public void unregister(List<Observer> observers);
    public void notifyObservers(Message notificationMessage);
}
