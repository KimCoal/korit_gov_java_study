package _23_static.Person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person.showPopulation();
        Person person2 = new Person();
        Person.showPopulation();

        System.out.println(person1.NUM1 == person2.NUM1);
        System.out.println(person1.COUNTRY1 == person2.COUNTRY1);
        System.out.println(person1.NUM1.equals(person2.NUM1));
        System.out.println(person1.NUM1.hashCode());
        System.out.println(person2.NUM1.hashCode());



    }
}
