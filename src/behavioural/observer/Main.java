package behavioural.observer;

import java.util.Arrays;

import static behavioural.observer.Domain.*;

public class Main {
    public static void main(String[] args){
        Message message = new Message("Meeting", "Hello everyone, meeting on August 10th 2022");
        CarCompany tesla = new CarCompany(2, "Tesla", AUTOMOBILE);
        CarCompany gmc = new CarCompany(4, "GMC", AUTOMOBILE);
        CarCompany ford = new CarCompany(3, "Ford", AUTOMOBILE);
        CarCompany rollsRoyce = new CarCompany(5, "Rolls Royce", AUTOMOBILE);
        CarCompany foton = new CarCompany(1, "Foton", AUTOMOBILE);
        MicrochipsCompany intel = new MicrochipsCompany(7, "Itel", TECHNOLOGY);
        MicrochipsCompany amd = new MicrochipsCompany(10, "AMD", TECHNOLOGY);
        MicrochipsCompany nvidia = new MicrochipsCompany(9, "Nvidia", TECHNOLOGY);
        MedicineCompany pfizer = new MedicineCompany(21, "Pfizer", HEALTH);
        MedicineCompany sanofi = new MedicineCompany(15, "Sanofi", HEALTH);
        Observable central = new CentralAdministration("BigComp", "USA", "New York");
        central.register(Arrays.asList(amd, nvidia, sanofi, pfizer, intel, foton, rollsRoyce, ford, gmc, tesla));
        central.notifyObservers(message);
        System.out.println("Tesla latest message: " + tesla.getLatestMessage());
        System.out.println("Foton latest message: " + foton.getLatestMessage());
        System.out.println("Sanofi latest message: " + sanofi.getLatestMessage());
    }
}
