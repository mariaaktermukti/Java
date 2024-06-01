abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Cars starts with keys");
    }
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("Scooter starts with kick");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        Scooter s=new Scooter();
        s.start();
    }
}