
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Car IS-A Vehicle
        myCar.start();         // Inherited from Vehicle
        myCar.drive();         // Specific to Car
    }
}
// Main.java
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}