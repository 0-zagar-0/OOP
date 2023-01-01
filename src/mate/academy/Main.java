package mate.academy;

public class Main {
    public static void main(String[] args) {

        Person bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);


        Person alice = new Student();
        alice.setName("Alice");
        alice.setAge(22);

        Person john = new SuperStudent();
        john.setName("John");
        john.setAge(25);

        System.out.println(bob.sayHello());
        System.out.println(alice.sayHello());
        System.out.println(john.sayHello());
    }
}
