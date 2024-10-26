public class Employee {
    // Attributes
    int id;
    String name;

    // Constructor with parameters
    public Employee(int id, String name) {
        this.id = id;       // Initialize the id attribute
        this.name = name;   // Initialize the name attribute
    }

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
