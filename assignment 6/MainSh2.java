// Defining an Interface
interface Animal {
    void makeSound(); // Abstract method (no body)
}

// Class implementing the Interface
class Dog implements Animal {
    @Override
    public void makeSound() { // Implementing the method
        System.out.println("Dog barks!");
    }
}

// Main class
public class MainSh2 {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound(); // Calls the implemented method
    }
}
