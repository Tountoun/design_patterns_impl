package behavioural.strategy;

public class Motorcycle implements ISecurity{
    @Override
    public String securityMeasure() {
        return "Motorcycle security";
    }
}
