class Vehicle {
    public void describe() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void describe() {
        super.describe(); // Calls the parent class method
        System.out.println("This is a car.");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.describe();
    }
}
