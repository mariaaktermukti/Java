// This file defines the Show class with overloaded methods
public class Show {
    // Method to display an integer
    void display(int number) {
        System.out.println("This is an integer: " + number);
    }

    // Method to display a string
    void display(String message) {
        System.out.println("This is a string: " + message);
    }

    // Method to display two integers
    void display(int number1, int number2) {
        System.out.println("These are two integers: " + number1 + " and " + number2);
    }
}
