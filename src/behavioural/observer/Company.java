package behavioural.observer;

public abstract class Company implements Observer{
    private int id;
    private String name;
    private Domain domain;
    protected Message latestMessage = null;
    public Company(int id, String name, Domain domain){
        this.id = id;
        this.name = name;
        this.domain = domain;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Domain getDomain() {
        return domain;
    }
    public Message getLatestMessage() {
        return latestMessage;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", domain=" + domain +
                ", latestMessage=" + latestMessage +
                '}';
    }
}
