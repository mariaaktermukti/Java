// This file contains the main method and uses the Show class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Show class
        Show show = new Show();

        // Calling different versions of the 'display' method
        show.display(5); // Calls the method that takes one integer
        show.display("Hello!"); // Calls the method that takes a string
        show.display(10, 20); // Calls the method that takes two integers
    }
}
