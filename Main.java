// Main.java
class Dog extends Animal {

//    void eat() {
//        System.out.println("I am eating");
//    }
//
//    void call(String name){
//        System.out.println("Hello I am calling "+name);
//    }


    void bark() {
        System.out.println("I am barking");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog();
        Dog dog2 = new Dog();

        // Demonstrating IS-A relationship
        dog.eat();   // Dog can use Animal's eat() method because Dog "IS-A" Animal
        dog.bark();
        // Dog's own method

        System.out.println(dog.houseName);

        // Creating an instance of Animal
        Animal animal = new Animal();
        animal.eat(); // Animal can only eat, it doesn't have bark method
    }
}
