public class twoDimention {
    public static void main(String[] args) {
        // 1. Create and initialize the 2D character array
        char[][] array = {
                {'H', 'e', 'l', 'l', 'o'},
                {'J', 'a', 'v', 'A'},
                {'W', 'o', 'r', 'l', 'd'}
        };

        // 2. Traverse and print elements of the third row using a foreach loop
        System.out.println("Elements of the third row:");
        for (char element : array[2]) { // array[2] refers to the third row
            System.out.print(element + " "); // Print each element in the third row
        }
    }
}
