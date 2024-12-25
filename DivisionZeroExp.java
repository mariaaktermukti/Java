public class DivisionZeroExp {
    public static void main(String args[]) {
        int a = 9;
        int b = 0;

        try {
            int c = a / b; // This will throw an ArithmeticException
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Example of array declaration and initialization
        int[] arr = new int[5]; // Declare an array of size 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; // Populate the array with sample values
        }

        // Print array values
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
