package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class CentralAdministration implements Observable{
    private ArrayList<Observer> obsevers;
    private String name;
    private String country;
    private String city;
    public CentralAdministration(String name, String country, String city){
        this.name = name;
        this.country = country;
        this.city = city;
        this.obsevers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        this.obsevers.add(observer);
    }

    @Override
    public void register(List<Observer> observers) {
        observers.stream()
                .forEach(observer -> this.register(observer));
    }

    @Override
    public void unregister(Observer observer) {
        if(this.obsevers.contains(observer)){
            this.obsevers.remove(observer);
        }
    }

    @Override
    public void unregister(List<Observer> observers) {
        observers.stream()
                .forEach(observer -> this.unregister(observer));
    }

    @Override
    public void notifyObservers(Message notificationMessage) {
        this.obsevers.forEach(observer -> observer.update(notificationMessage));
    }

    @Override
    public String toString() {
        return "CentralAdministration{" +
                "obsevers=" + obsevers +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
