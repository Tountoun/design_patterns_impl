package behavioural.strategy;

public class Person {
    private String name;
    private int age;
    private Sex sex;
    private ISecurity security;

    public Person(String name, Sex sex, int age, ISecurity security){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.security = security;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Sex getSex() {
        return sex;
    }
    public String getSecurity() {
        return security.securityMeasure();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", security=" + security +
                '}';
    }
}
