public class Person {
    // Instance variables (name, age) are part of the object
    // Objects are stored in the heap
    String name; // Stored in the heap as part of the Person object
    int age;     // Stored in the heap as part of the Person object

    // Constructor
    public Person(String name, int age) {
        // "this.name" and "this.age" refer to the instance variables in the heap
        this.name = name; // Copies the reference of the "name" string into the heap
        this.age = age;   // Copies the value of the integer into the heap
    }

    public static void main(String[] args) {
        // The reference variable "person1" is allocated in the stack
        // The actual Person object is created in the heap
        Person person1 = new Person("Alice", 25);

        // Similarly, the reference variable "person2" is allocated in the stack
        // The actual Person object is created in the heap
        Person person2 = new Person("Bob", 30);

        // The string literals "Alice" and "Bob" are stored in the String pool (a part of the heap)
        // References to these strings are passed to the constructor

        // Local variables like "person1" and "person2" are stored in the stack
        // They point to the respective objects in the heap

        System.out.println("Person 1: " + person1.name + ", " + person1.age);
        System.out.println("Person 2: " + person2.name + ", " + person2.age);

        // "person1.name", "person1.age", "person2.name", and "person2.age"
        // Access instance variables from the heap through the stack references
    }
}
