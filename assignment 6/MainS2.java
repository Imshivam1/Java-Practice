
abstract class Geeks { //this is abstract class
    abstract void turnOn();//abstract method1(No implementation)
    abstract void turnOff();//abstract method2(No implementation)
}

// Concrete class implementing the abstract methods
class TVRemote extends Geeks {
    @Override
    void turnOn() {//concrete methods
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {//concrete methods(has implementations)
        System.out.println("TV is turned OFF.");
    }
}

// Main class to demonstrate abstraction
public class MainS2 {
    public static void main(String[] args) {
        Geeks remote = new TVRemote();//upcasting
        remote.turnOn(); //calls the overridden method in TvRemote class
        remote.turnOff(); 
    }
}