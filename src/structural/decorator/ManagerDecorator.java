package structural.decorator;

public class ManagerDecorator extends EmployeeDecorator{
    public ManagerDecorator(IPerson person) {
        super(person);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 200 ;
    }

    @Override
    public void welcome() {
        super.welcome();
        System.out.println("You are now the manager of here. Excited to work with you");
    }
}
