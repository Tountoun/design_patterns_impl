package structural.decorator;

import java.util.Arrays;

import static structural.decorator.Skill.*;

public class Main {
    public static void main(String[] args){
        Employee dev = new Employee("Tountoun Abel", "AYANOU", 21,
                Arrays.asList(
                        JAVA_DEVELOPER,
                        PROBLEM_SOLVING,
                        PROJECT_MANAGEMENT
                ));
        Employee des = new Employee("Mike", "ZOZOR", 23,
                Arrays.asList(
                        DESIGN,
                        PROBLEM_SOLVING
                ));
        dev.welcome();
        des.welcome();
        DeveloperDecorator decorator = new DeveloperDecorator(dev);
        DesignerDecorator decorator1 = new DesignerDecorator(des);
        decorator.welcome();
        decorator1.welcome();
    }
}
