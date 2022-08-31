package behavioural.strategy;

public class Blast implements ISecurity{
    @Override
    public String securityMeasure() {
        return "Blast security";
    }
}
