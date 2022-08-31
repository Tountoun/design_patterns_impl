package structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class Employee implements IPerson {
    private String firstname;
    private String lastname;
    private int age;
    private List<Skill> skills;
    public Employee(String firstname, String lastname, int age, List<Skill> skills){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.skills = skills;
    }
    @Override
    public double getSalary() {
        return 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public void welcome() {
        System.out.println("Welcome " + this.firstname + " " + this.lastname + ". It is a pleasure to having you in this company");
    }
}
