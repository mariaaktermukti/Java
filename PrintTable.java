import java.util.Scanner;
class PrintTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter a number that you want to print table    ");
        int no = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no + "*" + i + "=" + no * i);
        }
    }
}