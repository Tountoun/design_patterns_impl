package structural.decorator;

public class DeveloperDecorator extends EmployeeDecorator{
    public DeveloperDecorator(IPerson person) {
        super(person);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 100;
    }

    @Override
    public void welcome() {
        super.welcome();
        System.out.println("You are a great developer and we will work together");
    }
}
