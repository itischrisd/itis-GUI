package s25692.gui.oop.LABO01;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Person greetedPerson) {
        System.out.println("Hi " + greetedPerson.getName() + "!");
    }

    public String getName() {
        return name;
    }
}
