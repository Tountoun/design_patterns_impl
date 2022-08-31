package behavioural.strategy;

public class Car implements ISecurity{
    @Override
    public String securityMeasure() {
        return "Car security";
    }
}
