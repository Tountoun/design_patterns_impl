package behavioural.observer;

public class MedicineCompany extends Company {

    public MedicineCompany(int id, String name, Domain domain){
        super(id, name, domain);
    }

    @Override
    public void update(Message message) {
        this.latestMessage = message;
        // Other actions can be done here
    }
}
