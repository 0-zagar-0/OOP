package mate.academy;

public class Main {
    public static void main(String[] args) {

        Employee bob = new Employee(100);
        bob.setName("Bob");
        bob.setAge(23);


        Student alice = new Student();
        alice.setName("Alice");
        alice.setAge(22);
        alice.setFavoriteSubject("Math");//alice

        System.out.println(bob.getPersonalInfo());
        System.out.println(alice.getPersonalInfo());
    }
}
