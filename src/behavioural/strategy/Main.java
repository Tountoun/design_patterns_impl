package behavioural.strategy;

import static behavioural.strategy.Sex.FEMININ;
import static behavioural.strategy.Sex.MASCULIN;

public class Main {

    public static void main(String[] args){
        Person person = new Person("Mimi", FEMININ, 12, new Car());
        Person person1 = new Person("Gafa", MASCULIN, 34, new Blast());
        System.out.println(person.getSecurity());
        System.out.println(person1.getSecurity());
    }

}
