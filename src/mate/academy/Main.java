package mate.academy;

public class Main {
    public static void main(String[] args) {

        Person bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);


        Person alice = new Student();
        alice.setName("Alice");
        alice.setAge(22);

        Person john = new Person();
        john.setAge(25);
        john.setName("John");

        Person[] persons = new Person[] {bob, alice, john};
        for (Person person : persons) {
            printInfo(person);
        }
    }

    public static void printInfo(Person person) {
        System.out.println(person.getPersonalInfo());
    }
}
