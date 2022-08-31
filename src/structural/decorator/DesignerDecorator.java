package structural.decorator;

public class DesignerDecorator extends EmployeeDecorator{
    public DesignerDecorator(IPerson person) {
        super(person);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 50;
    }

    @Override
    public void welcome() {
        super.welcome();
        System.out.println("You are a great designer");
    }
}
