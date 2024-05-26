import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = s.next();
        String rev = "";
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse of " + name + " is  "   + rev);
    }
}
