package behavioural.observer;

public class MicrochipsCompany extends Company{

    public MicrochipsCompany(int id, String name, Domain domain){
        super(id, name, domain);
    }

    @Override
    public void update(Message message) {
        this.latestMessage = message;
        // Other actions can be done here
    }

}
