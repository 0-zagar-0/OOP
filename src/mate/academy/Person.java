package mate.academy;

public abstract class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }
    //age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //age + name
    public String getPersonalInfo() {
        return "age: " + age + ", name: " + name;
    }

    public abstract String sayHello();
}
