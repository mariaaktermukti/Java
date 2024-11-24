// Movie Class
public class Movie {
    private String name; // Cannot be accessed outside the class
    String origin;       // Can only be accessed inside the same package
    public String genre; // Can be accessed from anywhere
    public float rating; // Can be accessed from anywhere

    // First parameterized constructor
    public Movie(String name, String origin, String genre, float rating) {
        this.name = name;
        this.origin = origin;
        this.genre = genre;
        this.rating = rating;
    }

    // Second parameterized constructor
    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'origin'
    public String getOrigin() {
        return origin;
    }

    // Setter for 'origin'
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // Method to display details
    public void Details() {
        System.out.println("You are watching " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }
}

