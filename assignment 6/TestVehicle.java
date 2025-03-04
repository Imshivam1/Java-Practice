// Abstract class representing a Vehicle
abstract class Vehicle {
    String brand;

    // Abstract methods
    abstract int maxSpeed();
    public abstract String toString();

    // Abstract class constructor
    public Vehicle(String brand) {
        System.out.println("Vehicle constructor called");
        this.brand = brand;
    }

    // Concrete method
    public String getBrand() {
        return brand;
    }
}

// Concrete class representing a Car
class Car extends Vehicle {
    int horsepower;

    public Car(String brand, int horsepower) {
        // Calling Vehicle constructor
        super(brand);
        System.out.println("Car constructor called");
        this.horsepower = horsepower;
    }

    @Override
    int maxSpeed() {
        return horsepower * 2; // Just an assumption for example
    }

    @Override
    public String toString() {
        return "Car brand is " + super.getBrand() + " and max speed is: " + maxSpeed() + " km/h";
    }
}

// Concrete class representing a Bike
class Bike extends Vehicle {
    int cc;

    public Bike(String brand, int cc) {
        // Calling Vehicle constructor
        super(brand);
        System.out.println("Bike constructor called");
        this.cc = cc;
    }

    @Override
    int maxSpeed() {
        return cc / 2; // Just an assumption for example
    }

    @Override
    public String toString() {
        return "Bike brand is " + super.getBrand() + " and max speed is: " + maxSpeed() + " km/h";
    }
}

// Test class
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Tesla", 300);
        Vehicle v2 = new Bike("Yamaha", 200);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}
