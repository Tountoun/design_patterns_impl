package structural.decorator;

public abstract class EmployeeDecorator implements IPerson{
    IPerson person = null;
    public EmployeeDecorator(IPerson person){
        this.person = person;
    }

    @Override
    public double getSalary() {
        return person.getSalary();
    }

    @Override
    public void welcome() {
        person.welcome();
    }
}
