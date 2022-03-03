import java.text.MessageFormat;

public class Person {

    int id;
    String name;
    int birthYear;

    static int nextId = 1;

    public Person(String name, int birthYear) {
        this.id = nextId++;
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {
        id = nextId++;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void display() {
        System.out.println("Person");
        System.out.println("\tid: " + getId());
        System.out.println("\tName: " + getName());
        System.out.println("\tYear of birth: " + getBirthYear());
        System.out.println("\tCars:");
    }

    @Override
    public String toString() {
        return MessageFormat.format("({0}) {1}", id, name);
    }
}
