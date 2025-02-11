// Abstract class
abstract class Vehicle {
    abstract void start(); // Abstract method (no implementation)

    void stop() { // Concrete method (has implementation)
        System.out.println("Vehicle is stopping...");
    }
}

// Subclass that extends the abstract class
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or push button.");
    }
}

// Main class to demonstrate abstraction
public class MainSh {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Upcasting
        myCar.start(); // Calls the overridden method in Car
        myCar.stop();  // Calls the concrete method from Vehicle
    }
}
