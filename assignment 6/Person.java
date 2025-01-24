public class Person {
    private String name;

    // Default constructor
    public Person() {
        this.name = "Unknown";
    }

    // Parameterized constructor
    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person(); // Default constructor
        Person person2 = new Person("Alice"); // Parameterized constructor

        person1.display();
        person2.display();
    }
}
/*
Explanation:

Constructor overloading allows the creation of objects with different initializations.
The this keyword helps to refer to the current object's field.
*/