import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for Reverse  ");
        int no = s.nextInt();
        int Reverse = 0;
        int rem;
        while (no != 0) {
            rem = no % 10;
            Reverse = Reverse * 10 + rem;
            no = no/10;
        }
        System.out.println(Reverse);
    }
}
