package behavioural.strategy;

public class Bicycle implements ISecurity{

    @Override
    public String securityMeasure() {
        return "Bicycle security";
    }

}
